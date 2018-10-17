package com.example.task02;

public class TimeSpan {
    private int hours, minutes, seconds;

    TimeSpan(int Hours, int Minutes, int Seconds){
        this.seconds = Seconds;
        this.minutes = Minutes;
        this.hours = Hours;
    }

    void setHours(int Hours){
        this.hours = Hours;
    }

    void setMinutes(int Minutes){
        this.minutes = Minutes;
    }

    void setSeconds(int Seconds){
        this.seconds = Seconds;
    }

     int getHours(){
        return this.hours;
    }

    int getMinutes(){
        return this.minutes;
    }

    int getSeconds(){
        return this.seconds;
    }

    void add(TimeSpan time){
        this.hours += time.hours;
        this.minutes +=time.minutes;
        this.seconds += time.seconds;
    }

    void subtract(TimeSpan time){
        this.hours -= time.hours;
        this.minutes -= time.minutes;
        this.seconds -= time.seconds;
    }

    public String toString(){
        return String.valueOf(this.hours) + " : " + String.valueOf(this.minutes) + " : " + String.valueOf(this.seconds);
    }
}
