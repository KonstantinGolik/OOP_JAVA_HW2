package Clients.Personnel;

public class Nurse extends Staff {
    public Nurse(String name, String profession, double experience) {
        super(name, profession, experience);
    }

    @Override
    public  void workStuff() {
        System.out.println("Сотрудник на должности " + getType() + " должен выполнять обязонности в которые входит ведение мед карт и вакцинация");
    }
    public void fillsOutAMedicalHistory() {
        System.out.println(getType() + " Заполняет мед карту");
    }
    public void injects() {
        System.out.println(getType() + " Ставит укол");
    }
}

