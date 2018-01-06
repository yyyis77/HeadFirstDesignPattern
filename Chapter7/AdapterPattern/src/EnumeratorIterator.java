import java.util.Iterator;
import java.util.Enumeration;

public class EnumeratorIterator implements Iterator {
    Enumeration<Object> enumeration;

    public EnumeratorIterator(Enumeration<Object> enumeration){
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
