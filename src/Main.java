public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }

    public static void Task1() {
        System.out.println("Задание1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            total = salary + total;
            i = i + 1;
            System.out.println("За месяц "+ i +  " сумма накоплений равна= "+ total);
        }
        }


            public static void Task2 () {
                System.out.println("Задание2");
                int i = 0;
                while (i<10) {
                    i = i + 1;
                    System.out.print(" "+ i );
                }
                System.out.println( );
                int y = 10;
                for (; y>0; y = y -1) {
                    System.out.print( " "+y );
                }
            }

            public static void Task3() {
        System.out.println();
               System.out.println("Задание 3");
               int i = 1200000;
               int rozdaemostChel = 17 * 1000;
               int smertnostChel = 8 * 1000;
               for (int y = 2023; y<=2033; y= y+1){
                   i = i+ rozdaemostChel - smertnostChel;
                   System.out.println("Год "+ y+ "Численность населения состовляет "+ i);
               }

               }
               public static void Task4(){
                 System.out.println("Задание 4");
                 int salary = 15000;
                 int total = 0;
                 int i = 1;
                 for (; total<=12000000; i++) {
                     total = total + (total/100)*7;
                     total = total + salary;

                     System.out.println("Месяц"+ i+ "Итого "+ total);
                 }
               }

               public static void Task5() {
                 System.out.println("Задание 5");
                   int salary = 15000;
                   int total = 0;
                   int i = 1;
                   for (; total<=12000000; i++) {
                       total = total + (total/100)*7;
                       total = total + salary;
                       if(i%6==0) {
                           System.out.println("Месяц"+ i+ "Итого "+ total);}
                   }
               }

               public static void Task6() {
                 System.out.println("Задание6");
                 int salary = 15000;
                 int total = 0;
                 int i = 9 *12;
                 for (int y=1; y<=i; y= y + 1 ) {
                     total = total + (total/100)*7;
                     total = total + salary;
                     if(y%6==0) {
                         System.out.println("Прошло пол года, месяц "+y+ " на счету "+total );
                     }
                 }
               }

               public static void Task7() {
                System.out.println("Задание7");
                for (int f= 1; f<=31; f= f + 7){
                    System.out.println("Число "+f+ " Сегодня пятница");
                }
                }
                public static void Task8() {
                 System.out.println("Задание8");
                 int old = 1823;
                 int now = 2100;
                 for (int y= 1896; y<now && y>old ; y = y+79) {
                     System.out.println(y);
                 }
                }
               }





