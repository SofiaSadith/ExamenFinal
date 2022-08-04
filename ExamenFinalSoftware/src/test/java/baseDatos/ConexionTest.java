/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bruno Cipriano
 */
public class ConexionTest {
    
    public ConexionTest() {
    }
    /**
     * Test of conectar method, of class Conexion.
     */
    @org.junit.jupiter.api.Test
    public void testConectar() {
        try {
            System.out.println("conectar");
            Conexion instance = new Conexion();
            boolean expResult = true;
            boolean result = instance.conectar().isValid(5);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of desconectar method, of class Conexion.
     */
    @org.junit.jupiter.api.Test
    public void testDesconectarOk() {
        System.out.println("desconectar");
        Conexion instance = new Conexion();
        String expResult = "Error al desconectar la base de datos";
        
        String result = instance.desconectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    /**
     * Test of main method, of class Conexion.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Conexion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
