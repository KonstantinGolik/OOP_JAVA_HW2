package Clients.Personnel;

public class Doctor extends Staff {
    public Doctor(String name, String profession, double experience) {
        super(name, profession, experience);
    }

    @Override
    public void workStuff() {
        System.out.println("Сотрудник на должности " + getType() + " должен выполнять обязонности в которые входит осмотр, лечение и проведение операций.");
    }
    public void healAnimal(){
            System.out.println(getType() + " лечит животное");
    }

    public void examinesTheAnimal() {
            System.out.println(getType() + " осматривает животное");
    }


    public void operatesOnTheAnimal() {
            System.out.println(getType() + " оперирует животное");
    }
}

