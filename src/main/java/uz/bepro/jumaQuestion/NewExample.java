package uz.bepro.jumaQuestion;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.YearMonth;
import java.util.Scanner;

public class NewExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = scanner.nextInt();
        int sum = 0;
        int month = 1;
        int sana = 0;
        while (month <= 12) {
            YearMonth yearMonth = YearMonth.of(year, month);
            int length = yearMonth.getMonth().maxLength();
            if (yearMonth.isLeapYear()) {
            if(sana == length){
                month++;
                sana = 0;
            }
            if(sana == 0){
                sana++;
            }
            else sana++;
            if(month == 13){
                break;
            }
                yearMonth = YearMonth.of(year, month);


                if(yearMonth.atDay(sana).getDayOfWeek() == DayOfWeek.FRIDAY){
                    sum++;
                }
                if(sum == 10){
                    System.out.println(yearMonth.atDay(sana));

                    break;
                }
            }


            else {
                if(sana == length){
                    month++;
                    sana = 0;
                }
                if(sana == 0){
                    sana++;
                }
                else {
                    sana++;
                }
                if(month == 2 && sana == 29){
                    sana = 1;
                    month++;
                }
                if(month == 13){
                    break;
                }
                yearMonth = YearMonth.of(year, month);
                if(yearMonth.atDay(sana).getDayOfWeek() == DayOfWeek.FRIDAY){
                    sum++;
                }
                if(sum == 10){
                    System.out.println(yearMonth.atDay(sana));

                    break;
                }


            }

        }

    }
}
