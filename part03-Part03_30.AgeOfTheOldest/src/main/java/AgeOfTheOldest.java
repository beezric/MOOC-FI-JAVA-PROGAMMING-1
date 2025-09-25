
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int age = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            age = Integer.valueOf(pieces[1]);

            list.add(age);
        }

        int oldest = list.get(0);
        for (Integer integer : list) {
            if (integer > oldest) {
                oldest = integer;
            }
        }
        
        System.out.println("Age of the oldest: "+ oldest);
    }
}
