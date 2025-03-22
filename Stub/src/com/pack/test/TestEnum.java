package com.pack.test;

public class TestEnum {

    enum Day{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        checkDays(Day.MONDAY);
        Day[] d = Day.values();
        for(Day day : d) {
            System.out.println(day.name().equals("SATURDAY"));
            //System.out.println(day.equals("MONDAY"));
        }
    }

    public static void checkDays(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
