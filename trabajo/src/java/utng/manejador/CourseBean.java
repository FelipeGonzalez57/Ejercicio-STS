/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.CourseDAO;
import utng.modelo.Course;

/**
 *
 * @author 
 */
@ManagedBean (name="coursesBean") @SessionScoped
public class CourseBean implements Serializable {
    
    private List<Course> courses;
    private Course course;
    
    
    public CourseBean(){
    course=new Course();
    
    }

    public CourseBean(List<Course> courses, Course course) {
        this.courses = courses;
        this.course = course;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


   


    
    

     public String listar(){
        CourseDAO dao =new CourseDAO();
        try{
            courses=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Courses";
    }
      public String eliminar(){
        CourseDAO dao = new CourseDAO();
        try{
            dao.delete(course);
           courses = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        course = new Course();
        return "Iniciar";
        
         }
    public String guardar(){
        CourseDAO dao = new CourseDAO();
        try{
            if(course.getIdCourse()!=0){
                dao.update(course);
            }else{
                dao.insert(course);
            }
            courses = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Course course){
        this.course = course;
        return "Editar";
            }
}//final
