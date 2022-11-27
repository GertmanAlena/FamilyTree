import java.util.ArrayList;
import java.util.List;

public class Cat extends Animals{
//    static List<Cat> cat = new ArrayList<>();
    public Cat(){
       super();
    }
    @Override
    public void speak() {
       System.out.println("Я кошечка " + getName() + " ID моего хозяина " + getIdAnimal());
    }
}
