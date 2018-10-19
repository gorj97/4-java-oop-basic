package com.example.task02;

public class TimeSpan {
    private int hours, minutes, seconds;

    public TimeSpan(int Hours, int Minutes, int Seconds) {
        this.seconds = Seconds;
        this.minutes = Minutes;
        this.hours = Hours;
    }

    public void setHours(int Hours) {
        this.hours = Hours;
    }

    public void setMinutes(int Minutes) {
        this.minutes = Minutes;
    }

    public void setSeconds(int Seconds) {
        this.seconds = Seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        this.seconds += time.seconds;
    }

    public void subtract(TimeSpan time) {
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
    }

    public String toString() {
        return this.hours + " : " + this.minutes + " : " + this.seconds;
    }
}
