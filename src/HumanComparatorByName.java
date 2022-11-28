import java.util.Comparator;

public class HumanComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human human, Human o1) {
        return human.getName().compareTo(o1.getName());
    }
}
