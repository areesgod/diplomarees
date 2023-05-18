package com.arjuncodes.studentsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "edumeth")
public class EduMeth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    private String dis;
    private String work;
    private String date;
    private int checkk;
    public EduMeth(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCheck() {
        return checkk;
    }

    public void setCheck(int check) {
        this.checkk = check;
    }
}
