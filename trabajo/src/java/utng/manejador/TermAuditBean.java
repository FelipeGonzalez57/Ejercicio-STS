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
import utng.datos.TermAuditDAO;
import utng.modelo.TermAudit;


/**
 *
 * @author Moya
 */
@ManagedBean (name="termAuditBean") @SessionScoped
public class TermAuditBean implements Serializable {
    
    private List<TermAudit> termAudits;
    private TermAudit termAudit;
    
    
    public TermAuditBean(){
    termAudit=new TermAudit();
    
    }

    public TermAuditBean(List<TermAudit> termAudits, TermAudit termAudit) {
        this.termAudits = termAudits;
        this.termAudit = termAudit;
    }

    public List<TermAudit> getTermAudits() {
        return termAudits;
    }

    public void setTermAudits(List<TermAudit> termAudits) {
        this.termAudits = termAudits;
    }

    public TermAudit getTermAudit() {
        return termAudit;
    }

    public void setTermAudit(TermAudit termAudit) {
        this.termAudit = termAudit;
    }

   


    
    

     public String listar(){
        TermAuditDAO dao =new TermAuditDAO();
        try{
            termAudits=  dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "termAudits";
    }
     
     
     
     
      public String eliminar(){
        TermAuditDAO dao = new TermAuditDAO();
        try{
            dao.delete(termAudit);
          termAudits = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
        
        }
      
       public String iniciar(){
        termAudit = new TermAudit();
        return "Iniciar";
        
         }
    public String guardar(){
        TermAuditDAO dao = new TermAuditDAO();
        try{
            if(termAudit.getIdTerm()!=0){
                dao.update(termAudit);
            }else{
                dao.insert(termAudit);
            }
            termAudits = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
     public String cancelar(){
        return "Cancelar";
    }
    public String editar(TermAudit termAudit){
        this.termAudit = termAudit;
        return "Editar";
            }
}//final
