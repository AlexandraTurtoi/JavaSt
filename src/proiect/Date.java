/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiect;

/**
 *
 * @author Alexandra
 */
public class Date {

private int month;
private int day;
private int year;

public Date()
{month=0;
day=0;
year=0;
}
public Date( int month, int day, int year){
    this.month = month;
    this.day = day;
    this.year = year;
}

    public void setMonth (int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return  month + "/" + day + "/" + year;
    }

}
