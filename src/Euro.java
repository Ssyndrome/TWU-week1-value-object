import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.util.Objects;

public class Euro {
    private int value;

    public Euro(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        return this.value == ((Euro) obj).value;
    }

    @Override
    public int hashCode() {

        return value;
    }

    public Euro add(Euro other) {
        Euro result = new Euro(this.value+other.value);
        return result;
    }
}