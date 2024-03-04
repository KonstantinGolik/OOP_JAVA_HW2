package Clients.Personnel;

public abstract class Staff {
    protected String name;
    protected String profession;
    protected double experience;


    public Staff(String name, String profession, double experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }
    public String toString() {
        return String.format("name = %s, profession = %s, experience = %s", name, profession, experience);
    }
    public String getType(){
        return getClass().getSimpleName();
    }

    public abstract void workStuff();

}
