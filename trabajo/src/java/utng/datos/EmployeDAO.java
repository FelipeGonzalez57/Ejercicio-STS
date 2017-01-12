/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Employe;


/**
 *
 * @author 
 */
public class EmployeDAO extends DAO<Employe>{
    public EmployeDAO(){
        super(new Employe());
    }
     public Employe getOneById(Employe employe)
            throws HibernateException{
        return super.getOneById(employe.getIdEmp());
    }
}//final
