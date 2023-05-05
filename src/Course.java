public class Course {
    String title;
    double prices;
    double duration;

    public Course(String title, double prices, double duration) {
        this.title = title;
        this.prices = prices;
        this.duration = duration;

    }
        //Все про курс
    void course(Employee employee){
        if (employee.experience.equalsIgnoreCase("майстер")){
            System.out.println("Я можу записати вас на "+ title + ". Його вартість "+ prices + "грн , і тривалість "+ duration + " днів.");
        }
        else {
            System.out.println("Я ще не маю достатньо досвіду , щоб провеси курси(");
        }
    }
}
