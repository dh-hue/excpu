// Generated from /home/nikhil/super/cvm/asm/CVMasm.g4 by ANTLR 4.7
package io.cvm.asm.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CVMasmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE=1, MOVEL=2, INT=3, OFF=4, ADD=5, SUB=6, MUL=7, DIV=8, COPY=9, COPYL=10, 
		OUT=11, OUTL=12, SET=13, SETL=14, HALT=15, BEGIN=16, END=17, EOS=18, STRING=19, 
		CHARACTER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LETTER", "HEXDIGIT", "MOVE", "MOVEL", "INT", "OFF", "ADD", "SUB", "MUL", 
		"DIV", "COPY", "COPYL", "OUT", "OUTL", "SET", "SETL", "HALT", "BEGIN", 
		"END", "EOS", "STRING", "CHARACTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "'movl'", null, null, "'add'", "'sub'", "'mul'", "'div'", 
		"'cpy'", "'cpyl'", "'out'", "'outl'", "'set'", "'setl'", "'hlt'", "'begin'", 
		"'end'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MOVE", "MOVEL", "INT", "OFF", "ADD", "SUB", "MUL", "DIV", "COPY", 
		"COPYL", "OUT", "OUTL", "SET", "SETL", "HALT", "BEGIN", "END", "EOS", 
		"STRING", "CHARACTER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CVMasmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CVMasm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\5\2\64\n\2\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\6\6F\n\6\r\6\16\6G\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u008a\n\26\f\26"+
		"\16\26\u008d\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\u008b\2\31\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\3\2\5\4\2C\\c|\5\2\62"+
		";CHch\5\2\13\f\17\17\"\"\2\u0098\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\78\3\2\2\2\t<\3\2\2\2\13A\3\2\2"+
		"\2\rI\3\2\2\2\17L\3\2\2\2\21P\3\2\2\2\23T\3\2\2\2\25X\3\2\2\2\27\\\3\2"+
		"\2\2\31`\3\2\2\2\33e\3\2\2\2\35i\3\2\2\2\37n\3\2\2\2!r\3\2\2\2#w\3\2\2"+
		"\2%{\3\2\2\2\'\u0081\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0090\3\2"+
		"\2\2/\u0094\3\2\2\2\61\64\t\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\63\62\3"+
		"\2\2\2\64\4\3\2\2\2\65\67\t\3\2\2\66\65\3\2\2\2\67\6\3\2\2\289\7o\2\2"+
		"9:\7q\2\2:;\7x\2\2;\b\3\2\2\2<=\7o\2\2=>\7q\2\2>?\7x\2\2?@\7n\2\2@\n\3"+
		"\2\2\2AB\7\62\2\2BC\7z\2\2CE\3\2\2\2DF\5\5\3\2ED\3\2\2\2FG\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2H\f\3\2\2\2IJ\7%\2\2JK\5\13\6\2K\16\3\2\2\2LM\7c\2\2M"+
		"N\7f\2\2NO\7f\2\2O\20\3\2\2\2PQ\7u\2\2QR\7w\2\2RS\7d\2\2S\22\3\2\2\2T"+
		"U\7o\2\2UV\7w\2\2VW\7n\2\2W\24\3\2\2\2XY\7f\2\2YZ\7k\2\2Z[\7x\2\2[\26"+
		"\3\2\2\2\\]\7e\2\2]^\7r\2\2^_\7{\2\2_\30\3\2\2\2`a\7e\2\2ab\7r\2\2bc\7"+
		"{\2\2cd\7n\2\2d\32\3\2\2\2ef\7q\2\2fg\7w\2\2gh\7v\2\2h\34\3\2\2\2ij\7"+
		"q\2\2jk\7w\2\2kl\7v\2\2lm\7n\2\2m\36\3\2\2\2no\7u\2\2op\7g\2\2pq\7v\2"+
		"\2q \3\2\2\2rs\7u\2\2st\7g\2\2tu\7v\2\2uv\7n\2\2v\"\3\2\2\2wx\7j\2\2x"+
		"y\7n\2\2yz\7v\2\2z$\3\2\2\2{|\7d\2\2|}\7g\2\2}~\7i\2\2~\177\7k\2\2\177"+
		"\u0080\7p\2\2\u0080&\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7f\2\2\u0084(\3\2\2\2\u0085\u0086\7=\2\2\u0086*\3\2\2\2\u0087\u008b"+
		"\7$\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7$\2\2\u008f,\3\2\2\2\u0090\u0091\7)\2\2\u0091\u0092"+
		"\13\2\2\2\u0092\u0093\7)\2\2\u0093.\3\2\2\2\u0094\u0095\t\4\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\b\30\2\2\u0097\60\3\2\2\2\7\2\63\66G\u008b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}