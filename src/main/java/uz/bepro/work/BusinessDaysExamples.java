package uz.bepro.work;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public  class BusinessDaysExamples {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Sanani shunaqa kiritng: dd/MM/yyyy | ");
                Calendar calendar = Calendar.getInstance();
                int days = scanner.nextInt();
                int month = scanner.nextInt()-1;
                int year = scanner.nextInt();
                System.out.println("Nechta ish kunida keyingi sana ko'rsatilsin : ");
                int sum = scanner.nextInt();
                int count = 1;
                while (count < sum){
                        if(calendar.getTime().getDay() != 6 && calendar.getTime().getDay() != 0)  {
                                System.out.println("working days : "+ calendar.getTime().getDay());
                                count++;
                                days++;
                        }else {
                                days++;
                        }
                        calendar.set(year, month, days);

                }

                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                System.out.println("Ohirgi ish kuni : " + calendar.getTime().getDay());
                System.out.println(format.format(calendar.getTime()));

        }

}
