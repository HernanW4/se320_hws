import java.util.InputMismatchException;
import java.util.Scanner;

public class AssertTesting{
    public static void main(String[] args) {
        int number = takeInput();

        assert 0 <= number && number <= 10 : "The entered number is out of range";

    }

    public static int takeInput(){
        Scanner input = new Scanner(System.in);
        int number = 0;

        do{
            try{
                System.out.println("Please enter a number between 0 and 10: ");
                number = input.nextInt();

                break;
            }catch(InputMismatchException e){ // Can't go wrong with exceptions
                System.out.println("Please enter a valid number/integer...\n\n");
                input.nextLine();
            }
        }
        while(true);

        return number;
    }


}
