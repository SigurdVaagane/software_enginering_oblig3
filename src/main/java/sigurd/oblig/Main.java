package sigurd.oblig;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}
