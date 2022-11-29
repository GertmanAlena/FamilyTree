import java.util.*;

/**
 * class Tree итерируемый создаёт дерево List<Human> familyTree
 */
public class Tree <T> implements Iterable<T> {
    /**
     * класс формирования дерева
     */
    private List<T> familyTree = new ArrayList<>();
    int idCount = 0;
    int marriageCount = 0;

    /**
     * @param name имя человека
     * @param data дата рождения
     * @param gender пол человека
     */
     public void createFamilyHeader(String name, String data, String gender){
        Human p = new Human(name,  data, gender, null, null);
        p.setId(idCount++);
        familyTree.add((T) p);
    }
    /**
     * метод рождения ребёнка
     * @param father отец
     * @param mother мать
     * @param name имя ребёнка
     * @param data дата рождения ребёнка
     * @param gender пол ребёнка
     */
    public void born(T father, T mother, String name, String data, String gender){
        Human p = new Human(name, data, gender, (Human) father, (Human) mother);
        p.setId(idCount++);
        ((Human) father).addChildren(p);
        ((Human) mother).addChildren(p);
        familyTree.add((T) p);
    }
    /**
     * метод, если Human вступил в брак с присваиванием ID брака
     * @param husband сохраняется как супруг
     * @param wife сохраняется как супруга
     */
    public void marriage(T husband, T wife){
        ((Human)husband).setMarriageNo(++marriageCount);
        ((Human)wife).setMarriageNo(marriageCount);
    }

    public T getPerson(String name, String data){
        ArrayList<Human> findList = new ArrayList<>();
        for (T test : familyTree) {
            if (((Human)test).getName() == name && ((Human)test).getData() == data) {
                findList.add((Human) test);
            }
        }
        return (T) findList.get(0);
    }
    /**
     * метод перебора дерева с помощью итератора
     * вызов метода speak через интерфейс
     */
    public void Print(){
        for (T human : familyTree){
            System.out.println(human);
//            human.speak();
        }
    }
    public void Print2(String name){
        ArrayList<T> findList = new ArrayList<>();
        for (T test : familyTree) {
            if (((Human)test).getName() == name){
                findList.add((T) test);
            }
        }
        for (int i = 0; i < findList.size(); i++) {
            System.out.println(findList.get(i));
       }
    }
    @Override
    public Iterator<T> iterator() {
        return new GroupIterator(familyTree);
//        return familyTree.iterator();
    }
    public void sortByName() {
        Collections.sort(familyTree, new HumanComparatorByName());
    }

}
