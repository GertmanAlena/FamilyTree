import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            Tree tree = new Tree();
            tree.createFamilyHeader("Sergey", "01.01.1937", "M");
            tree.createFamilyHeader("Elizaveta", "01.01.1935", "W");
            tree.marrage(tree.getPerson("Sergey", "01.01.1937"), tree.getPerson("Elizaveta", "01.01.1935"));
            tree.born(tree.getPerson("Sergey", "01.01.1937"), tree.getPerson("Elizaveta", "01.01.1935"), "Valentina", "29.07.1959","W");

            tree.createFamilyHeader("Aleksandr", "24.09.1963", "M");
            tree.marrage(tree.getPerson("Aleksandr", "24.09.1963"), tree.getPerson("Valentina", "29.07.1959"));
            tree.born(tree.getPerson("Aleksandr", "24.09.1963"), tree.getPerson("Valentina", "29.07.1959"), "Elena", "13.12.1984", "W");

            tree.createFamilyHeader("Ivan", "02.02.1936", "M");
            tree.createFamilyHeader("Tomara", "02.02.1938", "W");
            tree.marrage(tree.getPerson("Ivan", "02.02.1936"), tree.getPerson("Tomara", "02.02.1938"));
            tree.born(tree.getPerson("Ivan", "02.02.1936"), tree.getPerson("Tomara", "02.02.1938"), "Tany", "14.07.1963", "W");
            tree.createFamilyHeader("Sergey", "04.04.1959", "M");
            tree.marrage(tree.getPerson("Sergey", "04.04.1959"), tree.getPerson("Tany", "14.07.1963"));
            tree.born(tree.getPerson("Sergey", "04.04.1959"), tree.getPerson("Tany", "14.07.1963"), "Aleksandr", "19.03.1985", "M");
//            tree.createFamilyHeader("Aleksandr", "19.03.1985", "M");
            tree.marrage(tree.getPerson("Aleksandr", "19.03.1985"), tree.getPerson("Elena", "13.12.1984"));
            tree.born(tree.getPerson("Aleksandr", "19.03.1985"), tree.getPerson("Elena", "13.12.1984"), "Liza", "12.02.2009", "W");
            tree.born(tree.getPerson("Aleksandr", "19.03.1985"), tree.getPerson("Elena", "13.12.1984"), "Danila", "16.03.2014", "M");

            tree.Print();
            System.out.println("--------------------------------");
            tree.Print2("Aleksandr");
            System.out.println("--------------------------------");

            List<Speakable> animals = new ArrayList<>();
            Animals cat = new Cat();
            cat.Animals("Masy", "black", tree.getPerson("Elena", "13.12.1984"));
            animals.add(cat);
            cat = new Cat();
            cat.Animals("Koty", "black", tree.getPerson("Aleksandr", "24.09.1963"));
            animals.add(cat);


            Animals dog = new Dog();
            dog.Animals("Cheyza", "rad", tree.getPerson("Aleksandr", "19.03.1985"));
            animals.add(dog);
            for (Speakable speakable : animals){
                    speakable.speak();
            }


    }


}