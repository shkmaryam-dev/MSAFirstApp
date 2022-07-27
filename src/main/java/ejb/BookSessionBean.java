/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Book;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class BookSessionBean {
        
    @PersistenceContext(unitName = "com.maryam_MSASecondApp_war_1.0-SNAPSHOTPU")
    EntityManager em;
    
    public Collection<Book> getAllBooks(){
        return em.createNamedQuery("Book.findAll").getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
