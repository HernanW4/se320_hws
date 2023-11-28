import java.time.LocalDate;

public class Problem1{

    public static void main(String[] args){

        System.out.println("This program shall attempt to calculate how many days has passed since my Bday");
        System.out.println("\nMy Birthday is March 23, 2002 or 03/23/2002");

        int birthYr = 2002;
        int birthDay = 23;
        int birthMth = 03;

        Day myBday = new Day(birthYr,birthMth,birthDay);

        LocalDate currentDate = LocalDate.now();


        Day today = new Day(currentDate.getYear(), currentDate.getMonthValue(), currentDate.getDayOfMonth());

        int daysPassed = today.daysFrom(myBday);

        System.out.println(daysPassed);

    




    }
}
