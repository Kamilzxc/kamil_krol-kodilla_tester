public class LeapYear {
    public static void main(String[] args) {
        int leapYear = 31;

        if (leapYear % 4 == 0 && leapYear % 100 == 0 || leapYear % 400 == 0 ) {
            System.out.println("leap year");
        } else if (leapYear < 400 && leapYear % 4 == 0 && leapYear % 100 == 0) {
            System.out.println("leap year");
        } else if (leapYear < 100 && leapYear % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("it's not a leap year");
        }
    }
}
