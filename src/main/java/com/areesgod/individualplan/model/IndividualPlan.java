package com.areesgod.individualplan.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class IndividualPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String educationalData;
    private String eduMethodData;
    private String scienceData;
    private String behaviorData;
    private String publicWorkData;
    private String KPIData;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "user_plans",
        joinColumns = @JoinColumn(name = "plan_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private User user_id;

    public IndividualPlan() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEducationalData() {
        return educationalData;
    }

    public void setEducationalData(String educationalData) {
        this.educationalData = educationalData;
    }

    public String getEduMethodData() {
        return eduMethodData;
    }

    public void setEduMethodData(String eduMethodData) {
        this.eduMethodData = eduMethodData;
    }

    public String getScienceData() {
        return scienceData;
    }

    public void setScienceData(String scienceData) {
        this.scienceData = scienceData;
    }

    public String getBehaviorData() {
        return behaviorData;
    }

    public void setBehaviorData(String behaviorData) {
        this.behaviorData = behaviorData;
    }

    public String getPublicWorkData() {
        return publicWorkData;
    }

    public void setPublicWorkData(String publicWorkData) {
        this.publicWorkData = publicWorkData;
    }

    public String getKPIData() {
        return KPIData;
    }

    public void setKPIData(String KPIData) {
        this.KPIData = KPIData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
}
