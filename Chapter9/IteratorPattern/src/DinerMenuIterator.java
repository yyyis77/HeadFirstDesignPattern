import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int curIndex = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items[curIndex];
        curIndex += 1;
        return menuItem;
    }

    public boolean hasNext(){
        if (curIndex >= items.length || items[curIndex] == null){
            return false;
        }else
            return true;
    }

    public void remove(){
        if (curIndex <= 0){
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (items[curIndex-1] != null){
            for (int i=curIndex-1; i<items.length-1; i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
