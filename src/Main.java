import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {

        // Example 1
        int year = 404;
        if (checkYear(year)) {
            System.out.println(year + "- високосный год");
        } else {
            System.out.println(year + "- невисокосный год");
        }

        // Example 2
        byte clientOS = 1;
        int deviceYear = LocalDate.now().getYear();
        checkOSAndYear(clientOS, deviceYear);

        // Example 3
        int deliveryDistance = 19;
        int resultDays = checkDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + resultDays);
    }

    // Method Example 1
    public static boolean checkYear(int year){
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            return true;
        }
        return false;
    }

    // Method Example 2
    public static void checkOSAndYear (byte clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    // Method Example 3
    public static int checkDistance(int Distance) {
        byte days = 0;
        if (Distance < 20) {
            days += 1;
        } else if (Distance >= 20 && Distance < 60) {
            days += 2;
        } else if (Distance >= 60 && Distance < 100) {
            days += 3;
        }
        return days;
    }


}