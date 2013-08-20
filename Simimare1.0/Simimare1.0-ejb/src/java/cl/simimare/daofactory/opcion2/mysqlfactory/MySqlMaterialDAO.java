/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.daofactory.opcion2.mysqlfactory;

import cl.simimare.daofactory.opcion2.MaterialDAO;
import cl.simimare.entities.Material;
import java.util.Collection;
import javax.sql.RowSet;

/**
 *
 * @author Diego
 */
public class MySqlMaterialDAO implements MaterialDAO {
    
    public MySqlMaterialDAO() {
        // initialization 
    }
    
    // The following methods can use
    // MySqlDAOFactory.createConnection() 
    // to get a connection as required

    @Override
    public int createMaterial(Material material) {
        // Implement insert object here.
        // Return newly created object number
        // or a -1 on error
        return -1;
    }
  
    @Override
    public boolean deleteMaterial(Material material) {
        // Implement delete object here
        // Return true on success, false on failure
        return false;
    }

    @Override
    public Material findMaterial(Object id) {
        // Implement find a object here using supplied
        // argument values as search criteria
        // Return a Transfer Object if found,
        // return null on error or if not found
        return new Material();
    }
    
    @Override
    public boolean updateMaterial(Material material) {
        // implement update record here using data
        // from the Data Transfer Object
        // Return true on success, false on failure or
        // 
        return false;
    }

    @Override
    public RowSet selectMaterialRS() {
        // implement search objects here using the
        // supplied criteria.
        // Return a RowSet. 
        return null;
    }

    @Override
    public Collection selectMaterial() {
        // implement search objects here using the
        // supplied criteria.
        // Alternatively, implement to return a Collection 
        // of Transfer Objects.
        return null;
    }
}
