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
 * @author Moya
 */
@Entity
@Table(name = "term")
public class Term2Term implements Serializable{
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "id")
    private Long id;
    @Column(name = "relation_type", length = 10)
    private int relationType;
    @Column(length = 15)
     private int term1;
   @Column(length = 15)
    private int term2;
   @Column(length = 15)
    private int complete;
    @ManyToOne
    @JoinColumn(name = "id_term")
    private TermAudit termAudit;

    public Term2Term() {
        this.id=0L;
    }

    public Term2Term(Long id, int relationType, int term1, int term2, int complete, TermAudit termAudit) {
        this.id = id;
        this.relationType = relationType;
        this.term1 = term1;
        this.term2 = term2;
        this.complete = complete;
        this.termAudit = termAudit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRelationType() {
        return relationType;
    }

    public void setRelationType(int relationType) {
        this.relationType = relationType;
    }

    public int getTerm1() {
        return term1;
    }

    public void setTerm1(int term1) {
        this.term1 = term1;
    }

    public int getTerm2() {
        return term2;
    }

    public void setTerm2(int term2) {
        this.term2 = term2;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public TermAudit getTermAudit() {
        return termAudit;
    }

    public void setTermAudit(TermAudit termAudit) {
        this.termAudit = termAudit;
    }


    
    
    
    

    

    
     
}//final
