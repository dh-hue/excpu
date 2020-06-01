package io.cvm.asm.core;

import io.cvm.asm.antlr.CVMasmBaseListener;
import io.cvm.asm.antlr.CVMasmParser;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class OpcodeListener extends CVMasmBaseListener{

    public interface OpCmd {
        byte length();
        byte[] bytes();
    }

    public int length;

    public static class HaltCmd implements OpCmd{

        @Override
        public byte length() {
            return 2;
        }

        @Override
        public byte[] bytes() {
            return ByteUtils.fromShort(Opcodes.HLT);
        }
    }

    ArrayList<OpCmd> opCmds = new ArrayList<>();

    @Override
    public void enterAdd_cmd(CVMasmParser.Add_cmdContext ctx) {
        addopcmd(ArithmeticOpcodes.code(Opcodes.ADD, ctx.INT(0).getText(), ctx.INT(1).getText(), ctx.OFF().getText()));
        super.enterAdd_cmd(ctx);
    }

    @Override
    public void enterSub_cmd(CVMasmParser.Sub_cmdContext ctx) {
        addopcmd(ArithmeticOpcodes.code(Opcodes.SUB, ctx.INT(0).getText(), ctx.INT(1).getText(), ctx.OFF().getText()));
        super.enterSub_cmd(ctx);
    }

    @Override
    public void enterMul_cmd(CVMasmParser.Mul_cmdContext ctx) {
        addopcmd(ArithmeticOpcodes.code(Opcodes.MUL, ctx.INT(0).getText(), ctx.INT(1).getText(), ctx.OFF().getText()));
        super.enterMul_cmd(ctx);
    }

    @Override
    public void enterHalt_cmd(CVMasmParser.Halt_cmdContext ctx) {
        addopcmd(new HaltCmd());
        super.enterHalt_cmd(ctx);
    }

    private void addopcmd(OpCmd opCmd) {
        opCmds.add(opCmd);
        length += opCmd.length();
    }

    @Override
    public void enterDiv_cmd(CVMasmParser.Div_cmdContext ctx) {
        addopcmd(ArithmeticOpcodes.code(Opcodes.DIV, ctx.INT(0).getText(), ctx.INT(1).getText(), ctx.OFF().getText()));
        super.enterDiv_cmd(ctx);
    }

    @Override
    public void enterMov_cmd(CVMasmParser.Mov_cmdContext ctx) {
        addopcmd(MemoryOpcodes.code(Opcodes.MOV, ctx.OFF(0).getText(), ctx.OFF(1).getText()));
        super.enterMov_cmd(ctx);
    }

    @Override
    public void enterCpy_cmd(CVMasmParser.Cpy_cmdContext ctx) {
        addopcmd(MemoryOpcodes.code(Opcodes.CPY, ctx.OFF(0).getText(), ctx.OFF(1).getText()));
        super.enterCpy_cmd(ctx);
    }

    private String getOTYPE(CVMasmParser.OtypeContext ctx){
        if(ctx.INT() != null) return ctx.INT().getText();
        else if(ctx.CHARACTER() != null) {
            int character = (int)ctx.CHARACTER().getText().charAt(1);
            return "0x"+Integer.toHexString(character);
        }
        else return ctx.getText();
    }

    @Override
    public void enterOut_cmd(CVMasmParser.Out_cmdContext ctx) {
        addopcmd(OutputOpcodes.Mono.code(ctx.OFF().getText(), getOTYPE(ctx.otype()), ctx.INT().getText()));
        super.enterOut_cmd(ctx);
    }

    public void generate(String filename){
        ByteBuffer buffer = ByteBuffer.allocate(length + opCmds.size());
        opCmds.forEach((opcmd) -> {
            buffer.put(opcmd.length());
            buffer.put(opcmd.bytes());
        });
        buffer.flip();
        try {
            Files.write(Paths.get(filename), buffer.array());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}