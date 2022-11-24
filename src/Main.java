public class Main {
    public static void main(String[] args) {
            Tree tree = new Tree();
            tree.createFamilyHeader("Sergey", "M");
            tree.createFamilyHeader("Elizaveta", "W");

            tree.born(tree.getPerson("Sergey"), tree.getPerson("Elizaveta"), "Valentina", "W");
            tree.born(tree.getPerson("Sergey"), tree.getPerson("Elizaveta"), "Vladimir", "M");

            tree.createFamilyHeader(tree.getPerson("Valentina"));
            tree.createFamilyHeader("Aleksandr", "M");
            tree.marrage(tree.getPerson("Aleksandr"), tree.getPerson("Valentina"));
            tree.born(tree.getPerson("Aleksandr"), tree.getPerson("Valentina"), "Elena", "W");

            tree.createFamilyHeader(tree.getPerson("Elena"));
            tree.createFamilyHeader("Aleks", "M");
            tree.marrage(tree.getPerson("Aleks"), tree.getPerson("Elena"));
            tree.born(tree.getPerson("Aleks"), tree.getPerson("Elena"), "Liza", "W");
            tree.born(tree.getPerson("Aleks"), tree.getPerson("Elena"), "Daniil", "M");



            tree.Print();
            System.out.println("--------------------------------");
            tree.Print2("Sergey");



    }
}