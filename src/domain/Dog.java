package domain;

import utils.Counter;

import java.util.Objects;

public class Dog {
    private final int ID;
    private String name;
    private String type;

    public Dog() {
        this.ID = Counter.getCount();
    }

    public Dog(String name, String type) {
        this();
        this.name = name;
        this.type = type;
    }

    public Dog(int ID, String name, String type) {
        this.ID = ID;
        this.name = name;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, type);
    }

    @Override
    public String toString() {
        return name + ";" + type;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}