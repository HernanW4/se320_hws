import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class HW_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nProblem One: ");
        int sum = problemOne(input);

        System.out.println("The sum of both integers is:  "+ sum);
        System.out.println("\n\nProblem Two: ");

        problemTwo(input);

        input.close();
        
    }


    public static int problemOne(Scanner input){
        int firstInput = 0;
        int secondInput = 0;


        do{
            try{
                System.out.println("Please enter an integer: ");
                firstInput = input.nextInt();

                System.out.println("Please enter another integer: ");
                secondInput = input.nextInt();

                break;
            }catch(InputMismatchException e){
                System.out.println("Both inputs must be an integers, please try again...\n\n");
                input.nextLine();
            }
        }
        while(true);

        return firstInput + secondInput;
    }

    public static void problemTwo(Scanner input){
        Integer[] array = problemTwoGetArr();
        try{
           System.out.println("Please enter an index from 1-100: "); 
           int index = input.nextInt();

           System.out.println("The array at "+index+", is "+array[index-1]);

        }catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }

    }

    public static Integer[] problemTwoGetArr(){
        Integer[] array = new Integer[100];

        Random rand = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100000);
        }

        return array;
    }
}
