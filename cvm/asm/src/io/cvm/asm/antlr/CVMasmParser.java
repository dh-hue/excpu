// Generated from /home/nikhil/super/cvm/asm/CVMasm.g4 by ANTLR 4.7
package io.cvm.asm.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CVMasmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE=1, MOVEL=2, INT=3, OFF=4, ADD=5, SUB=6, MUL=7, DIV=8, COPY=9, COPYL=10, 
		OUT=11, OUTL=12, SET=13, SETL=14, HALT=15, BEGIN=16, END=17, EOS=18, STRING=19, 
		CHARACTER=20, WS=21;
	public static final int
		RULE_add_cmd = 0, RULE_sub_cmd = 1, RULE_mul_cmd = 2, RULE_div_cmd = 3, 
		RULE_addv_cmd = 4, RULE_subv_cmd = 5, RULE_mulv_cmd = 6, RULE_divv_cmd = 7, 
		RULE_set_cmd = 8, RULE_setl_cmd = 9, RULE_otype = 10, RULE_out_cmd = 11, 
		RULE_outl_cmd = 12, RULE_mov_cmd = 13, RULE_movl_cmd = 14, RULE_cpy_cmd = 15, 
		RULE_cpyl_cmd = 16, RULE_halt_cmd = 17, RULE_cmd = 18, RULE_cmdlist = 19, 
		RULE_program = 20;
	public static final String[] ruleNames = {
		"add_cmd", "sub_cmd", "mul_cmd", "div_cmd", "addv_cmd", "subv_cmd", "mulv_cmd", 
		"divv_cmd", "set_cmd", "setl_cmd", "otype", "out_cmd", "outl_cmd", "mov_cmd", 
		"movl_cmd", "cpy_cmd", "cpyl_cmd", "halt_cmd", "cmd", "cmdlist", "program"
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

	@Override
	public String getGrammarFileName() { return "CVMasm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CVMasmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Add_cmdContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CVMasmParser.ADD, 0); }
		public List<TerminalNode> INT() { return getTokens(CVMasmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CVMasmParser.INT, i);
		}
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Add_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterAdd_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitAdd_cmd(this);
		}
	}

	public final Add_cmdContext add_cmd() throws RecognitionException {
		Add_cmdContext _localctx = new Add_cmdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_add_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ADD);
			setState(43);
			match(INT);
			setState(44);
			match(INT);
			setState(45);
			match(OFF);
			setState(46);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_cmdContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(CVMasmParser.SUB, 0); }
		public List<TerminalNode> INT() { return getTokens(CVMasmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CVMasmParser.INT, i);
		}
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Sub_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterSub_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitSub_cmd(this);
		}
	}

	public final Sub_cmdContext sub_cmd() throws RecognitionException {
		Sub_cmdContext _localctx = new Sub_cmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sub_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(SUB);
			setState(49);
			match(INT);
			setState(50);
			match(INT);
			setState(51);
			match(OFF);
			setState(52);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_cmdContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(CVMasmParser.MUL, 0); }
		public List<TerminalNode> INT() { return getTokens(CVMasmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CVMasmParser.INT, i);
		}
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Mul_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterMul_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitMul_cmd(this);
		}
	}

	public final Mul_cmdContext mul_cmd() throws RecognitionException {
		Mul_cmdContext _localctx = new Mul_cmdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mul_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(MUL);
			setState(55);
			match(INT);
			setState(56);
			match(INT);
			setState(57);
			match(OFF);
			setState(58);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Div_cmdContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(CVMasmParser.DIV, 0); }
		public List<TerminalNode> INT() { return getTokens(CVMasmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CVMasmParser.INT, i);
		}
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Div_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterDiv_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitDiv_cmd(this);
		}
	}

	public final Div_cmdContext div_cmd() throws RecognitionException {
		Div_cmdContext _localctx = new Div_cmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_div_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(DIV);
			setState(61);
			match(INT);
			setState(62);
			match(INT);
			setState(63);
			match(OFF);
			setState(64);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Addv_cmdContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CVMasmParser.ADD, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Addv_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addv_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterAddv_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitAddv_cmd(this);
		}
	}

	public final Addv_cmdContext addv_cmd() throws RecognitionException {
		Addv_cmdContext _localctx = new Addv_cmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addv_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ADD);
			setState(67);
			match(OFF);
			setState(68);
			match(OFF);
			setState(69);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subv_cmdContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(CVMasmParser.SUB, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Subv_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subv_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterSubv_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitSubv_cmd(this);
		}
	}

	public final Subv_cmdContext subv_cmd() throws RecognitionException {
		Subv_cmdContext _localctx = new Subv_cmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subv_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SUB);
			setState(72);
			match(OFF);
			setState(73);
			match(OFF);
			setState(74);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mulv_cmdContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(CVMasmParser.MUL, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Mulv_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulv_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterMulv_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitMulv_cmd(this);
		}
	}

	public final Mulv_cmdContext mulv_cmd() throws RecognitionException {
		Mulv_cmdContext _localctx = new Mulv_cmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mulv_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(MUL);
			setState(77);
			match(OFF);
			setState(78);
			match(OFF);
			setState(79);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Divv_cmdContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(CVMasmParser.DIV, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Divv_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divv_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterDivv_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitDivv_cmd(this);
		}
	}

	public final Divv_cmdContext divv_cmd() throws RecognitionException {
		Divv_cmdContext _localctx = new Divv_cmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divv_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(DIV);
			setState(82);
			match(OFF);
			setState(83);
			match(OFF);
			setState(84);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_cmdContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CVMasmParser.SET, 0); }
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode INT() { return getToken(CVMasmParser.INT, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Set_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterSet_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitSet_cmd(this);
		}
	}

	public final Set_cmdContext set_cmd() throws RecognitionException {
		Set_cmdContext _localctx = new Set_cmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_set_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(SET);
			setState(87);
			match(OFF);
			setState(88);
			match(INT);
			setState(89);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setl_cmdContext extends ParserRuleContext {
		public TerminalNode SETL() { return getToken(CVMasmParser.SETL, 0); }
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public List<TerminalNode> INT() { return getTokens(CVMasmParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CVMasmParser.INT, i);
		}
		public Setl_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setl_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterSetl_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitSetl_cmd(this);
		}
	}

	public final Setl_cmdContext setl_cmd() throws RecognitionException {
		Setl_cmdContext _localctx = new Setl_cmdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setl_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SETL);
			setState(92);
			match(OFF);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(INT);
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(98);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CVMasmParser.INT, 0); }
		public TerminalNode CHARACTER() { return getToken(CVMasmParser.CHARACTER, 0); }
		public OtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterOtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitOtype(this);
		}
	}

	public final OtypeContext otype() throws RecognitionException {
		OtypeContext _localctx = new OtypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_otype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHARACTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Out_cmdContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(CVMasmParser.OUT, 0); }
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public OtypeContext otype() {
			return getRuleContext(OtypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(CVMasmParser.INT, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Out_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterOut_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitOut_cmd(this);
		}
	}

	public final Out_cmdContext out_cmd() throws RecognitionException {
		Out_cmdContext _localctx = new Out_cmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_out_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(OUT);
			setState(103);
			match(OFF);
			setState(104);
			otype();
			setState(105);
			match(INT);
			setState(106);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outl_cmdContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(CVMasmParser.OUT, 0); }
		public TerminalNode OFF() { return getToken(CVMasmParser.OFF, 0); }
		public TerminalNode INT() { return getToken(CVMasmParser.INT, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public TerminalNode STRING() { return getToken(CVMasmParser.STRING, 0); }
		public List<OtypeContext> otype() {
			return getRuleContexts(OtypeContext.class);
		}
		public OtypeContext otype(int i) {
			return getRuleContext(OtypeContext.class,i);
		}
		public Outl_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outl_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterOutl_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitOutl_cmd(this);
		}
	}

	public final Outl_cmdContext outl_cmd() throws RecognitionException {
		Outl_cmdContext _localctx = new Outl_cmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_outl_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OUT);
			setState(109);
			match(OFF);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHARACTER:
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						otype();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case STRING:
				{
				setState(115);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118);
			match(INT);
			setState(119);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mov_cmdContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(CVMasmParser.MOVE, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Mov_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterMov_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitMov_cmd(this);
		}
	}

	public final Mov_cmdContext mov_cmd() throws RecognitionException {
		Mov_cmdContext _localctx = new Mov_cmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mov_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(MOVE);
			setState(122);
			match(OFF);
			setState(123);
			match(OFF);
			setState(124);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Movl_cmdContext extends ParserRuleContext {
		public TerminalNode MOVEL() { return getToken(CVMasmParser.MOVEL, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode INT() { return getToken(CVMasmParser.INT, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Movl_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movl_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterMovl_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitMovl_cmd(this);
		}
	}

	public final Movl_cmdContext movl_cmd() throws RecognitionException {
		Movl_cmdContext _localctx = new Movl_cmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_movl_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(MOVEL);
			setState(127);
			match(OFF);
			setState(128);
			match(OFF);
			setState(129);
			match(INT);
			setState(130);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpy_cmdContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(CVMasmParser.COPY, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Cpy_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpy_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterCpy_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitCpy_cmd(this);
		}
	}

	public final Cpy_cmdContext cpy_cmd() throws RecognitionException {
		Cpy_cmdContext _localctx = new Cpy_cmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cpy_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(COPY);
			setState(133);
			match(OFF);
			setState(134);
			match(OFF);
			setState(135);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cpyl_cmdContext extends ParserRuleContext {
		public TerminalNode COPYL() { return getToken(CVMasmParser.COPYL, 0); }
		public List<TerminalNode> OFF() { return getTokens(CVMasmParser.OFF); }
		public TerminalNode OFF(int i) {
			return getToken(CVMasmParser.OFF, i);
		}
		public TerminalNode INT() { return getToken(CVMasmParser.INT, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Cpyl_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpyl_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterCpyl_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitCpyl_cmd(this);
		}
	}

	public final Cpyl_cmdContext cpyl_cmd() throws RecognitionException {
		Cpyl_cmdContext _localctx = new Cpyl_cmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cpyl_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(COPYL);
			setState(138);
			match(OFF);
			setState(139);
			match(OFF);
			setState(140);
			match(INT);
			setState(141);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Halt_cmdContext extends ParserRuleContext {
		public TerminalNode HALT() { return getToken(CVMasmParser.HALT, 0); }
		public TerminalNode EOS() { return getToken(CVMasmParser.EOS, 0); }
		public Halt_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_halt_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterHalt_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitHalt_cmd(this);
		}
	}

	public final Halt_cmdContext halt_cmd() throws RecognitionException {
		Halt_cmdContext _localctx = new Halt_cmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_halt_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(HALT);
			setState(144);
			match(EOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public Add_cmdContext add_cmd() {
			return getRuleContext(Add_cmdContext.class,0);
		}
		public Sub_cmdContext sub_cmd() {
			return getRuleContext(Sub_cmdContext.class,0);
		}
		public Mul_cmdContext mul_cmd() {
			return getRuleContext(Mul_cmdContext.class,0);
		}
		public Div_cmdContext div_cmd() {
			return getRuleContext(Div_cmdContext.class,0);
		}
		public Addv_cmdContext addv_cmd() {
			return getRuleContext(Addv_cmdContext.class,0);
		}
		public Subv_cmdContext subv_cmd() {
			return getRuleContext(Subv_cmdContext.class,0);
		}
		public Mulv_cmdContext mulv_cmd() {
			return getRuleContext(Mulv_cmdContext.class,0);
		}
		public Divv_cmdContext divv_cmd() {
			return getRuleContext(Divv_cmdContext.class,0);
		}
		public Set_cmdContext set_cmd() {
			return getRuleContext(Set_cmdContext.class,0);
		}
		public Setl_cmdContext setl_cmd() {
			return getRuleContext(Setl_cmdContext.class,0);
		}
		public Halt_cmdContext halt_cmd() {
			return getRuleContext(Halt_cmdContext.class,0);
		}
		public Out_cmdContext out_cmd() {
			return getRuleContext(Out_cmdContext.class,0);
		}
		public Outl_cmdContext outl_cmd() {
			return getRuleContext(Outl_cmdContext.class,0);
		}
		public Cpy_cmdContext cpy_cmd() {
			return getRuleContext(Cpy_cmdContext.class,0);
		}
		public Cpyl_cmdContext cpyl_cmd() {
			return getRuleContext(Cpyl_cmdContext.class,0);
		}
		public Mov_cmdContext mov_cmd() {
			return getRuleContext(Mov_cmdContext.class,0);
		}
		public Movl_cmdContext movl_cmd() {
			return getRuleContext(Movl_cmdContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmd);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				add_cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				sub_cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				mul_cmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				div_cmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				addv_cmd();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				subv_cmd();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				mulv_cmd();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				divv_cmd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				set_cmd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(155);
				setl_cmd();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				halt_cmd();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(157);
				out_cmd();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				outl_cmd();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(159);
				cpy_cmd();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(160);
				cpyl_cmd();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(161);
				mov_cmd();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				movl_cmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdlistContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterCmdlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitCmdlist(this);
		}
	}

	public final CmdlistContext cmdlist() throws RecognitionException {
		CmdlistContext _localctx = new CmdlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				cmd();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE) | (1L << MOVEL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << COPY) | (1L << COPYL) | (1L << OUT) | (1L << SET) | (1L << SETL) | (1L << HALT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public CmdlistContext cmdlist() {
			return getRuleContext(CmdlistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVMasmListener ) ((CVMasmListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			cmdlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13a\n\13\r\13\16\13b\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\6\16r\n\16\r\16\16"+
		"\16s\3\16\5\16w\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a6\n\24\3\25\6\25\u00a9\n"+
		"\25\r\25\16\25\u00aa\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\3\4\2\5\5\26\26\2\u00ad\2,\3\2\2\2\4\62\3\2\2\2"+
		"\68\3\2\2\2\b>\3\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16N\3\2\2\2\20S\3\2\2\2\22"+
		"X\3\2\2\2\24]\3\2\2\2\26f\3\2\2\2\30h\3\2\2\2\32n\3\2\2\2\34{\3\2\2\2"+
		"\36\u0080\3\2\2\2 \u0086\3\2\2\2\"\u008b\3\2\2\2$\u0091\3\2\2\2&\u00a5"+
		"\3\2\2\2(\u00a8\3\2\2\2*\u00ac\3\2\2\2,-\7\7\2\2-.\7\5\2\2./\7\5\2\2/"+
		"\60\7\6\2\2\60\61\7\24\2\2\61\3\3\2\2\2\62\63\7\b\2\2\63\64\7\5\2\2\64"+
		"\65\7\5\2\2\65\66\7\6\2\2\66\67\7\24\2\2\67\5\3\2\2\289\7\t\2\29:\7\5"+
		"\2\2:;\7\5\2\2;<\7\6\2\2<=\7\24\2\2=\7\3\2\2\2>?\7\n\2\2?@\7\5\2\2@A\7"+
		"\5\2\2AB\7\6\2\2BC\7\24\2\2C\t\3\2\2\2DE\7\7\2\2EF\7\6\2\2FG\7\6\2\2G"+
		"H\7\24\2\2H\13\3\2\2\2IJ\7\b\2\2JK\7\6\2\2KL\7\6\2\2LM\7\24\2\2M\r\3\2"+
		"\2\2NO\7\t\2\2OP\7\6\2\2PQ\7\6\2\2QR\7\24\2\2R\17\3\2\2\2ST\7\n\2\2TU"+
		"\7\6\2\2UV\7\6\2\2VW\7\24\2\2W\21\3\2\2\2XY\7\17\2\2YZ\7\6\2\2Z[\7\5\2"+
		"\2[\\\7\24\2\2\\\23\3\2\2\2]^\7\20\2\2^`\7\6\2\2_a\7\5\2\2`_\3\2\2\2a"+
		"b\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\24\2\2e\25\3\2\2\2fg\t\2\2"+
		"\2g\27\3\2\2\2hi\7\r\2\2ij\7\6\2\2jk\5\26\f\2kl\7\5\2\2lm\7\24\2\2m\31"+
		"\3\2\2\2no\7\r\2\2ov\7\6\2\2pr\5\26\f\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tw\3\2\2\2uw\7\25\2\2vq\3\2\2\2vu\3\2\2\2wx\3\2\2\2xy\7\5\2"+
		"\2yz\7\24\2\2z\33\3\2\2\2{|\7\3\2\2|}\7\6\2\2}~\7\6\2\2~\177\7\24\2\2"+
		"\177\35\3\2\2\2\u0080\u0081\7\4\2\2\u0081\u0082\7\6\2\2\u0082\u0083\7"+
		"\6\2\2\u0083\u0084\7\5\2\2\u0084\u0085\7\24\2\2\u0085\37\3\2\2\2\u0086"+
		"\u0087\7\13\2\2\u0087\u0088\7\6\2\2\u0088\u0089\7\6\2\2\u0089\u008a\7"+
		"\24\2\2\u008a!\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\6\2\2\u008d\u008e"+
		"\7\6\2\2\u008e\u008f\7\5\2\2\u008f\u0090\7\24\2\2\u0090#\3\2\2\2\u0091"+
		"\u0092\7\21\2\2\u0092\u0093\7\24\2\2\u0093%\3\2\2\2\u0094\u00a6\5\2\2"+
		"\2\u0095\u00a6\5\4\3\2\u0096\u00a6\5\6\4\2\u0097\u00a6\5\b\5\2\u0098\u00a6"+
		"\5\n\6\2\u0099\u00a6\5\f\7\2\u009a\u00a6\5\16\b\2\u009b\u00a6\5\20\t\2"+
		"\u009c\u00a6\5\22\n\2\u009d\u00a6\5\24\13\2\u009e\u00a6\5$\23\2\u009f"+
		"\u00a6\5\30\r\2\u00a0\u00a6\5\32\16\2\u00a1\u00a6\5 \21\2\u00a2\u00a6"+
		"\5\"\22\2\u00a3\u00a6\5\34\17\2\u00a4\u00a6\5\36\20\2\u00a5\u0094\3\2"+
		"\2\2\u00a5\u0095\3\2\2\2\u00a5\u0096\3\2\2\2\u00a5\u0097\3\2\2\2\u00a5"+
		"\u0098\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5\u009a\3\2\2\2\u00a5\u009b\3\2"+
		"\2\2\u00a5\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\'\3\2\2\2\u00a7\u00a9"+
		"\5&\24\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab)\3\2\2\2\u00ac\u00ad\5(\25\2\u00ad+\3\2\2\2\7bsv"+
		"\u00a5\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}