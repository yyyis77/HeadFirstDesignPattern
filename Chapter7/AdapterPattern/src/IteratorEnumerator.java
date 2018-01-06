import java.util.Iterator;
import java.util.Enumeration;

public class IteratorEnumerator implements Enumeration {
    Iterator iterator;

    public IteratorEnumerator(Iterator iterator){
        this.iterator = iterator;
    }

    public boolean hasMoreElements(){
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
