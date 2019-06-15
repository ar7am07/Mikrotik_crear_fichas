package examples;

import javax.swing.JOptionPane;

/**
 * Config class for examples
 *
 * @author gideon
 */


public class Config {
  
     
  public static final String HOST =JOptionPane.showInputDialog(null,"Ingresa la IP de tu mikrotik");
    public static final String USERNAME = JOptionPane.showInputDialog(null,"Ingresa el Usuario ");
    public static final String PASSWORD = JOptionPane.showInputDialog(null,"Ingresa la contraseña");
  

}
