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
import utng.datos.OnSiteCourseDAO;
import utng.modelo.Course;
import utng.modelo.OnSiteCourse;


/**
 *
 * @author
 */
@ManagedBean(name = "onSiteCourseBean")@SessionScoped
public class OnSiteCourseBean implements Serializable{
    private List<OnSiteCourse> onSiteCourses;
    private OnSiteCourse onSiteCourse;
    private List<Course> courses;
    
    public OnSiteCourseBean(){
        onSiteCourse = new OnSiteCourse();
        onSiteCourse.setCourse(new Course());
    } 

    public List<OnSiteCourse> getOnSiteCourses() {
        return onSiteCourses;
    }

    public void setOnSiteCourses(List<OnSiteCourse> onSiteCourses) {
        this.onSiteCourses = onSiteCourses;
    }

    public OnSiteCourse getOnSiteCourse() {
        return onSiteCourse;
    }

    public void setOnSiteCourse(OnSiteCourse onSiteCourse) {
        this.onSiteCourse = onSiteCourse;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    

   
     public String listar(){
        OnSiteCourseDAO dao = new OnSiteCourseDAO();
        try{
            onSiteCourses= dao.getAll();
        }catch(Exception e){ e.printStackTrace();}
        return "OnSiteCourses";
        }
     public String eliminar(){
        OnSiteCourseDAO dao = new OnSiteCourseDAO();
        try{
            dao.delete(onSiteCourse);
            onSiteCourses = dao.getAll();
        }catch(Exception e){e.printStackTrace();}
        return "Eliminar";
        }
     public String iniciar(){
        
       onSiteCourse= new OnSiteCourse();
       onSiteCourse.setCourse(new Course());
       try{
           courses = new CourseDAO().getAll();
       }catch(Exception e){e.printStackTrace();}
       return "Iniciar";
       }
      public String guardar(){
        OnSiteCourseDAO dao = new OnSiteCourseDAO();
        try{ 
            if(onSiteCourse.getIdOnSite()!=0){
                dao.update(onSiteCourse);
        }else{ dao.insert(onSiteCourse);}
           
        }catch(Exception e){e.printStackTrace();
        } 
        onSiteCourses = dao.getAll();
        return "Guardar";
    }
      
    public String cancelar(){ return"Cancelar";}
    public String editar(OnSiteCourse onSiteCourse){
        this.onSiteCourse = onSiteCourse;
        try{
           courses = new CourseDAO().getAll();
        }catch (Exception e){e.printStackTrace();}
        return "Editar";
    }
}//final
