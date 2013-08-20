/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.daofactory.opcion2;

import cl.simimare.entities.Material;
import java.util.Collection;
import javax.sql.RowSet;

/**
 *
 * @author Diego
 */
public interface MaterialDAO {
    public int createMaterial(Material material);
    public boolean updateMaterial(Material material);
    public boolean deleteMaterial(Material material);
    public Material findMaterial(Object id);
    public RowSet selectMaterialRS();
    public Collection selectMaterial();
}