
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        int oldest = 0;
        String longest = "";

        while (true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);

            if(age > oldest) {
                oldest = age;
                longest = pieces[0];
            }
        }

       
        System.out.println("Name of the longest: " + longest);

    }
}
