import com.sun.tools.corba.se.idl.constExpr.Equal;

public class Euro {
    private int value;

    public Euro(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return this.value == ((Euro) obj).value;
    }

}