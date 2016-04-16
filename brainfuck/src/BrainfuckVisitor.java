// Generated from Brainfuck.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrainfuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrainfuckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(@NotNull BrainfuckParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrainfuckParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull BrainfuckParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrainfuckParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull BrainfuckParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveRight}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveRight(@NotNull BrainfuckParser.MoveRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeByte}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteByte(@NotNull BrainfuckParser.WriteByteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handleLoop}
	 * labeled alternative in {@link BrainfuckParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandleLoop(@NotNull BrainfuckParser.HandleLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readByte}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadByte(@NotNull BrainfuckParser.ReadByteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveLeft}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveLeft(@NotNull BrainfuckParser.MoveLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(@NotNull BrainfuckParser.DecrementContext ctx);
}