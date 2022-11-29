public class Animals {
    private int idAnimal;
    private String name;
    private String master;
    private Animals animals;

    public Animals(String name, String master) {
        this.name = name;
        this.master = master;
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
        return "питомец [id=" + idAnimal + ", name=" + name + ", хозяин=" + master + " с ID-" + idAnimal + "]";
    }
}


