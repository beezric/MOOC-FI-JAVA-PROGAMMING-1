
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(" ");

            for (String string : pieces) {
                if(string.contains("av")) {
                    System.out.println(string);
                }
            }
        }
    }
}
