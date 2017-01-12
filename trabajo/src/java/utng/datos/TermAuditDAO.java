/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.TermAudit;


/**
 *
 * @author Moya
 */
public class TermAuditDAO extends DAO<TermAudit>{
    public TermAuditDAO(){
        super(new TermAudit());
    }
     public TermAudit getOneById(TermAudit termAudit)
            throws HibernateException{
        return super.getOneById(termAudit.getIdTerm());
    }
}//final
