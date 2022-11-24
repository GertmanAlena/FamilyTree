import java.util.ArrayList;
import java.util.List;

public class Tree {
    static List<Human> familyTree = new ArrayList<Human>();
    int idCount;
    int marregeCount;
    public void createFamilyHeader(String name, String gender){ //дата рождения
        Human p = new Human(name, gender, null, null);
        p.setId(idCount);
        idCount+=1;
        familyTree.add(p);
    }
    public void createFamilyHeader(Human human){ //дата рождения
        Human p = new Human(human);
        familyTree.add(p);
    }

    /**
     * если есть дети, добавляем детей
     * @param father
     * @param mother
     * @param name
     * @param gender
     */
    public void born(Human father, Human mother, String name, String gender){
        Human p = new Human(name, gender, father, mother); //дата рождения
        p.setId(idCount);
        father.addChildren(p);
        mother.addChildren(p);
        familyTree.add(p);
        idCount+=1;
    }
    public void marrage(Human husbend, Human wife){
        marregeCount+=1;
        husbend.setMarrageNo(marregeCount);
        wife.setMarrageNo(marregeCount);
    }
    public Human getPerson(String name){ //дата рождения
        ArrayList<Human> findList = new ArrayList<>();
        for (Human test : familyTree) {
            if (test.getName() == name){
                findList.add(test);
            }
        }
        return findList.get(0);
    }
    public void Print(){
        for (int i = 0; i < familyTree.size(); i++) {
            System.out.println(familyTree.get(i).toString());
        }
    }
    public void Print2(String name){
        ArrayList<Human> findList = new ArrayList<>();
        for (Human test : familyTree) {
            if (test.getName() == name){
                findList.add(test);
            }

        }
        System.out.println(findList);

    }
}
