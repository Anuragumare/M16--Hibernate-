package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="students")
public class Student implements Serializable {
private static final long serialVersionUID = 1L;
@Id
private int studentId;
private String studentname;

public int getStudentId() {
return studentId;
}
public void setStudentId(int studentId) {
this.studentId = studentId;
}
public String getStudentName() {
return studentname;
}
public void setStudentName(String studentname) {
this.studentname = studentname;
}
}
