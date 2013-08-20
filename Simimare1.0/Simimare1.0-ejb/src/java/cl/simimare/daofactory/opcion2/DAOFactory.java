/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.simimare.daofactory.opcion2;

import cl.simimare.daofactory.opcion2.mysqlfactory.MySqlDAOFactory;

/**
 *
 * @author Diego
 */
public abstract class DAOFactory {
    
    // Lista de tipos de factory DAO soportados.
    public static final int MYSQL = 1;  

    /** 
     * Métodos que definen las clases DAO que pueden ser creadas.
     * Estos métodos deben ser implementados por cada tipo de factory DAO soportado.
     */
    public abstract MaterialDAO getMaterialDAO();
    
    /**
     * Permite instanciar un tipo de factory específico,
     * entre los tipos de factory DAO soportados.
     */
    public static DAOFactory getDAOFactory(int whichFactory) {    
        switch (whichFactory) {
            case MYSQL  : 
                return new MySqlDAOFactory();
            default     : 
                return null;
        }
    }
}