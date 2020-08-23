public class LeapYear {
    public static void main(String[] args) {
        int year = 1998;

        if(countLeapYear(year)) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is NOT leap year.");
        }

    }

    private static boolean countLeapYear(int inputYear){

        boolean isLeapYear;

        if(inputYear%4 == 0 && inputYear%100 != 0) {
            isLeapYear = true;      // we check if year can be divided by 4
        } else if (inputYear%400 == 0){
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        return isLeapYear;
    }
}
