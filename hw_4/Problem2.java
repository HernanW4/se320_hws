import java.io.*;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;

public class Problem2{

    public static void main(String[] args){
        //I used a test file with Lorem generated text
        TreeSet<String> noDuplicates = getTreeSetFromFile("testing.txt");

        System.out.println("TreeSet:\n"+noDuplicates);
         
    }

    public static TreeSet<String> getTreeSetFromFile(String fileName){

        TreeSet<String> set = new TreeSet<>();

        //We put this into a try-catch block as it can throw an Exeception.
        //We can be fancy and do a try-catch with resource :O 
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String st;
            while ((st = br.readLine()) != null) {
                //Honestly took 10 minutes figuring out how to replace all commas and periods.
                //God bless stackoverflow
                String[] linesToWords = st.replaceAll("[,\\.]","").split("\\s+"); //Splits sentences into words

                for(String word: linesToWords){

                    //Add every single word separately
                    set.add(word);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return set;
    }
}
