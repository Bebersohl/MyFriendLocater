package com.example.brandon.myfriendlocater;

/**
 * Created by Brandon on 12/9/2015.
 */
public class Event {
    String username, title, date, time, lat, lng;

    public Event(String username, String title, String date, String time, String lat, String lng)
    {
        this.username = username;
        this.title = title;
        this.date = date;
        this.time = time;
        this.lat = lat;
        this.lng = lng;
    }

    public String ToString(){
        return "username: " + this.username +
                "title: " + this.title +
                "date: " + this.date +
                "time: " + this.time +
                "lat: " + this.lat +
                "lng: " + this.lng;
    }
}
