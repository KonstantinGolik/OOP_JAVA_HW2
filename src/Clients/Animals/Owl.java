package Clients.Animals;

import Clients.Animal;
import Clients.Flyable;
import Clients.Goable;
import Clients.Owner;

import java.time.LocalDate;

public class Owl extends Animal implements Goable, Flyable {

        public Owl (String name, float weight, LocalDate age, Owner owner) {
            super(name, weight, age, owner);
        }

        @Override
        public void fly() {
            System.out.println(getType() + " летает со скоростью 10 км/ч");
        }

    @Override
    public void run() {
        System.out.println(getType() + " бегает со скоростью 2 км/ч");
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " ходит со скоростью 0,1 км/ч");
    }
    }


