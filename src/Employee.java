public class Employee {
    String name;
    String profession;
    String experience;

    public Employee(String name, String profession, String experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }
    //Знайомство з працівником
    void employee(){
        System.out.println("Привіт! Мене звати "+ name + ", я " + profession + " " + experience + ",що бажаєте зробити?");
    }

}
