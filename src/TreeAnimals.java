import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreeAnimals implements Iterable<Animals> {
    private List<Animals> animals = new ArrayList<>();
    Human father;

    public void createAnimalHeader(String name, Human father){
        Animals a = new Animals(name, father);
        a.setIdAnimal(father);
        animals.add(a);
    }

    @Override
    public Iterator<Animals> iterator() {
        return animals.iterator();
    }
    public void printAnimal(){
        for(Animals anim : animals){
//            System.out.println(anim.getName() + anim.getIdAnimal());
            System.out.println(anim);
        }
    }
}
