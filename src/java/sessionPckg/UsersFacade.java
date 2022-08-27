/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionPckg;

import entityPckg.Users;
import java.util.List;
import java.util.function.Function;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author GiftM
 */
@Stateless
public class UsersFacade extends AbstractFacade<Users> {

    @PersistenceContext(unitName = "Assignment1_G35PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsersFacade() {
        super(Users.class);
    }

    public boolean findByUsernamePassword(String username, String password) {
        TypedQuery<Users> query = getEntityManager().createNamedQuery("Users.findByUsernamePassword", Users.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        query.getResultList();
        return query.getResultList().size() > 0;
    }

    public boolean findByUsername(String username) {
        TypedQuery<Users> query = getEntityManager().createNamedQuery("Users.findByUsername", Users.class);
        query.setParameter("username", username);
        query.getResultList();
        return query.getResultList().size() > 0;
    }
}
