package io.cvm.asm.test;

import io.cvm.asm.core.Opcodes;
import io.cvm.asm.core.ParserFacade;

public class Test {

    public static void main(String[] args){
        Opcodes.all_opcodes();
        ParserFacade parserFacade = new ParserFacade(args[0]);
    }
}
