package io.cvm.asm.core;

import io.cvm.asm.antlr.CVMasmLexer;
import io.cvm.asm.antlr.CVMasmParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class ParserFacade {

    public ParserFacade(String file){
        try {
            CVMasmLexer lexer = new CVMasmLexer(new ANTLRFileStream(file));
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CVMasmParser parser = new CVMasmParser(commonTokenStream);
            parser.setBuildParseTree(true);
            OpcodeListener listener = new OpcodeListener();
            CVMasmParser.ProgramContext programContext = parser.program();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener, programContext);
            listener.generate(file+".bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
