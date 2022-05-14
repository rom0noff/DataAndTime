package uz.bepro.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Enter Year: ");
        if(calendar.isLeapYear(scanner.nextInt())){
            System.out.println("Given year is leap year.");
        }else System.out.println("Given year is not leap year.");
    }
}
