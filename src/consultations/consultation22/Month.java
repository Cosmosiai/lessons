package consultations.consultation22;

import java.util.ArrayList;

public enum Month {
    JANUARY(1, 31, "январь"),
    FEBRUARY(2, 28, "февраль"),
    MARCH(3, 30, "март"),
    APRIL(4, 31, "апрель"),
    MAY(5, 30, "май"),
    JUNE(6, 31, "июнь"),
    JULY(7, 30, "июль"),
    AUGUST(8, 31, "август"),
    SEPTEMBER(9, 30, "сентябрь"),
    OCTOBER(10, 31, "октябрь"),
    NOVEMBER(11, 30, "ноябрь"),
    DECEMBER(12, 31, "декабрь");

    private int count;
    private int monthDay;
    private String ru;

    Month(int count, int monthDay, String ru) {
        this.count = count;
        this.monthDay = monthDay;
        this.ru = ru;
    }

    public int getCount() {
        return count;
    }

    public int getMonthDay() {
        return monthDay;
    }

    public String getRu() {
        return ru;
    }

    public static ArrayList<Month> getByDaysInMonth(int daysInMonth) {
        ArrayList<Month> months = new ArrayList<>();
        for (Month month : Month.values()) {
            if (month.monthDay == daysInMonth) {
                months.add(month);
            }
        }
        return months;
    }

    public static Month getEnum(String name) {
        return Month.valueOf(name);
    }

    public static Month getByCount(int count) {
        Month m = null;
        for (Month month : Month.values()) {
        }
        return m;
    }
}