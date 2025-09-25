
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int count = 0;
        int sum = 0;
        String longest = " ";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            String old = pieces[0];
            sum = sum + Integer.valueOf(pieces[1]);
            
            if(old.length() > longest.length()) {
                longest = old;
            }
            
            count++;
            average = (double) sum * 1.0 / count;
            
            
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
