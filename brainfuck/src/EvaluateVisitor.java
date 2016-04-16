import org.antlr.v4.runtime.misc.NotNull;

import javax.swing.JOptionPane ;
// import java.util.Scanner ;

public class EvaluateVisitor extends BrainfuckBaseVisitor<Integer> {
	private Integer[] tape = new Integer[1000] ;
	private Integer pointer = 500 ;
	// private Scanner input = new Scanner(System.in) ;
	public String result = "" ;
	
	EvaluateVisitor() {
		// initialize tape
		Integer i ;
		for(i=0 ; i<1000 ; i++) tape[i] = 0 ; 
		return ;
	}
	
	@Override 
	public Integer visitIncrement(@NotNull BrainfuckParser.IncrementContext ctx) { 
		tape[pointer] ++ ;
		return 0 ; }	
	
	@Override 
	public Integer visitMoveRight(@NotNull BrainfuckParser.MoveRightContext ctx) { 
		pointer++ ;
		return 0 ; }
	
	@Override public Integer visitWriteByte(@NotNull BrainfuckParser.WriteByteContext ctx) { 
		System.out.print(tape[pointer]) ;
		result += String.format("%d\n", tape[pointer]) ;
		return 0 ; }
	
	
	@Override public Integer visitHandleLoop(@NotNull BrainfuckParser.HandleLoopContext ctx) { 
		while(tape[pointer]!=0) {
			visit(ctx.prog()) ;
		}
		return 0 ; }
	
	@Override public Integer visitReadByte(@NotNull BrainfuckParser.ReadByteContext ctx) { 
		// tape[pointer] = input.nextInt();
        tape[pointer] = 
        		Integer.parseInt(JOptionPane.showInputDialog("Enter an integer")) ; 

		return 0 ; }
	
	@Override public Integer visitMoveLeft(@NotNull BrainfuckParser.MoveLeftContext ctx) { 
		pointer-- ;
		return 0; }
	
	@Override public Integer visitDecrement(@NotNull BrainfuckParser.DecrementContext ctx) { 
		tape[pointer]-- ;
		return 0; }
	
}
