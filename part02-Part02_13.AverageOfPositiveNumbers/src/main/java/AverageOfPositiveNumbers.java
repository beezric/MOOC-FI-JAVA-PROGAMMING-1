
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int positives = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if(input > 0) {
                positives++;
                sum+= input;
            }

        }
        if(positives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / positives * 1.0;
            System.out.println(average);
        }
    }
}
