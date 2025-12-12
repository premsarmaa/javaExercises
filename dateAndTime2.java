import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        // use java.time.LocalDate to compute the day of week and return its name in uppercase
        Calendar c=Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek=c.DAY_OF_WEEK;

        String result="";
        switch(dayOfWeek){
            case 2: result = "MONDAY";break;
            case 3: result =  "TUESDAY";break;
            case 4: result =  "WEDNESDAY";break;
            case 5: result =  "THURSDAY";break;
            case 6: result =  "FRIDAY";break;
            case 7: result =  "SATURDAY";break;
            case 1: result =  "SUNDAY";break;

        }
        return result;
    }

}

public class dateAndTime2 {
    public static void main(String[] args) throws IOException {
        String result=Result.findDay(11,20,2025);
        System.out.println(result);
    }
}
