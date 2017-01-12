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
import utng.datos.EmployeDAO;
import utng.modelo.Employe;

/**
 *
 * @author Moya
 */
@ManagedBean (name="employeBean") @SessionScoped
public class EmployeBean implements Serializable {
    
    private List<Employe> employes;
    private Employe employe;
    
    
    public EmployeBean(){
    employe=new Employe();
    
    }

    public EmployeBean(List<Employe> employes, Employe employe) {
        this.employes = employes;
        this.employe = employe;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }


     public String listar(){
        EmployeDAO dao =new EmployeDAO();
        try{
            employes=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Employes";
    }
     
     
      public String eliminar(){
        EmployeDAO dao = new EmployeDAO();
        try{
            dao.delete(employe);
           employes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        employe = new Employe();
        return "Iniciar";
        
         }
    public String guardar(){
        EmployeDAO dao = new EmployeDAO();
        try{
            if(employe.getIdEmp()!=0){
                dao.update(employe);
            }else{
                dao.insert(employe);
            }
           employes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(Employe employe){
        this.employe = employe;
        return "Editar";
            }
}//final
