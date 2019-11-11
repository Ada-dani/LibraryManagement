/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Liberarie;


import javax.swing.JFrame;


class StartNewProgram extends Conex {

    public StartNewProgram() throws Exception {
        super();
    }
}
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        final StartNewProgram App = new StartNewProgram();
        Conex conn=new Conex();
        Login Fentrée=new Login();
        
        Fentrée.show();
        
    }
}
