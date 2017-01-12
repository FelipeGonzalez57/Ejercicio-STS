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
import javax.persistence.Table;

/**
 *
 * @author Moya
 */
@Entity @Table(name= "termAudit")
public class TermAudit implements Serializable{
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    
        @Column(name = "id_term", length=10)
    private Long idTerm;
    @Column(length = 30)
    private String termLoadtime;
   
   
    
     public TermAudit(){
        this.idTerm= 0L;
    }

   

    public Long getIdTerm() {
        return idTerm;
    }

    public void setIdTerm(Long idTerm) {
        this.idTerm = idTerm;
    }

    public String getTermLoadtime() {
        return termLoadtime;
    }

    public void setTermLoadtime(String termLoadtime) {
        this.termLoadtime = termLoadtime;
    }


   
     
     
}//final
