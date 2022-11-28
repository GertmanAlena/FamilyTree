public class Animals {
    private int idAnimal;
    private String name;
    private Animals animals;
    Human father;

    public Animals(String name, Human father) {
        this.name = name;
        this.father = father;
    }
    public Animals(Animals animals){
        this.animals = animals;
    }
    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Human father) {
        this.idAnimal = father.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "питомец [id=" + idAnimal + ", name=" + name + ", хозяин=" + father + "]";
    }
}


