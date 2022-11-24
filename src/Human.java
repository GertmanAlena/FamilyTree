import java.util.ArrayList;

public class Human {
    private String name;
    private int id;
    private String gender;
    // добавить день рождения
    private Human father;
    private Human human;
    private Human mother;
    private int marrageNo;
    private int generation;
    private ArrayList<Human> children;
    public Human(String name, String gender, Human father, Human mother){
        this.name = name;
        //дата рождения
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
    public int getMarrageNo() {
        return marrageNo;
    }
    public void setMarrageNo(int marrageNo) {
        this.marrageNo = marrageNo;
    }
    public int getGeneration() {
        return generation;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
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
        return "Human[id=" + id + ", name=" + name +  ", gender=" + gender + ", marrageNo="
                + marrageNo +  ", children=" + children + "]"; //дата рождения
    }
}
