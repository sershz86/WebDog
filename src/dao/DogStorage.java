package dao;

import domain.Dog;

import java.util.ArrayList;
import java.util.List;

public class DogStorage {
    private static DogStorage instance;
    private List<Dog> dogs;

    private DogStorage() {
        dogs = new ArrayList<>();
        dogs.add(new Dog(1,"sharic", "shepherd"));
    }

    private DogStorage(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public static DogStorage getInstance() {
        if (instance == null) {
            instance = new DogStorage();
        }
        return instance;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Dog getDogById(int id) {
        return dogs.stream()
                .filter(dog -> dog.getID() == id)
                .findFirst()
                .orElse(null);
    }

    public void add(String name, String type) {
        dogs.add(new Dog(name, type));
    }

    public void update(int id, String name, String type) {
        /*Dog dog = new Dog(id, name, type);
        dogs.set(dogs.indexOf(getDogById(id)), dog);*/

        dogs.forEach(dog -> updateDog(dog, id, name, type));
    }

    public void delete(int id) {
        dogs.remove(getDogById(id));
    }

    private void updateDog(Dog dog, int id, String name, String type) {
        if (id == dog.getID()) {
            dog.setName(name);
            dog.setType(type);
        }
    }
}
