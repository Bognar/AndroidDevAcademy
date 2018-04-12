
import java.util.*;

public class IntToDigit {
    public static void main(String[] args) {
        int number = 1234567890;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(result);
        System.out.println(result);


    }
}