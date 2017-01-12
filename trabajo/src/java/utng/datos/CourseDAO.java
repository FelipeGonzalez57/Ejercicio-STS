/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Course;

/**
 *
 * @author 
 */
public class CourseDAO extends DAO<Course>{
    public CourseDAO(){
        super(new Course());
    }
     public Course getOneById(Course course)
            throws HibernateException{
        return super.getOneById(course.getIdCourse());
    }
}//final
