// Generated from Brainfuck.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrainfuckParser}.
 */
public interface BrainfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull BrainfuckParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull BrainfuckParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull BrainfuckParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull BrainfuckParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull BrainfuckParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull BrainfuckParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveRight}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterMoveRight(@NotNull BrainfuckParser.MoveRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveRight}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitMoveRight(@NotNull BrainfuckParser.MoveRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeByte}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWriteByte(@NotNull BrainfuckParser.WriteByteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeByte}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWriteByte(@NotNull BrainfuckParser.WriteByteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handleLoop}
	 * labeled alternative in {@link BrainfuckParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterHandleLoop(@NotNull BrainfuckParser.HandleLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handleLoop}
	 * labeled alternative in {@link BrainfuckParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitHandleLoop(@NotNull BrainfuckParser.HandleLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readByte}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterReadByte(@NotNull BrainfuckParser.ReadByteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readByte}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitReadByte(@NotNull BrainfuckParser.ReadByteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveLeft}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterMoveLeft(@NotNull BrainfuckParser.MoveLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveLeft}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitMoveLeft(@NotNull BrainfuckParser.MoveLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(@NotNull BrainfuckParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(@NotNull BrainfuckParser.DecrementContext ctx);
}