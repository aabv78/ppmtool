package com.aabv78.ppmtool.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    private String projectName;

    private String projectIdentifier;

    private String projectDescription;

    private Date projectStartDate;

    private Date projectEndDate;

    private Date projectCreatedAt;

    private Date projectUpdatedAt;

    @PrePersist
    protected void onCreate(){
        this.projectCreatedAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.projectUpdatedAt = new Date();
    }

    public Project() {
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public Date getProjectCreatedAt() {
        return projectCreatedAt;
    }

    public void setProjectCreatedAt(Date projectCreatedAt) {
        this.projectCreatedAt = projectCreatedAt;
    }

    public Date getProjectUpdatedAt() {
        return projectUpdatedAt;
    }

    public void setProjectUpdatedAt(Date projectUpdatedAt) {
        this.projectUpdatedAt = projectUpdatedAt;
    }
}
