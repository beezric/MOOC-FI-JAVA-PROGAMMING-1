
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(" ");
            
            for (String string : pieces) {
                System.out.println(string);
            }
        }


    }
}
