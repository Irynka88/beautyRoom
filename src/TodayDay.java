public class TodayDay {
   static String day;

    public TodayDay(String day) {
        this.day = day;
    }
    //Генерація знижки
   static void sale(){
        if (day.equalsIgnoreCase("вівторок") || day.equalsIgnoreCase("субота")){
            System.out.println("Ваша знижка " + ((int)Math.round(50 + Math.random() * 101))+"грн");
        }
        else {
            System.out.println();
    }

    }
}
