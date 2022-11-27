import java.util.ArrayList;
import java.util.List;

public abstract class Animals implements Speakable {
    private String name;
    private String color;
    private int idAnimal;

    public void Animals(String name, String color, Human human) {
        this.name = name;
        this.color = color;
        this.idAnimal = human.getId();

//        animals.add(this);
    }
//    public Animals(Animals animals){
//        this.animals = animals;
//    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;}
    public void setIdAnimal(int idAnimal){
        this.idAnimal = idAnimal;
    }
    public int getIdAnimal(){
        return idAnimal;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString() {
        return String.format("имя %s, цвет %s, id %d", name, color, idAnimal);
    }

}
