package com.areesgod.individualplan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducationTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String label;
    private String dis;
    private String course;
    private String trimester;
    private String grou;
    private String plecture;
    private String flecture;
    private String poffice;
    private String foffice;
    public EducationTable(){}

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTrimester() {
        return trimester;
    }

    public void setTrimester(String trimester) {
        this.trimester = trimester;
    }

    public String getGrou() {
        return grou;
    }

    public void setGrou(String grou) {
        this.grou = grou;
    }

    public String getPlecture() {
        return plecture;
    }

    public void setPlecture(String plecture) {
        this.plecture = plecture;
    }

    public String getFlecture() {
        return flecture;
    }

    public void setFlecture(String flecture) {
        this.flecture = flecture;
    }

    public String getPoffice() {
        return poffice;
    }

    public void setPoffice(String poffice) {
        this.poffice = poffice;
    }

    public String getFoffice() {
        return foffice;
    }

    public void setFoffice(String foffice) {
        this.foffice = foffice;
    }
}
