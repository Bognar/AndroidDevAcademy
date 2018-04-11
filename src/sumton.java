import javax.swing.*;

public class sumton {
    public static void main(String[] args) {
        String n;
        n = JOptionPane.showInputDialog("enter number to make sum of 1 to your number:");
        int a = Integer.parseInt(n);
        int sum = 0;
        for (int i = 0; i<=a; i++){
            sum = sum +i;
        }
        System.out.println("Your sum to n is:" +sum);
    }
}
