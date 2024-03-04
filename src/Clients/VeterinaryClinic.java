package Clients;

import Clients.Personnel.Staff;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected String nameClinic;
    private List<Staff> Personnel = new ArrayList<>();
    private List<Animal> AllAnimals = new ArrayList<>();

    public VeterinaryClinic(String nameClinic) {
        this.nameClinic = nameClinic;
        this.AllAnimals = new ArrayList<>();
        this.Personnel = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        AllAnimals.add(animal);
    }

    public void addPersonell(Staff staff) {
        Personnel.add(staff);
    }

    public void removeAnimal(Animal animal) {
        AllAnimals.remove(animal);
    }

    public void removePersonell(Staff worker) {
        Personnel.remove(worker);
    }

    public List<Animal> getFlyable() {
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : AllAnimals) {
            if (animal instanceof Flyable) {
                flyable.add(animal);
            }
        }
        return flyable;
    }

    public List<Animal> getSwimmable() {
        List<Animal> swimable = new ArrayList<>();
        for (Animal animal : AllAnimals) {
            if (animal instanceof Swimmable) {
                swimable.add(animal);
            }
        }
        return swimable;
    }

    public List<Animal> getGoable() {
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : AllAnimals) {
            if (animal instanceof Goable) {
                goable.add(animal);
            }
        }
        return goable;
    }

    public List<Staff> getPersonell() {
        return Personnel;
    }
    public List<Animal> getAllAmimals() {
        return AllAnimals;
    }
}