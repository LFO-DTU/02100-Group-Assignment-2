import java.util.Random;
import java.util.Scanner;

public class OPG4b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter size of grid: ");
        int n = scanner.nextInt();

        StdDraw.setXscale(-n - 1, n + 1);
        StdDraw.setYscale(-n - 1, n + 1); // Skaler således at man kan se skridtet som går udover grænserne
        StdDraw.setPenRadius(1.0 / (2*n + 2)); // et forsøg på at skalere prikkerne basseret på størrelsen af griddet
                                   

        int x = 0;
        int y = 0;
        int steps = 0;

        StdDraw.point(x, y);
        System.out.println("Position = (" + x + "," + y + ")");

        while (x >= -n && x <= n && y >= -n && y <= n) {  //tjek om grænserne er overtrådt og opdater koordinater

            int direction = random.nextInt(4);

            if (direction == 0) {
                y++;
            }
            else if (direction == 1) {
                y--;
            }
            else if (direction == 2) {
                x++;
            }
            else {
                x--;
            }

            steps++;

            StdDraw.point(x, y);
            System.out.println("Position = (" + x + "," + y + ")");
        }

        System.out.println("Total number of steps = " + steps);

        scanner.close();
    }
}
