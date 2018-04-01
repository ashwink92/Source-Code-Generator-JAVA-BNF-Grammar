package CodeGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringOperations extends Base {
    String type="null";
    List<Base> Attributes = new ArrayList<Base>();

    public StringOperations() throws IOException {
        GrammarParser.sequenceGenerator(this, "StringOperations");
    }

    public void addAttributes(Base attribute) {
        this.Attributes.add(attribute);
    }

    public void ValuePrint() {
        for(Base Attribute: Attributes) {
            Attribute.ValuePrint();
        }
    }
}