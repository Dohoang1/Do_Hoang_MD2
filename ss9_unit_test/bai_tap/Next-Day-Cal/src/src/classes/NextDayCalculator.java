package classes;

public class NextDayCalculator {
    public String getNextDay(int day, int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10:
                if (day == 31) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 4, 6, 9, 11:
                if (day == 30) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if (day == 29) {
                        day = 1;
                        month++;
                    } else {
                        day++;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month++;
                    } else {
                        day++;
                    }
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else {
                    day++;
                }
                break;
            default:
                return "Invalid date";
        }
        return day + "-" + month + "-" + year;
    }
}
