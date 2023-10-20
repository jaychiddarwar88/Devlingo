package gen;
// Generated from /Users/manmeet_singh/Desktop/SER502/SER502-Spring2023-Team20/src/main/antlr/DevLingo.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DevLingoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, DIGITS=23, BOOLEAN=24, 
		ADDITIONAL=25, SUBTRACT=26, MULTIPLY=27, DIVISION=28, AND=29, OR=30, LESS_THAN=31, 
		GREATER_THAN=32, LESS_THAN_OR_EQUAL=33, GREATER_THAN_OR_EQUAL=34, NOT_EQUAL_TO=35, 
		IS_EQUAL_TO=36, IDEN=37, STRING=38, EQUALS=39, WHITE_SPACES=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_assignmentExpression = 3, 
		RULE_expression = 4, RULE_logicalExpression = 5, RULE_comparisonExpression = 6, 
		RULE_mathematicalExpression = 7, RULE_conditionalExpression = 8, RULE_ifBlock = 9, 
		RULE_else_ifBlock = 10, RULE_else_expr = 11, RULE_whileLoop = 12, RULE_rangedForLoop = 13, 
		RULE_rangeVal = 14, RULE_forLoop = 15, RULE_variable_change_part = 16, 
		RULE_decrement_expression = 17, RULE_increment_expression = 18, RULE_ternaryExpression = 19, 
		RULE_printStatement = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "assignmentExpression", "expression", 
			"logicalExpression", "comparisonExpression", "mathematicalExpression", 
			"conditionalExpression", "ifBlock", "else_ifBlock", "else_expr", "whileLoop", 
			"rangedForLoop", "rangeVal", "forLoop", "variable_change_part", "decrement_expression", 
			"increment_expression", "ternaryExpression", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main()'", "'{'", "'}'", "'int'", "'boolean'", "'string'", "'('", 
			"')'", "'if'", "'else if'", "'else'", "'while'", "'for'", "'in'", "'range'", 
			"';'", "'--'", "'++'", "'?'", "':'", "'printf'", "','", null, null, "'+'", 
			"'-'", "'*'", "'/'", "'and'", "'or'", "'<'", "'>'", "'<='", "'>='", "'not'", 
			"'=='", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "DIGITS", 
			"BOOLEAN", "ADDITIONAL", "SUBTRACT", "MULTIPLY", "DIVISION", "AND", "OR", 
			"LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", 
			"NOT_EQUAL_TO", "IS_EQUAL_TO", "IDEN", "STRING", "EQUALS", "WHITE_SPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "DevLingo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DevLingoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				block();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137441063536L) != 0) );
			setState(51);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public RangedForLoopContext rangedForLoop() {
			return getRuleContext(RangedForLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(53);
				ifBlock();
				}
				break;
			case 2:
				{
				setState(54);
				whileLoop();
				}
				break;
			case 3:
				{
				setState(55);
				rangedForLoop();
				}
				break;
			case 4:
				{
				setState(56);
				forLoop();
				}
				break;
			case 5:
				{
				setState(57);
				printStatement();
				}
				break;
			case 6:
				{
				setState(58);
				assignmentExpression();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolAssignmentContext extends AssignmentExpressionContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public TerminalNode EQUALS() { return getToken(DevLingoParser.EQUALS, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public BoolAssignmentContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterBoolAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitBoolAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitBoolAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAssignmentContext extends AssignmentExpressionContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public TerminalNode EQUALS() { return getToken(DevLingoParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(DevLingoParser.STRING, 0); }
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public StringAssignmentContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntAssignmentContext extends AssignmentExpressionContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public TerminalNode EQUALS() { return getToken(DevLingoParser.EQUALS, 0); }
		public MathematicalExpressionContext mathematicalExpression() {
			return getRuleContext(MathematicalExpressionContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public IntAssignmentContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterIntAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitIntAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitIntAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentExpression);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__3);
				setState(62);
				match(IDEN);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(63);
					match(EQUALS);
					setState(64);
					mathematicalExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__3);
				setState(68);
				match(IDEN);
				setState(69);
				match(EQUALS);
				setState(70);
				ternaryExpression();
				}
				break;
			case 3:
				_localctx = new BoolAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__4);
				setState(72);
				match(IDEN);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(73);
					match(EQUALS);
					setState(74);
					logicalExpression(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new BoolAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__4);
				setState(78);
				match(IDEN);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(79);
					match(EQUALS);
					setState(80);
					ternaryExpression();
					}
				}

				}
				break;
			case 5:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(T__5);
				setState(84);
				match(IDEN);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(85);
					match(EQUALS);
					setState(86);
					match(STRING);
					}
				}

				}
				break;
			case 6:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(T__5);
				setState(90);
				match(IDEN);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(91);
					match(EQUALS);
					setState(92);
					ternaryExpression();
					}
				}

				}
				break;
			case 7:
				_localctx = new IntAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				match(IDEN);
				setState(96);
				match(EQUALS);
				setState(97);
				mathematicalExpression(0);
				}
				break;
			case 8:
				_localctx = new BoolAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(IDEN);
				setState(99);
				match(EQUALS);
				setState(100);
				logicalExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public MathematicalExpressionContext mathematicalExpression() {
			return getRuleContext(MathematicalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				mathematicalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				logicalExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExpressionInBracketsContext extends LogicalExpressionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BoolExpressionInBracketsContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterBoolExpressionInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitBoolExpressionInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitBoolExpressionInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolIDENOnlyExpressionContext extends LogicalExpressionContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public BoolIDENOnlyExpressionContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterBoolIDENOnlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitBoolIDENOnlyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitBoolIDENOnlyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLogExpressionContext extends LogicalExpressionContext {
		public Token op;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DevLingoParser.AND, 0); }
		public TerminalNode OR() { return getToken(DevLingoParser.OR, 0); }
		public TerminalNode IS_EQUAL_TO() { return getToken(DevLingoParser.IS_EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL_TO() { return getToken(DevLingoParser.NOT_EQUAL_TO, 0); }
		public BoolLogExpressionContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterBoolLogExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitBoolLogExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitBoolLogExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolCompExpressionContext extends LogicalExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public BoolCompExpressionContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterBoolCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitBoolCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitBoolCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveBoolValuesOnlyContext extends LogicalExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(DevLingoParser.BOOLEAN, 0); }
		public PrimitiveBoolValuesOnlyContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterPrimitiveBoolValuesOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitPrimitiveBoolValuesOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitPrimitiveBoolValuesOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_logicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolCompExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				comparisonExpression();
				}
				break;
			case 2:
				{
				_localctx = new BoolExpressionInBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__6);
				setState(110);
				logicalExpression(0);
				setState(111);
				match(T__7);
				}
				break;
			case 3:
				{
				_localctx = new PrimitiveBoolValuesOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new BoolIDENOnlyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(IDEN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolLogExpressionContext(new LogicalExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(117);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(118);
					((BoolLogExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 104689827840L) != 0)) ) {
						((BoolLogExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(119);
					logicalExpression(6);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	 
		public ComparisonExpressionContext() { }
		public void copyFrom(ComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumbCompExpressionContext extends ComparisonExpressionContext {
		public Token op;
		public List<MathematicalExpressionContext> mathematicalExpression() {
			return getRuleContexts(MathematicalExpressionContext.class);
		}
		public MathematicalExpressionContext mathematicalExpression(int i) {
			return getRuleContext(MathematicalExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(DevLingoParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(DevLingoParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(DevLingoParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(DevLingoParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode IS_EQUAL_TO() { return getToken(DevLingoParser.IS_EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL_TO() { return getToken(DevLingoParser.NOT_EQUAL_TO, 0); }
		public NumbCompExpressionContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterNumbCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitNumbCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitNumbCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparisonExpression);
		int _la;
		try {
			_localctx = new NumbCompExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			mathematicalExpression(0);
			setState(126);
			((NumbCompExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
				((NumbCompExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			mathematicalExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathematicalExpressionContext extends ParserRuleContext {
		public MathematicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalExpression; }
	 
		public MathematicalExpressionContext() { }
		public void copyFrom(MathematicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberMultDivExpressionContext extends MathematicalExpressionContext {
		public Token op;
		public List<MathematicalExpressionContext> mathematicalExpression() {
			return getRuleContexts(MathematicalExpressionContext.class);
		}
		public MathematicalExpressionContext mathematicalExpression(int i) {
			return getRuleContext(MathematicalExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(DevLingoParser.MULTIPLY, 0); }
		public TerminalNode DIVISION() { return getToken(DevLingoParser.DIVISION, 0); }
		public NumberMultDivExpressionContext(MathematicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterNumberMultDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitNumberMultDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitNumberMultDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberIDENOnlyContext extends MathematicalExpressionContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public TerminalNode SUBTRACT() { return getToken(DevLingoParser.SUBTRACT, 0); }
		public NumberIDENOnlyContext(MathematicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterNumberIDENOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitNumberIDENOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitNumberIDENOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberADDITIONALSUBTRACTExpressionContext extends MathematicalExpressionContext {
		public Token op;
		public List<MathematicalExpressionContext> mathematicalExpression() {
			return getRuleContexts(MathematicalExpressionContext.class);
		}
		public MathematicalExpressionContext mathematicalExpression(int i) {
			return getRuleContext(MathematicalExpressionContext.class,i);
		}
		public TerminalNode ADDITIONAL() { return getToken(DevLingoParser.ADDITIONAL, 0); }
		public TerminalNode SUBTRACT() { return getToken(DevLingoParser.SUBTRACT, 0); }
		public NumberADDITIONALSUBTRACTExpressionContext(MathematicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterNumberADDITIONALSUBTRACTExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitNumberADDITIONALSUBTRACTExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitNumberADDITIONALSUBTRACTExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberOnlyContext extends MathematicalExpressionContext {
		public TerminalNode DIGITS() { return getToken(DevLingoParser.DIGITS, 0); }
		public TerminalNode SUBTRACT() { return getToken(DevLingoParser.SUBTRACT, 0); }
		public NumberOnlyContext(MathematicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterNumberOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitNumberOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitNumberOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumbBrackExpressionContext extends MathematicalExpressionContext {
		public MathematicalExpressionContext mathematicalExpression() {
			return getRuleContext(MathematicalExpressionContext.class,0);
		}
		public NumbBrackExpressionContext(MathematicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterNumbBrackExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitNumbBrackExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitNumbBrackExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalExpressionContext mathematicalExpression() throws RecognitionException {
		return mathematicalExpression(0);
	}

	private MathematicalExpressionContext mathematicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathematicalExpressionContext _localctx = new MathematicalExpressionContext(_ctx, _parentState);
		MathematicalExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_mathematicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NumbBrackExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(130);
				match(T__6);
				setState(131);
				mathematicalExpression(0);
				setState(132);
				match(T__7);
				}
				break;
			case 2:
				{
				_localctx = new NumberOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACT) {
					{
					setState(134);
					match(SUBTRACT);
					}
				}

				setState(137);
				match(DIGITS);
				}
				break;
			case 3:
				{
				_localctx = new NumberIDENOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACT) {
					{
					setState(138);
					match(SUBTRACT);
					}
				}

				setState(141);
				match(IDEN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new NumberMultDivExpressionContext(new MathematicalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpression);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						((NumberMultDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVISION) ) {
							((NumberMultDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						mathematicalExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new NumberADDITIONALSUBTRACTExpressionContext(new MathematicalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathematicalExpression);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						((NumberADDITIONALSUBTRACTExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADDITIONAL || _la==SUBTRACT) ) {
							((NumberADDITIONALSUBTRACTExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						mathematicalExpression(5);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__6);
			setState(156);
			logicalExpression(0);
			setState(157);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Else_ifBlockContext> else_ifBlock() {
			return getRuleContexts(Else_ifBlockContext.class);
		}
		public Else_ifBlockContext else_ifBlock(int i) {
			return getRuleContext(Else_ifBlockContext.class,i);
		}
		public Else_exprContext else_expr() {
			return getRuleContext(Else_exprContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__8);
			setState(160);
			conditionalExpression();
			setState(161);
			statement();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(162);
				else_ifBlock();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(168);
				else_expr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifBlockContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_ifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterElse_ifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitElse_ifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitElse_ifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifBlockContext else_ifBlock() throws RecognitionException {
		Else_ifBlockContext _localctx = new Else_ifBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__9);
			setState(172);
			conditionalExpression();
			setState(173);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_exprContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterElse_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitElse_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitElse_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_exprContext else_expr() throws RecognitionException {
		Else_exprContext _localctx = new Else_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__10);
			setState(176);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__11);
			setState(179);
			conditionalExpression();
			setState(180);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangedForLoopContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public List<RangeValContext> rangeVal() {
			return getRuleContexts(RangeValContext.class);
		}
		public RangeValContext rangeVal(int i) {
			return getRuleContext(RangeValContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public RangedForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangedForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterRangedForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitRangedForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitRangedForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangedForLoopContext rangedForLoop() throws RecognitionException {
		RangedForLoopContext _localctx = new RangedForLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rangedForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__12);
			setState(183);
			match(IDEN);
			setState(184);
			match(T__13);
			setState(185);
			match(T__14);
			setState(186);
			match(T__6);
			setState(187);
			rangeVal();
			setState(188);
			match(T__15);
			setState(189);
			rangeVal();
			setState(190);
			match(T__7);
			setState(191);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeValContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public TerminalNode DIGITS() { return getToken(DevLingoParser.DIGITS, 0); }
		public RangeValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterRangeVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitRangeVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitRangeVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeValContext rangeVal() throws RecognitionException {
		RangeValContext _localctx = new RangeValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rangeVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==DIGITS || _la==IDEN) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public Variable_change_partContext variable_change_part() {
			return getRuleContext(Variable_change_partContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__12);
			setState(196);
			match(T__6);
			setState(197);
			assignmentExpression();
			setState(198);
			match(T__15);
			setState(199);
			logicalExpression(0);
			setState(200);
			match(T__15);
			setState(201);
			variable_change_part();
			setState(202);
			match(T__7);
			setState(203);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_change_partContext extends ParserRuleContext {
		public Increment_expressionContext increment_expression() {
			return getRuleContext(Increment_expressionContext.class,0);
		}
		public Decrement_expressionContext decrement_expression() {
			return getRuleContext(Decrement_expressionContext.class,0);
		}
		public Variable_change_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_change_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterVariable_change_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitVariable_change_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitVariable_change_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_change_partContext variable_change_part() throws RecognitionException {
		Variable_change_partContext _localctx = new Variable_change_partContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable_change_part);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				increment_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				decrement_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decrement_expressionContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public Decrement_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterDecrement_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitDecrement_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitDecrement_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decrement_expressionContext decrement_expression() throws RecognitionException {
		Decrement_expressionContext _localctx = new Decrement_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decrement_expression);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(IDEN);
				setState(210);
				match(T__16);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__16);
				setState(212);
				match(IDEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Increment_expressionContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public Increment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterIncrement_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitIncrement_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitIncrement_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increment_expressionContext increment_expression() throws RecognitionException {
		Increment_expressionContext _localctx = new Increment_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_increment_expression);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(IDEN);
				setState(216);
				match(T__17);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__17);
				setState(218);
				match(IDEN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(DevLingoParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(DevLingoParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(DevLingoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DevLingoParser.STRING, i);
		}
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ternaryExpression);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				conditionalExpression();
				setState(222);
				match(T__18);
				setState(223);
				expression();
				setState(224);
				match(T__19);
				setState(225);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				conditionalExpression();
				setState(228);
				match(T__18);
				setState(229);
				match(BOOLEAN);
				setState(230);
				match(T__19);
				setState(231);
				match(BOOLEAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				conditionalExpression();
				setState(234);
				match(T__18);
				setState(235);
				match(STRING);
				setState(236);
				match(T__19);
				setState(237);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(DevLingoParser.DIGITS, 0); }
		public TerminalNode BOOLEAN() { return getToken(DevLingoParser.BOOLEAN, 0); }
		public TerminalNode IDEN() { return getToken(DevLingoParser.IDEN, 0); }
		public MathematicalExpressionContext mathematicalExpression() {
			return getRuleContext(MathematicalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(DevLingoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DevLingoParser.STRING, i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DevLingoListener ) ((DevLingoListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DevLingoVisitor ) return ((DevLingoVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_printStatement);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__20);
				setState(242);
				match(T__6);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(243);
					match(DIGITS);
					}
					break;
				case 2:
					{
					setState(244);
					match(BOOLEAN);
					}
					break;
				case 3:
					{
					setState(245);
					match(IDEN);
					}
					break;
				case 4:
					{
					setState(246);
					mathematicalExpression(0);
					}
					break;
				case 5:
					{
					setState(247);
					logicalExpression(0);
					}
					break;
				case 6:
					{
					setState(248);
					match(STRING);
					}
					break;
				}
				setState(251);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__20);
				setState(253);
				match(T__6);
				setState(254);
				match(STRING);
				setState(255);
				match(T__21);
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412342026240L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				match(T__7);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 7:
			return mathematicalExpression_sempred((MathematicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean mathematicalExpression_sempred(MathematicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u00010\b\u0001\u000b\u0001"+
		"\f\u00011\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003R\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003^\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"t\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005y\b\u0005\n\u0005"+
		"\f\u0005|\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0088\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007"+
		"\u0001\u0007\u0003\u0007\u008f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0097\b\u0007\n\u0007"+
		"\f\u0007\u009a\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00a4\b\t\n\t\f\t\u00a7\t\t\u0001\t\u0003\t\u00aa"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00d6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00dc\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00f0\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00fa\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0103\b\u0014\u0001\u0014"+
		"\u0000\u0002\n\u000e\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0006\u0002\u0000\u001d"+
		"\u001e#$\u0001\u0000\u001f$\u0001\u0000\u001b\u001c\u0001\u0000\u0019"+
		"\u001a\u0002\u0000\u0017\u0017%%\u0002\u0000\u0017\u0018%&\u0119\u0000"+
		"*\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000"+
		"\u0000\ns\u0001\u0000\u0000\u0000\f}\u0001\u0000\u0000\u0000\u000e\u008e"+
		"\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u009f"+
		"\u0001\u0000\u0000\u0000\u0014\u00ab\u0001\u0000\u0000\u0000\u0016\u00af"+
		"\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00b6"+
		"\u0001\u0000\u0000\u0000\u001c\u00c1\u0001\u0000\u0000\u0000\u001e\u00c3"+
		"\u0001\u0000\u0000\u0000 \u00cf\u0001\u0000\u0000\u0000\"\u00d5\u0001"+
		"\u0000\u0000\u0000$\u00db\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000"+
		"\u0000(\u0102\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0003"+
		"\u0002\u0001\u0000,\u0001\u0001\u0000\u0000\u0000-/\u0005\u0002\u0000"+
		"\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0005\u0003\u0000\u00004\u0003\u0001\u0000\u0000"+
		"\u00005<\u0003\u0012\t\u00006<\u0003\u0018\f\u00007<\u0003\u001a\r\u0000"+
		"8<\u0003\u001e\u000f\u00009<\u0003(\u0014\u0000:<\u0003\u0006\u0003\u0000"+
		";5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005\u0004\u0000\u0000"+
		">A\u0005%\u0000\u0000?@\u0005\'\u0000\u0000@B\u0003\u000e\u0007\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000Bf\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0004\u0000\u0000DE\u0005%\u0000\u0000EF\u0005\'\u0000"+
		"\u0000Ff\u0003&\u0013\u0000GH\u0005\u0005\u0000\u0000HK\u0005%\u0000\u0000"+
		"IJ\u0005\'\u0000\u0000JL\u0003\n\u0005\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000Lf\u0001\u0000\u0000\u0000MN\u0005\u0005\u0000"+
		"\u0000NQ\u0005%\u0000\u0000OP\u0005\'\u0000\u0000PR\u0003&\u0013\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000Rf\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0006\u0000\u0000TW\u0005%\u0000\u0000UV\u0005\'\u0000"+
		"\u0000VX\u0005&\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000Xf\u0001\u0000\u0000\u0000YZ\u0005\u0006\u0000\u0000Z]\u0005%\u0000"+
		"\u0000[\\\u0005\'\u0000\u0000\\^\u0003&\u0013\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^f\u0001\u0000\u0000\u0000_`\u0005%\u0000"+
		"\u0000`a\u0005\'\u0000\u0000af\u0003\u000e\u0007\u0000bc\u0005%\u0000"+
		"\u0000cd\u0005\'\u0000\u0000df\u0003\n\u0005\u0000e=\u0001\u0000\u0000"+
		"\u0000eC\u0001\u0000\u0000\u0000eG\u0001\u0000\u0000\u0000eM\u0001\u0000"+
		"\u0000\u0000eS\u0001\u0000\u0000\u0000eY\u0001\u0000\u0000\u0000e_\u0001"+
		"\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000f\u0007\u0001\u0000\u0000"+
		"\u0000gj\u0003\u000e\u0007\u0000hj\u0003\n\u0005\u0000ig\u0001\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000kl\u0006\u0005"+
		"\uffff\uffff\u0000lt\u0003\f\u0006\u0000mn\u0005\u0007\u0000\u0000no\u0003"+
		"\n\u0005\u0000op\u0005\b\u0000\u0000pt\u0001\u0000\u0000\u0000qt\u0005"+
		"\u0018\u0000\u0000rt\u0005%\u0000\u0000sk\u0001\u0000\u0000\u0000sm\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tz\u0001\u0000\u0000\u0000uv\n\u0005\u0000\u0000vw\u0007\u0000\u0000\u0000"+
		"wy\u0003\n\u0005\u0006xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u000b\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0003\u000e\u0007\u0000~\u007f"+
		"\u0007\u0001\u0000\u0000\u007f\u0080\u0003\u000e\u0007\u0000\u0080\r\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0006\u0007\uffff\uffff\u0000\u0082\u0083"+
		"\u0005\u0007\u0000\u0000\u0083\u0084\u0003\u000e\u0007\u0000\u0084\u0085"+
		"\u0005\b\u0000\u0000\u0085\u008f\u0001\u0000\u0000\u0000\u0086\u0088\u0005"+
		"\u001a\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008f\u0005"+
		"\u0017\u0000\u0000\u008a\u008c\u0005\u001a\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0005%\u0000\u0000\u008e\u0081\u0001\u0000"+
		"\u0000\u0000\u008e\u0087\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000"+
		"\u0000\u0000\u008f\u0098\u0001\u0000\u0000\u0000\u0090\u0091\n\u0005\u0000"+
		"\u0000\u0091\u0092\u0007\u0002\u0000\u0000\u0092\u0097\u0003\u000e\u0007"+
		"\u0006\u0093\u0094\n\u0004\u0000\u0000\u0094\u0095\u0007\u0003\u0000\u0000"+
		"\u0095\u0097\u0003\u000e\u0007\u0005\u0096\u0090\u0001\u0000\u0000\u0000"+
		"\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u000f\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0007\u0000\u0000\u009c\u009d\u0003\n\u0005\u0000\u009d"+
		"\u009e\u0005\b\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005\t\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000\u00a1\u00a5\u0003"+
		"\u0002\u0001\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0016"+
		"\u000b\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\n\u0000"+
		"\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00ae\u0003\u0002\u0001\u0000"+
		"\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u000b\u0000\u0000"+
		"\u00b0\u00b1\u0003\u0002\u0001\u0000\u00b1\u0017\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\f\u0000\u0000\u00b3\u00b4\u0003\u0010\b\u0000\u00b4"+
		"\u00b5\u0003\u0002\u0001\u0000\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005\r\u0000\u0000\u00b7\u00b8\u0005%\u0000\u0000\u00b8\u00b9"+
		"\u0005\u000e\u0000\u0000\u00b9\u00ba\u0005\u000f\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0007\u0000\u0000\u00bb\u00bc\u0003\u001c\u000e\u0000\u00bc\u00bd"+
		"\u0005\u0010\u0000\u0000\u00bd\u00be\u0003\u001c\u000e\u0000\u00be\u00bf"+
		"\u0005\b\u0000\u0000\u00bf\u00c0\u0003\u0002\u0001\u0000\u00c0\u001b\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0007\u0004\u0000\u0000\u00c2\u001d\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005\r\u0000\u0000\u00c4\u00c5\u0005\u0007"+
		"\u0000\u0000\u00c5\u00c6\u0003\u0006\u0003\u0000\u00c6\u00c7\u0005\u0010"+
		"\u0000\u0000\u00c7\u00c8\u0003\n\u0005\u0000\u00c8\u00c9\u0005\u0010\u0000"+
		"\u0000\u00c9\u00ca\u0003 \u0010\u0000\u00ca\u00cb\u0005\b\u0000\u0000"+
		"\u00cb\u00cc\u0003\u0002\u0001\u0000\u00cc\u001f\u0001\u0000\u0000\u0000"+
		"\u00cd\u00d0\u0003$\u0012\u0000\u00ce\u00d0\u0003\"\u0011\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"!\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005%\u0000\u0000\u00d2\u00d6\u0005"+
		"\u0011\u0000\u0000\u00d3\u00d4\u0005\u0011\u0000\u0000\u00d4\u00d6\u0005"+
		"%\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6#\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005%\u0000\u0000"+
		"\u00d8\u00dc\u0005\u0012\u0000\u0000\u00d9\u00da\u0005\u0012\u0000\u0000"+
		"\u00da\u00dc\u0005%\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc%\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0003\u0010\b\u0000\u00de\u00df\u0005\u0013\u0000\u0000\u00df\u00e0\u0003"+
		"\b\u0004\u0000\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1\u00e2\u0003\b"+
		"\u0004\u0000\u00e2\u00f0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003\u0010"+
		"\b\u0000\u00e4\u00e5\u0005\u0013\u0000\u0000\u00e5\u00e6\u0005\u0018\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0014\u0000\u0000\u00e7\u00e8\u0005\u0018\u0000"+
		"\u0000\u00e8\u00f0\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003\u0010\b\u0000"+
		"\u00ea\u00eb\u0005\u0013\u0000\u0000\u00eb\u00ec\u0005&\u0000\u0000\u00ec"+
		"\u00ed\u0005\u0014\u0000\u0000\u00ed\u00ee\u0005&\u0000\u0000\u00ee\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ef\u00dd\u0001\u0000\u0000\u0000\u00ef\u00e3"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00f0\'\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0015\u0000\u0000\u00f2\u00f9\u0005"+
		"\u0007\u0000\u0000\u00f3\u00fa\u0005\u0017\u0000\u0000\u00f4\u00fa\u0005"+
		"\u0018\u0000\u0000\u00f5\u00fa\u0005%\u0000\u0000\u00f6\u00fa\u0003\u000e"+
		"\u0007\u0000\u00f7\u00fa\u0003\n\u0005\u0000\u00f8\u00fa\u0005&\u0000"+
		"\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0103\u0005\b\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0015\u0000\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000"+
		"\u00fe\u00ff\u0005&\u0000\u0000\u00ff\u0100\u0005\u0016\u0000\u0000\u0100"+
		"\u0101\u0007\u0005\u0000\u0000\u0101\u0103\u0005\b\u0000\u0000\u0102\u00f1"+
		"\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000\u0000\u0000\u0103)\u0001"+
		"\u0000\u0000\u0000\u00181;AKQW]eisz\u0087\u008b\u008e\u0096\u0098\u00a5"+
		"\u00a9\u00cf\u00d5\u00db\u00ef\u00f9\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}