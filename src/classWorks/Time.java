package classWorks;

public class Time {
    private int minute;
    private int second;

    private int hour;


    public Time(int minute, int second, int hour){


        validate(minute, second, hour);

        this.minute = minute;

        this.second = second;

        this.hour = hour;


    }


    public void setMinute(int minute) {
        validateminute(minute);
        this.minute = minute;
    }


    public void setSecond(int second) {
        validateseconds(second);
        this.second = second;
    }

    public void setHour(int hour) {
        validatehour(hour);
        this.hour = hour;
    }



    private void validate(int minute, int second, int hour) {
        validateseconds(second);
        validateminute(minute);
        validatehour(hour);



    }

    private void validatehour(int hour) {
        if( hour < 0 || hour > 23) throw new IllegalArgumentException
                (String.format("Hour entered is %s, please enter hour between 0 amd 23", hour));
    }


    private void validateminute(int minute) {
        if( minute < 0 || minute > 59) throw new IllegalArgumentException
                (String.format("Minute entered is %s, please enter seconds between 0 amd 59", minute));
    }

    private void validateseconds(int second) {
        if( second < 0 || second > 59) throw new IllegalArgumentException
                (String.format("Second entered is %s, please enter seconds between 0 amd 59", second));
    }


}
