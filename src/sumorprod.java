import javax.swing.*;

public class sumorprod {
    public static void main(String[] args) {
        String n;
        String k;
        n = JOptionPane.showInputDialog("enter number to make sum of 1 to your number:");
        k = JOptionPane.showInputDialog("enter + for sum or * for multiplication:");

        if(k.equals("+")) {
            int a = Integer.parseInt(n);
            int sum = 0;
            for (int i = 0; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println("Your sum to n is:" + sum);
        }
        else {
            int a = Integer.parseInt(n);
            int sum = 1;
            for (int i = 1; i <= a; i++) {
                sum = sum * i;
            }
            System.out.println("Your multiplication to n is:" + sum);
        }
    }
}
