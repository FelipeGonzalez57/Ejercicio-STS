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
import utng.datos.Term2TermDAO;
import utng.datos.TermAuditDAO;
import utng.modelo.Term2Term;
import utng.modelo.TermAudit;

/**
 *
 * @author Moya
 */
@ManagedBean(name = "term2termBean")@SessionScoped
public class Term2TermBean implements Serializable {

    private List<Term2Term> terms;
    private Term2Term term;
    private List<TermAudit> termAudits;

    public Term2TermBean() {
        term = new Term2Term();
        term.setTermAudit(new TermAudit());
    }

  

    public List<Term2Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term2Term> terms) {
        this.terms = terms;
    }

    public Term2Term getTerm() {
        return term;
    }

    public void setTerm(Term2Term term) {
        this.term = term;
    }

    public List<TermAudit> getTermAudits() {
        return termAudits;
    }

    public void setTermAudits(List<TermAudit> termAudits) {
        this.termAudits = termAudits;
    }

    public String listar() {
        Term2TermDAO dao = new Term2TermDAO();
        try {
            terms = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Terms";
    }

    public String eliminar() {
        Term2TermDAO dao = new Term2TermDAO();
        try {
            dao.delete(term);
            terms = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {

        term = new Term2Term();
        term.setTermAudit(new TermAudit());
        try {
            termAudits = new TermAuditDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }

    public String guardar() {
        Term2TermDAO dao = new Term2TermDAO();
        try {
            if (term.getId() != 0) {
                dao.update(term);
            } else {
                dao.insert(term);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        terms = dao.getAll();
        return "Guardar";
    }
 
    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Term2Term term) {
        this.term = term;
        try {
            termAudits = new TermAuditDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }
}//final
