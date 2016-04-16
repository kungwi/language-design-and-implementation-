import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.JOptionPane ;

public class runBrainfuck {

	public static void main(String[] args) throws Exception {
        String inputFile = 
        		JOptionPane.showInputDialog("Enter the name of the file to parse") ; 
        
        ANTLRFileStream input = new ANTLRFileStream(inputFile);
        
        BrainfuckLexer lexer = new BrainfuckLexer(input);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        BrainfuckParser parser = new BrainfuckParser(tokens);
        
        ParseTree tree = parser.start(); 

        EvaluateVisitor eval = new EvaluateVisitor();
        
        System.out.println(tree.toStringTree(parser)) ;
        
        eval.visit(tree);
        
        JOptionPane.showMessageDialog(null , eval.result);


	}

}
