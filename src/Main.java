import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("―――――――――BEAUTY ROOM―――――――――");
        System.out.println("Доброго дня , оберіть будь ласка майстра.");
        Scanner sc = new Scanner(System.in);
        String customer = sc.nextLine();



        //Список працівників
        Employee firstBrow= new Employee("Олена" , "бровист" , "початківець");
        Employee secondBrow = new Employee("Діана","бровист" , "майстер");
        Employee firstLash = new Employee("Юлія", "lash-мейкер", "початківець");
        Employee secondLash = new Employee("Вікторія","lash-мейкер","майстер");
        Employee firstMu = new Employee("Катерина","візажист","початківець");
        Employee secondMu = new Employee("Адріана","візажист","майстер");
        //Дні для акції
        TodayDay day1 = new TodayDay("вівторок");
        TodayDay day2 = new TodayDay("субота");

        // Вибір працівника

        if (customer.equalsIgnoreCase(firstBrow.name)){
            firstBrow.employee();
        } else if (customer.equalsIgnoreCase(secondBrow.name)) {
            secondBrow.employee();
        } else if (customer.equalsIgnoreCase(firstLash.name)) {
            firstLash.employee();
        } else if (customer.equalsIgnoreCase(secondLash.name)) {
            secondLash.employee();
        } else if (customer.equalsIgnoreCase(firstMu.name)){
            firstMu.employee();
        } else if (customer.equalsIgnoreCase(secondMu.name)) {
            secondMu.employee();
        }

        String se = sc.nextLine();




        // Вибір послуги
        switch (se){
            case "Фарбування брів фарбою/хною": {
                if (customer.equalsIgnoreCase(firstBrow.name)) {
                    System.out.println("Вартість даної послуги 200грн");
                } else if (customer.equalsIgnoreCase(secondBrow.name)) {
                    System.out.println("Вартість даної послуги 300грн");
                }
                break;
            }

                case "Ламінування брів":{
                    if(customer.equalsIgnoreCase(firstLash.name)){
                        System.out.println("Вартість даної послуги 400");
                    } else if (customer.equalsIgnoreCase(secondLash.name)) {
                        System.out.println("Вартість даної послуги 500грн");
                    }
                    break;}
                case "Нарощення вій класика":{
                    if(customer.equalsIgnoreCase(firstLash.name)){
                        System.out.println("Вартість даної послуги 500");
                    } else if (customer.equalsIgnoreCase(secondLash.name)) {
                        System.out.println("Вартість даної послуги 600грн");
                    }
                    break;}
                case "Нарощення вій 2Д":{
                    if(customer.equalsIgnoreCase(firstLash.name)){
                        System.out.println("Вартість даної послуги 550");
                    } else if (customer.equalsIgnoreCase(secondLash.name)) {
                        System.out.println("Вартість даної послуги 650грн");
                    }
                    break;}
                case "Нарощення вій 3Д":{
                    if(customer.equalsIgnoreCase(firstLash.name)){
                        System.out.println("Вартість даної послуги 600");
                    } else if (customer.equalsIgnoreCase(secondLash.name)) {
                        System.out.println("Вартість даної послуги 700грн");
                    }
                    break;}
                case "Макіяж нюд":{
                    if(customer.equalsIgnoreCase(firstMu.name)){
                        System.out.println("Вартість даної послуги 450");
                    } else if (customer.equalsIgnoreCase(secondMu.name)) {
                        System.out.println("Вартість даної послуги 550грн");
                    }
                    break;}
                case "Макіяж вечірній":{
                    if(customer.equalsIgnoreCase(firstMu.name)){
                        System.out.println("Вартість даної послуги 650");
                    } else if (customer.equalsIgnoreCase(secondMu.name)) {
                        System.out.println("Вартість даної послуги 750грн");
                    }
                    break;}
                case "Макіяж весільний":{
                    if(customer.equalsIgnoreCase(firstMu.name)){
                        System.out.println("Вартість даної послуги 1000");
                    } else if (customer.equalsIgnoreCase(secondMu.name)) {
                        System.out.println("Вартість даної послуги 1200грн");
                    }
                    break;}
                default:
                    System.out.println("У нас немає обраної послуги");
            }

            //Акція
        if(TodayDay.day.equalsIgnoreCase("вівторок")){
            System.out.println("Сьогодні вівторок ви можете отримати знижку 50-100грн");
        }
        else {
            System.out.println("Сьогодні субота ви можете отримати знижку 50-100грн");
        }
        TodayDay.sale();






//        firstBrow.employee();
//        Course browCourse = new Course("Базовий курс архітектури брів", 3000.0  ,7.0 );
//        browCourse.course(firstBrow);
       // Service set1 = new Service();
//        set1.setPrice(firstBrow);
       // set1.priceSet(secondBrow);







    }
}