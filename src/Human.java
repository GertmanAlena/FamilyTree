import java.util.ArrayList;
/**
 * метод создания сущности Human
 * implements Comparable<Human> говорит о том, что мы сможем производить сортировку
 * <Human> с чем сравниваем
 * тут конструктор, гетеры и сетеры,сетод создания списка детей
 * переопределён метод toString
 * переопределён метод speak
 * переопределён метод compareTo
 */
public class Human implements Comparable<Human> {
    private String name;
    private int id;
    private String gender;
    private String data;
    private Human father;
    private Human human;
    private Human mother;
    private int marriageNo;
    private ArrayList<Human> children;
    public Human(String name, String data, String gender, Human father, Human mother){
        this.name = name;
        this.data = data;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
    }
    public Human(Human human){
        this.human = human;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human getHuman() {
        return human;
    }
    public void setHuman(Human human) {
        this.human = human;
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public int getMarriageNo() {
        return marriageNo;
    }
    public void setMarriageNo(int marriageNo) {
        this.marriageNo = marriageNo;
    }
    public ArrayList<Human> getChildren() {
        return children;
    }
    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public void addChildren(Human human) {
        if (this.getChildren() == null) {this.setChildren(new ArrayList<Human>());}
        this.getChildren().add(human);
    }

    @Override
    public String toString() {
        return "Human[id=" + id + ", name=" + name + ", data=" + data +  ", gender=" + gender + ", marriageNo="
                + marriageNo +  ", children=" + children + "]";
    }

    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.getName()); // в String-ах уже есть метод compareTo
    }
}
