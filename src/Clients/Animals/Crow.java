package Clients.Animals;

import Clients.Animal;
import Clients.Flyable;
import Clients.Goable;
import Clients.Owner;

import java.time.LocalDate;
public class Crow extends Animal implements Goable, Flyable {
    public Crow (String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " летает со скоростью 5 км/ч");
    }

    @Override
    public void run() {
        System.out.println(getType() + " бегает со скоростью 1 км/ч");
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " ходит со скоростью 0,2 км/ч");
    }
}
