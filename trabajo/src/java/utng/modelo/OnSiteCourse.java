/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "onSiteCourse")
public class OnSiteCourse implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id_onSite")
    private Long idOnSite;
    @Column(name = "location", length = 10)
    private String location;
    @Column(length = 15)
     private String days;
   @Column(length = 15)
    private String time;
    @ManyToOne
    @JoinColumn(name = "id_course")
    private Course course;

    public OnSiteCourse() {
        this.idOnSite=0L;
    }

    public Long getIdOnSite() {
        return idOnSite;
    }

    public void setIdOnSite(Long idOnSite) {
        this.idOnSite = idOnSite;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    
    
    
    
    

    
     
}//final
