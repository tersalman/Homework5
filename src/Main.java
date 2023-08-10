public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         int clientOS = 1;
         if (clientOS==0){
             System.out.println("Установите версию приложения для iOS по ссылке");
         }else {
             System.out.println("Установите версию приложения для Android по ссылке");
         }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientMobileYear = 2012;
        int clientDeviceYear = 2015;
        if (clientOS==0&& clientMobileYear>=clientDeviceYear){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==0&& clientMobileYear<clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS==1&& clientMobileYear>=clientDeviceYear){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS==1&& clientMobileYear<clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 400;
        int leapYear = 4;
        if (year%leapYear==0 &&year%100!=0||year % 400==0 ){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance =123;
        int daysToDelivary = 1;
        if ( deliveryDistance < 20 ) {
            System.out.println("Потребуется дней " + daysToDelivary);
        } else if (deliveryDistance >= 20 && deliveryDistance <60) {
            daysToDelivary =daysToDelivary + 1;
            System.out.println("Потребуется дней " + daysToDelivary);

        } else if (deliveryDistance >= 60 && deliveryDistance <100 ) {
            daysToDelivary =daysToDelivary + 2;
            System.out.println("Потребуется дней " + daysToDelivary);
        }else {
            System.out.println("доставки нет");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 80;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осенний месяц");
                break;
            default:
                System.out.println("такого месяца нет");
        }

    }
}