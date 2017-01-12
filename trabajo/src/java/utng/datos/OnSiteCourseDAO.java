/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.OnSiteCourse;

/**
 *
 * @author 
 */
public class OnSiteCourseDAO extends DAO<OnSiteCourse>{
    public OnSiteCourseDAO(){
        super(new OnSiteCourse());
       
    }
    
    public OnSiteCourse getOneById(OnSiteCourse onSite)
            throws HibernateException{
        return super.getOneById(onSite.getIdOnSite());
    }
     
}//final
