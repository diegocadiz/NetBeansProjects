/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.sessionbeans;

import cl.simimare.entities.Municipalidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego
 */
@Stateless
public class MunicipalidadFacade extends AbstractFacade<Municipalidad> {
    @PersistenceContext(unitName = "Simimare1.0-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MunicipalidadFacade() {
        super(Municipalidad.class);
    }
    
}
