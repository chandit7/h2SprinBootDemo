package com.ramesh.ms.springbooth2demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
   @Id
    private int stud_Id;
    @Column
    private String stud_Name;
    @Column
    private String stud_Class;
    @Column
    private String stud_Email;

    public int getStud_Id() {
        return stud_Id;
    }

    public void setStud_Id(int stud_Id) {
        this.stud_Id = stud_Id;
    }

    public String getStud_Name() {
        return stud_Name;
    }

    public void setStud_Name(String stud_Name) {
        this.stud_Name = stud_Name;
    }

    public String getStud_Class() {
        return stud_Class;
    }

    public void setStud_Class(String stud_Class) {
        this.stud_Class = stud_Class;
    }

    public String getStud_Email() {
        return stud_Email;
    }

    public void setStud_Email(String stud_Email) {
        this.stud_Email = stud_Email;
    }
}
