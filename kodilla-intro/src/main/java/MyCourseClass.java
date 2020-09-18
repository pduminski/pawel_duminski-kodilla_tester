public class MyCourseClass {
    public static void main(String[] args) {
        KodillaCourse myCourse = KodillaCourse.TA;

        switch (myCourse) {
            case JD:
                System.out.println("Java Developer");
                break;
            case JDP:
                System.out.println("Java Developer plus");
                break;
            case TA:
                System.out.println("Tester Automatyzujacy");
                break;
            case TAI:
                System.out.println("Tester Automatyzujacy z ISTQB");
        }
    }
}
