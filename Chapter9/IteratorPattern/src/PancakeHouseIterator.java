import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {
    ArrayList<MenuItem> items;
    int curIndex = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    public MenuItem next(){
        MenuItem item = items.get(curIndex);
        curIndex += 1;
        return item;
    }

    @Override
    public boolean hasNext() {
        if (curIndex >= items.size()){
            return false;
        }else
            return true;
    }
}
