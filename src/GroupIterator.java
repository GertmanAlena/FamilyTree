import java.util.Iterator;
import java.util.List;

/**
 * class GroupIterator нужен в случае использования в классе Tree
 * метода Iterator<Human> iterator
 */
public class GroupIterator implements Iterator<Human> {
    private List<Human> humanList;
    private int index = 0;

    public GroupIterator(List<Human> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    @Override
    public Human next() {
        return humanList.get(index++);
    }
}
