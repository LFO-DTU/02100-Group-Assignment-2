 import java.util.Random;
import java.util.Scanner;
public class OPG4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter size of grid: ");
        int n = scanner.nextInt();

        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("Position = (" + x + "," + y + ")");

        while (x >= -n && x <= n && y >= -n && y <= n) {

            int direction = random.nextInt(4);

            if (direction == 0) {        // nord
                y++;
            }
            else if (direction == 1) {   // syd
                y--;
            }
            else if (direction == 2) {   // øst
                x++;
            }
            else {                       // vest
                x--;
            }

            steps++;

            System.out.println("Position = (" + x + "," + y + ")");
        }

        System.out.println("Total number of steps = " + steps);

        scanner.close();
    }
}




