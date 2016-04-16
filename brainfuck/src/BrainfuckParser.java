// Generated from Brainfuck.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrainfuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Read=1, Write=2, Increment=3, Decrement=4, PointerRight=5, PointerLeft=6, 
		LoopOpen=7, LoopClose=8, WhiteSpace=9;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'.'", "'+'", "'-'", "'>'", "'<'", "'['", "']'", "WhiteSpace"
	};
	public static final int
		RULE_start = 0, RULE_prog = 1, RULE_loop = 2, RULE_com = 3;
	public static final String[] ruleNames = {
		"start", "prog", "loop", "com"
	};

	@Override
	public String getGrammarFileName() { return "Brainfuck.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrainfuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); prog();
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

	public static class ProgContext extends ParserRuleContext {
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Read) | (1L << Write) | (1L << Increment) | (1L << Decrement) | (1L << PointerRight) | (1L << PointerLeft) | (1L << LoopOpen))) != 0)) {
				{
				setState(12);
				switch (_input.LA(1)) {
				case LoopOpen:
					{
					setState(10); loop();
					}
					break;
				case Read:
				case Write:
				case Increment:
				case Decrement:
				case PointerRight:
				case PointerLeft:
					{
					setState(11); com();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HandleLoopContext extends LoopContext {
		public TerminalNode LoopClose() { return getToken(BrainfuckParser.LoopClose, 0); }
		public TerminalNode LoopOpen() { return getToken(BrainfuckParser.LoopOpen, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public HandleLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterHandleLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitHandleLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitHandleLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loop);
		try {
			_localctx = new HandleLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(LoopOpen);
			setState(18); prog();
			setState(19); match(LoopClose);
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

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementContext extends ComContext {
		public TerminalNode Increment() { return getToken(BrainfuckParser.Increment, 0); }
		public IncrementContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveRightContext extends ComContext {
		public TerminalNode PointerRight() { return getToken(BrainfuckParser.PointerRight, 0); }
		public MoveRightContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterMoveRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitMoveRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitMoveRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteByteContext extends ComContext {
		public TerminalNode Write() { return getToken(BrainfuckParser.Write, 0); }
		public WriteByteContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterWriteByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitWriteByte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitWriteByte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveLeftContext extends ComContext {
		public TerminalNode PointerLeft() { return getToken(BrainfuckParser.PointerLeft, 0); }
		public MoveLeftContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterMoveLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitMoveLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitMoveLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadByteContext extends ComContext {
		public TerminalNode Read() { return getToken(BrainfuckParser.Read, 0); }
		public ReadByteContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterReadByte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitReadByte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitReadByte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementContext extends ComContext {
		public TerminalNode Decrement() { return getToken(BrainfuckParser.Decrement, 0); }
		public DecrementContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrainfuckListener ) ((BrainfuckListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainfuckVisitor ) return ((BrainfuckVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_com);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case Read:
				_localctx = new ReadByteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21); match(Read);
				}
				break;
			case Write:
				_localctx = new WriteByteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22); match(Write);
				}
				break;
			case Increment:
				_localctx = new IncrementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23); match(Increment);
				}
				break;
			case Decrement:
				_localctx = new DecrementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(24); match(Decrement);
				}
				break;
			case PointerRight:
				_localctx = new MoveRightContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(25); match(PointerRight);
				}
				break;
			case PointerLeft:
				_localctx = new MoveLeftContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(26); match(PointerLeft);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\7\3\17\n\3\f\3\16\3\22\13\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\36\n\5\3\5\2\2\6\2\4\6\b\2\2\"\2"+
		"\n\3\2\2\2\4\20\3\2\2\2\6\23\3\2\2\2\b\35\3\2\2\2\n\13\5\4\3\2\13\3\3"+
		"\2\2\2\f\17\5\6\4\2\r\17\5\b\5\2\16\f\3\2\2\2\16\r\3\2\2\2\17\22\3\2\2"+
		"\2\20\16\3\2\2\2\20\21\3\2\2\2\21\5\3\2\2\2\22\20\3\2\2\2\23\24\7\t\2"+
		"\2\24\25\5\4\3\2\25\26\7\n\2\2\26\7\3\2\2\2\27\36\7\3\2\2\30\36\7\4\2"+
		"\2\31\36\7\5\2\2\32\36\7\6\2\2\33\36\7\7\2\2\34\36\7\b\2\2\35\27\3\2\2"+
		"\2\35\30\3\2\2\2\35\31\3\2\2\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2"+
		"\2\36\t\3\2\2\2\5\16\20\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}