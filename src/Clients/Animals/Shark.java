package Clients.Animals;

import Clients.Animal;
import Clients.Owner;
import Clients.Swimmable;

import java.time.LocalDate;

public class Shark extends Animal implements Swimmable {
    public Shark(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void swim() {
        System.out.println(getType() + " плавает со скоростью 55 км/ч");
    }

//    @Override
//    public void toGo() {
//        System.out.println(getType() + " Can't ToGo");
//    }
//    @Override
//    public void fly() {
//        System.out.println(getType() + " Can't Fly");
//    }
}
