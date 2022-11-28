import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * class Tree итерируемый создаёт дерево List<Human> familyTree
 */
public class Tree implements Iterable<Human>{
    /**
     * класс формирования дерева
     */
    static List<Human> familyTree = new ArrayList<>();
    int idCount;
    int marriageCount;

    /**
     *
     * @param name имя человека
     * @param data дата рождения
     * @param gender пол человека
     */
     public void createFamilyHeader(String name, String data, String gender){
        Human p = new Human(name,  data, gender,  null, null);
        p.setId(idCount);
        idCount+=1;
        familyTree.add(p);
    }
    /**
     * метод рождения ребёнка
     * @param father отец
     * @param mother мать
     * @param name имя ребёнка
     * @param data дата рождения ребёнка
     * @param gender пол ребёнка
     */
    public void born(Human father, Human mother, String name, String data, String gender){
        Human p = new Human(name, data, gender, father, mother);
        p.setId(idCount);
        father.addChildren(p);
        mother.addChildren(p);
        familyTree.add(p);
        idCount+=1;
    }

    /**
     * метод, если Human вступил в брак с присваиванием ID брака
     * @param husband сохраняется как супруг
     * @param wife сохраняется как супруга
     */
    public void marriage(Human husband, Human wife){
        marriageCount +=1;
        husband.setMarriageNo(marriageCount);
        wife.setMarriageNo(marriageCount);
    }
    public Human getPerson(String name, String data){
        ArrayList<Human> findList = new ArrayList<>();
        for (Human test : familyTree) {
            if (test.getName() == name && test.getData() == data) {
                findList.add(test);
            }
        }
        return findList.get(0);
    }

    /**
     * метод перебора дерева с помощью итератора
     */
    public void Print(){
        for (Human human : familyTree){
            System.out.println(human);
            human.speak();
        }
    }
    public void Print2(String name){
        ArrayList<Human> findList = new ArrayList<>();
        for (Human test : familyTree) {
            if (test.getName() == name){
                findList.add(test);
            }
        }
        for (int i = 0; i < findList.size(); i++) {
            System.out.println(findList.get(i));
       }
    }

    @Override
    public Iterator<Human> iterator() {
        return new GroupIterator(familyTree);
//        return familyTree.iterator();
    }
}
