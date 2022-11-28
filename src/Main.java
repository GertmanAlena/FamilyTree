public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.createFamilyHeader("Sergey", "01.01.1937", "M");
        tree.createFamilyHeader("Elizaveta", "01.01.1935", "W");
        tree.marriage(tree.getPerson("Sergey", "01.01.1937"), tree.getPerson("Elizaveta", "01.01.1935"));
        tree.born(tree.getPerson("Sergey", "01.01.1937"), tree.getPerson("Elizaveta", "01.01.1935"), "Valentina", "29.07.1959", "W");

        tree.createFamilyHeader("Aleksandr", "24.09.1963", "M");
        tree.marriage(tree.getPerson("Aleksandr", "24.09.1963"), tree.getPerson("Valentina", "29.07.1959"));
        tree.born(tree.getPerson("Aleksandr", "24.09.1963"), tree.getPerson("Valentina", "29.07.1959"), "Elena", "13.12.1984", "W");

        tree.createFamilyHeader("Ivan", "02.02.1936", "M");
        tree.createFamilyHeader("Tomara", "02.02.1938", "W");
        tree.marriage(tree.getPerson("Ivan", "02.02.1936"), tree.getPerson("Tomara", "02.02.1938"));
        tree.born(tree.getPerson("Ivan", "02.02.1936"), tree.getPerson("Tomara", "02.02.1938"), "Tany", "14.07.1963", "W");
        tree.createFamilyHeader("Sergey", "04.04.1959", "M");
        tree.marriage(tree.getPerson("Sergey", "04.04.1959"), tree.getPerson("Tany", "14.07.1963"));
        tree.born(tree.getPerson("Sergey", "04.04.1959"), tree.getPerson("Tany", "14.07.1963"), "Aleksandr", "19.03.1985", "M");
//            tree.createFamilyHeader("Aleksandr", "19.03.1985", "M");
        tree.marriage(tree.getPerson("Aleksandr", "19.03.1985"), tree.getPerson("Elena", "13.12.1984"));
        tree.born(tree.getPerson("Aleksandr", "19.03.1985"), tree.getPerson("Elena", "13.12.1984"), "Liza", "12.02.2009", "W");
        tree.born(tree.getPerson("Aleksandr", "19.03.1985"), tree.getPerson("Elena", "13.12.1984"), "Danila", "16.03.2014", "M");

        tree.Print();
        System.out.println("--------------------------------");
        tree.Print2("Aleksandr");
        System.out.println("--------------------------------");


        System.out.println("****************************");
        tree.sortByName();
        tree.Print();
        System.out.println("***********Animals***********");
        TreeAnimals anim = new TreeAnimals();
        anim.createAnimalHeader("Мася", tree.getPerson("Aleksandr", "19.03.1985"));
        anim.createAnimalHeader("Чейза", tree.getPerson("Elena", "13.12.1984"));
        anim.printAnimal();
    }


}