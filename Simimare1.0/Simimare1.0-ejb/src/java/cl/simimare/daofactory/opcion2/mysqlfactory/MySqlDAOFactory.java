/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.daofactory.opcion2.mysqlfactory;

/**
 *
 * @author Diego
 */
import cl.simimare.daofactory.opcion2.DAOFactory;
import cl.simimare.daofactory.opcion2.MaterialDAO;
import java.sql.*;

public class MySqlDAOFactory extends DAOFactory {
    
    public static final String DRIVER="com.mysql.jdbc.Driver";
    public static final String DBURL="jdbc:mysql://approvati.no-ip.org:3306/simimare?zeroDateTimeBehavior=convertToNull";
    
    public static Connection createConnection() { 
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        return null;
    }
    
    @Override
    public MaterialDAO getMaterialDAO() {
        // MySqlMaterialDAO implements MaterialDAO
        return new MySqlMaterialDAO();
    }
}