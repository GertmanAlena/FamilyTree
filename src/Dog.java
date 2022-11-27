import java.util.ArrayList;
import java.util.List;

public class Dog extends Animals{
//    static List<Dog> dog = new ArrayList<>();
    public Dog(){
        super();
    }
    @Override
    public void speak() {
        System.out.println("Я собачка " + getName() + " ID моего хозяина " + getIdAnimal());
    }
}
