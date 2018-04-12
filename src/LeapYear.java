public class LeapYear {
    public static void main(String[] args) {
        int year = 2018;
        int counter = 0;


        while (counter < 20) {

            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {

                System.out.println(year);
                year++;
                counter++;
            } else {
                year++;
            }
        }
    }
}
