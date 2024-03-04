package Clients.Animals;

import Clients.Animal;
import Clients.Goable;
import Clients.Owner;
import Clients.Swimmable;

import java.time.LocalDate;

public class Lion extends Animal implements Swimmable, Goable {

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }

    @Override
    public void run() {
        System.out.println(getType() + " бегает со скоростью 60 км/ч");
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " ходит со скоростью 2 км/ч");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " плавает со скоростью 10 км/ч");
    }
//    @Override
//    public void fly() {
//        System.out.println(getType() + " Can't Fly");
//    }
}
