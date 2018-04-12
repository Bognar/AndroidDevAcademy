

public class OddInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 8, 4, 2, 6};
        int i = 1;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i += 2;
        }
    }
}
