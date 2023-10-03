import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        double F = 0;
        double x;
        System.out.print("a = ");
        double a = skan.nextDouble();
        System.out.print("b = ");
        double b = skan.nextDouble();
        System.out.print("c = ");
        double c = skan.nextDouble();
        System.out.print("xp = ");
        double xp = skan.nextDouble();
        System.out.print("xk = ");
        double xk = skan.nextDouble();
        System.out.print("dx = ");
        double dx = skan.nextDouble();

        DecimalFormat df2 = new DecimalFormat("0.000");

        System.out.println("------------------------");
        System.out.println("| " + String.format("%7s", "x") + " | " + String.format("%10s", "y") + " |");
        System.out.println("------------------------");

        x = xp;
        while (x <= xk) {
            if (x < 1 && c != 0) {
                F = a * Math.pow(x, 2) + (b / c);
            }
            if (x > 1.5 && c == 0) {
                F = (x - a) / Math.pow((x - c), 2);
            }
            if (!(x < 1 && c != 0) && !(x > 1.5 && c == 0)) {
                F = Math.pow(x, 2) / Math.pow(c, 2);
            }
            System.out.println("| " + String.format("%7s", F) + " | " + String.format("%10s", df2.format(F)) + " |");

            if (x < 1 && c != 0) {
                F = a * Math.pow(x, 2) + (b / c);
            } else if (x > 1.5 && c == 0) {
                F = (x - a) / Math.pow((x - c), 2);
            } else {
                F = Math.pow(x, 2) / Math.pow(c, 2);
            }

            System.out.println("| " + String.format("%7s", F) + " | " + String.format("%10s", df2.format(F)) + " |");
            x += dx;
        }
        System.out.println("------------------------");
    }
}

