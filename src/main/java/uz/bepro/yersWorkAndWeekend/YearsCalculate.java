package uz.bepro.yersWorkAndWeekend;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;


public class YearsCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yilni kiritng : ");
        int yearNum = scanner.nextInt();
        int sum =0;
        int count = 1;

            while (count <= 12) {
                YearMonth yearMonth = YearMonth.of(yearNum, count);
                sum += yearMonth.lengthOfMonth();
                count++;
            }
            System.out.println(yearNum + " yilda " + sum + " kun bor.");

        System.out.println("--------------------");

        int MonthNum = 1;
        int dayM = 0;
        int weekDay = 0;

        while (MonthNum <= 12) {

            YearMonth yearMonth1= YearMonth.of(yearNum, MonthNum);
            int length = yearMonth1.getMonth().maxLength();

            if(yearMonth1.isLeapYear()){

                if(dayM == length){
                    MonthNum++;
                    if(MonthNum == 13){
                        break;
                    }
                    dayM =0;
                }

                if(dayM == 0) {
                    dayM++;
                }
                else {
                    dayM++;
                }


            }

            else {
                if(MonthNum == 2){
                    if(dayM == 28){
                        dayM=0;
                        MonthNum++;
                    }
                }
                else if(dayM == length){
                    MonthNum++;
                    if(MonthNum == 13){
                        break;
                    }
                    dayM = 0;
                }
                if(dayM == 0){
                    dayM++;
                }
                else {
                    dayM++;
                }
            }
             yearMonth1 = YearMonth.of(yearNum, MonthNum);
//            System.out.println(yearMonth1.atDay(dayM));

            if(yearMonth1.atDay(dayM).getDayOfWeek() == DayOfWeek.SATURDAY || yearMonth1.atDay(dayM).getDayOfWeek() == DayOfWeek.SUNDAY){
                weekDay++;
            }
        }

        System.out.println("Ish kunlar soni : " + (sum-weekDay));

        System.out.println("Dam olishlar kuni soni : " + weekDay);
    }
}
