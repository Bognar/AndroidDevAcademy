
import java.util.*;

public class MatrixCode {

    public static void main(String[] args) {
        String Lista[] = {"T", "R", "", "5", "S", "I", "M", "9", " ", "C", "o", "B", "e"};

        Random r = new Random();

        for (int t = 0; t <= 100; t++) {
            for (int i = 0; i < 200; i++) {
                String rnd = Lista[r.nextInt(Lista.length)];
                System.out.print((rnd) + " ");

            }
            System.out.println(" ");
        }
    }
}