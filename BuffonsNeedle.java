import java.util.Random;
import java.util.Scanner;

public class BuffonsNeedle {
    public static final double NEEDLE_LENGTH = 1;
    public static final double LINE_DISTANCE = 2;

    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of iterations: ");
        int iterations = stdinScanner.nextInt();
        int successfullIterations = 0;
        for (int i = 0; i < iterations; i++) {
            if (simulateNeedle(rand)) {
                successfullIterations++;
            }
        }
        double piApprox = (double) iterations / successfullIterations;
        System.out.println(iterations + "/" + successfullIterations + " = " + piApprox);
        stdinScanner.close();
    }

    public static boolean simulateNeedle(Random rand) {
        double needleBottomDistance = rand.nextDouble() * LINE_DISTANCE;
        double needleAngle = rand.nextDouble() * 180;
        double needleTopDistance = (Math.sin(Math.toRadians(needleAngle)) * NEEDLE_LENGTH) + needleBottomDistance;
        if (needleTopDistance >= LINE_DISTANCE) { return true; }
        return false;
    }
}
