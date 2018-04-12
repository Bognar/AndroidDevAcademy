
import java.util.*;

public class MatrixCode {

    public static void main(String[] args) {
        String Lista[] = {"T", "R", "", "5", "M", "I", "X", "9", ""};
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            String rnd = Lista[r.nextInt(Lista.length)];
            System.out.print((rnd) + " ");
            for (int x = 0; x < 50; x++) {
                String rnd2 = Lista[r.nextInt(Lista.length)];
                System.out.print((rnd2) + "\n");
            }

        }
    }
}