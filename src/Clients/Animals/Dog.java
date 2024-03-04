package Clients.Animals;

import Clients.Animal;
import Clients.Goable;
import Clients.Owner;
import Clients.Swimmable;

import java.time.LocalDate;

public class Dog extends Animal implements Swimmable, Goable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public void run() {
        System.out.println(getType() + " бегает со скоростью 45 км/ч");
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " ходит со скоростью 2 км/ч");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " плавает со скоростью 4 км/ч");
    }
}
