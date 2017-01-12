/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Term2Term;

/**
 *
 * @author Moya
 */
public class Term2TermDAO extends DAO<Term2Term> {

    public Term2TermDAO() {
        super(new Term2Term());

    }

    public Term2Term getOneById(Term2Term term2)
            throws HibernateException {
        return super.getOneById(term2.getId());
    }

}//final
