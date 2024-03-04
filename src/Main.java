import Clients.*;
import Clients.Animals.*;
import Clients.Personnel.Doctor;
import Clients.Personnel.Nurse;
import Clients.Personnel.Staff;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лёва", 150, LocalDate.now(), new Owner());
//        System.out.println(leva); // Вывели всю информацию о этом животном
        leva.swim();
        leva.toGo();

        Lion puzo = new Lion("Симба", 250, LocalDate.now(), new Owner());
        Dog mailo = new Dog("Шарик", 40,LocalDate.now(), new Owner());
//        System.out.println(mailo); // Вывели всю информацию о этом животном (собаке)
        mailo.toGo();
        mailo.swim();
//        System.out.println(leva.getName()); // просмотрели имя данного животного (Лёва)
//        leva.setWeight(175); // изменили вес данного животного (льва Лёва)
//        System.out.println(leva);
//        System.out.println(puzo);
//        System.out.println(puzo.getType()); // Вывели тип к которому относится данно животное(Lion)
//        System.out.println(mailo.getType()); // Вывели тип к которому относится данно животное(Dog)
        Lion test = new Lion();
//        System.out.println(test);
//        mailo.liveCycle();
        test.run();

//        List<Animal> animals = new ArrayList<>();
////        animals.add(puzo);
////        animals.add(mailo);
////        animals.add(leva);
//        System.out.println(animals);

        PolarBear cold = new PolarBear("Снежок", 450, LocalDate.now(), new Owner());
//        System.out.println(cold);
//        cold.toGo();
//        cold.swim();
//        cold.fly();
        Shark darkShark = new Shark("Чернышь", 400, LocalDate.now(), new Owner());
//        System.out.println(darkShark);
        darkShark.swim();

        Crow crow = new Crow ("Карыч", 1, LocalDate.now(), new Owner());
//        System.out.println(crow);
        crow.toGo();
        crow.fly();
        Fox fox = new Fox("Патрикеевна", 15, LocalDate.now(), new Owner());
//        System.out.println(fox);
        fox.swim();
        fox.toGo();
        Owl owl = new Owl("Сова", 10, LocalDate.now(), new Owner());
//        System.out.println(owl);
        owl.fly();
        owl.run();

        Doctor doc = new Doctor("Айболит", "Доктор", 4.5);
        System.out.println(doc);
        doc.examinesTheAnimal();
        doc.healAnimal();
        doc.workStuff();

        Nurse meg = new Nurse("Meg", "Мед сестра", 1.5);
        System.out.println(meg);
        meg.workStuff();
        meg.injects();
        meg.fillsOutAMedicalHistory();

        Doctor koul = new Doctor("Koul", "Хирург", 3.5);
        System.out.println(koul);
        koul.operatesOnTheAnimal();

        VeterinaryClinic hospital = new VeterinaryClinic("Живчик");
        hospital.addPersonell(doc);
        hospital.addPersonell(meg);
        hospital.addPersonell(koul);

        System.out.println(hospital.getPersonell());

        hospital.removePersonell(meg);
        hospital.addAnimal(darkShark);
        hospital.addAnimal(owl);
        hospital.addAnimal(cold);
        hospital.addAnimal(crow);
        System.out.println(hospital.getAllAmimals());
        hospital.removeAnimal(owl);
        System.out.println(hospital.getAllAmimals());

        System.out.println(hospital.getSwimmable());
        System.out.println(hospital.getFlyable());
        System.out.println(hospital.getPersonell());
    }
}
