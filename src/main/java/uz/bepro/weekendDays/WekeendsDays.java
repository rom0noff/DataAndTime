package uz.bepro.weekendDays;

import java.time.DayOfWeek;
import java.time.YearMonth;
import java.util.Scanner;

public class WekeendsDays {
    //for Uzbekistan
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Years : ");
        int year = scanner.nextInt();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7=0;
        int month=1, sana = 0;
        while (month <= 12){
            YearMonth yearMonth = YearMonth.of(year, month);
            int length = yearMonth.getMonth().maxLength();
            if(yearMonth.isLeapYear()){
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
                if(yearMonth.atDay(sana).getDayOfWeek() == DayOfWeek.SATURDAY || yearMonth.atDay(sana).getDayOfWeek() == DayOfWeek.SUNDAY){
                    sum++;
                }
                if(month == 1 || month == 3 || month == 5 || month == 8 || month == 9 || month == 12){
                    if(month == 3){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 8 || yearMonth.atDay(sana).getDayOfMonth() == 21){
                            sum1++;
                        }
                    }
                    if(month == 5){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 9){
                            sum2++;
                        }
                    }
                    if(month == 8){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 31){
                            sum3++;
                        }
                    }
                    if(month == 9){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 1 || yearMonth.atDay(sana).getDayOfMonth() == 2 || yearMonth.atDay(sana).getDayOfMonth() == 3){
                            sum4++;
                        }
                    }
                    if(month == 12){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 31){
                            sum5++;
                        }
                    }
                    if(month == 1){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 1 || yearMonth.atDay(sana).getDayOfMonth() == 2){
                            sum6++;
                        }
                    }
                }
                sum7 = sum + sum1 + sum2 + sum3 + sum4 + sum5 + sum6;
                yearMonth = YearMonth.of(year,month);

            }

            else {
                if(sana == length){
                    month++;
                    sana = 0;
                }
                if(sana == 0){
                    sana++;
                }
                else sana++;
                if(month == 2 && sana == 29){
                    month++;
                    sana=1;
                }
                if(month == 13){
                    break;
                }
                if(yearMonth.atDay(sana).getDayOfWeek() == DayOfWeek.SATURDAY || yearMonth.atDay(sana).getDayOfWeek() == DayOfWeek.SUNDAY){
                    sum++;
                }
                if(month == 1 || month == 3 || month == 5 || month == 8 || month == 9 || month == 12){
                    if(month == 3){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 8 || yearMonth.atDay(sana).getDayOfMonth() == 21){
                            sum1++;
                        }
                    }
                    if(month == 5){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 9){
                            sum2++;
                        }
                    }
                    if(month == 8){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 31){
                            sum3++;
                        }
                    }
                    if(month == 9){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 1 || yearMonth.atDay(sana).getDayOfMonth() == 2 || yearMonth.atDay(sana).getDayOfMonth() == 3){
                            sum4++;
                        }
                    }
                    if(month == 12){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 31){
                            sum5++;
                        }
                    }
                    if(month == 1){
                        if(yearMonth.atDay(sana).getDayOfMonth() == 1 || yearMonth.atDay(sana).getDayOfMonth() == 2){
                            sum6++;
                        }
                    }
                }
                yearMonth = YearMonth.of(year,month);
                sum7 = sum + sum1 + sum2 + sum3 + sum4 + sum5 + sum6;


            }
        }

        int summ =0;
        int count = 1;

        while (count <= 12) {
            YearMonth yearMonth1 = YearMonth.of(year, count);
            summ += yearMonth1.lengthOfMonth();
            count++;
        }
        System.out.println("========" + year + "=========");
        System.out.println("Dam olish kunlar soni : " + sum7);
        System.out.println("Ish kunlar soni : " + (summ-sum7));
    }
}
