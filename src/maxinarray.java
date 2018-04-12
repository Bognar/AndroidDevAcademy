import java.util.Arrays;
import java.util.Collections;

public class maxinarray {
    public static void main(String[] args) {
        Integer[] num = {2, 4, 7, 5, 9};
        int max = Collections.max(Arrays.asList(num));
        System.out.println("Maximum number of array is : " + max);
    }

}
