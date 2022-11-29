import java.util.Iterator;
import java.util.List;

/**
 * class GroupIterator нужен в случае использования в классе Tree
 * метода Iterator<Human> iterator
 */
public class GroupIterator<T> implements Iterator<T> {
    private List<T> humanList;
    private int index = 0;

    public GroupIterator(List<T> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    @Override
    public T next() {
        return humanList.get(index++);
    }
}
