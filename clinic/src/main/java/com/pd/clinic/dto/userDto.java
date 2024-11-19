package com.pd.clinic.dto;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;

public class userDto {
	
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "user_code")
    private String userCode;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mail")
    private String mail;

    @Column(name = "ph_no")
    private Integer phNo;

    @Column(name = "user_type_id")
    private String userTypeId;

    @Column(name = "access_role_id")
    private String accessRoleId;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "clinic_id")
    private String clinicId;

    @Column(name = "user_password")
    private String userPassword;

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getPhNo() {
        return phNo;
    }

    public void setPhNo(Integer phNo) {
        this.phNo = phNo;
    }

    public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getAccessRoleId() {
        return accessRoleId;
    }

    public void setAccessRoleId(String accessRoleId) {
        this.accessRoleId = accessRoleId;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // toString Method
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", phNo=" + phNo +
                ", userTypeId='" + userTypeId + '\'' +
                ", accessRoleId='" + accessRoleId + '\'' +
                ", isActive=" + isActive +
                ", clinicId='" + clinicId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }


	
}
