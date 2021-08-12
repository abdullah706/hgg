package com.example.servingwebcontent;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;



public class Jours implements Serializable {
    private Long id;

    private String days;
    private Integer numday;




    public Jours(Integer numday) {
        this.numday = numday;
    }

    public Integer getNumday() {
        return numday;
    }

    public void setNumday(Integer numday) {
        this.numday = numday;
    }





    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime launchDate;

    public Jours() {
    }

    public Jours(Long id,  String days,  LocalDateTime launchDate) {
        this.id = id;

        this.days = days;

        this.launchDate = launchDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }



    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +

                ", days=" + days +

                ", launchDate=" + launchDate +
                '}';
    }

}





