import java.text.NumberFormat;
import java.util.Locale;

public class Problem3{

    public static void main(String[] args){
         
        double number = 12345.67;
        String unParsedNumber = "12,345.678";

        System.out.println(number+" in the UK writes like: "+formatToUK(number));
        
        System.out.println(number+" in the US currency writes like: "+formatToUS(number));


        System.out.println(unParsedNumber+" is a String, but now it can be parse to a type Number like: "+parseToNumber(unParsedNumber));
    }

    public static String formatToUK(double number){

        Locale uk = new Locale("en", "UK");

        NumberFormat nf = NumberFormat.getInstance(uk);
        nf.setMaximumFractionDigits(2); //I hope you meant have the number to have a maximum length of 2 after decimal, and not always :)


        return nf.format(number);

    }

    public static String formatToUS(double number){

        Locale us = new Locale("en", "US");

        NumberFormat nf = NumberFormat.getCurrencyInstance(us);


        return nf.format(number);

    }

    public static Number parseToNumber(String number){

        Locale uk = new Locale("en", "UK"); // I liked the UK Locale :)

        NumberFormat nf = NumberFormat.getInstance(uk);


        try{
            return nf.parse(number);

        }
        catch(Exception e){
            System.out.println("Something went wrong :O"+e);
            return 0;
        }

    }

}
