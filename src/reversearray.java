
import java.util.*;

public class reversearray {

    public static void main(String[] args) {
        List<Integer> ListTurnAround = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
        System.out.println(ListTurnAround);
        Collections.reverse(ListTurnAround);
        System.out.println(ListTurnAround);
    }

}
