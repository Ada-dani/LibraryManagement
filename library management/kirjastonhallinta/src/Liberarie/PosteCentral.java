/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Liberarie;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author OMAR
 */
public class PosteCentral {
public PosteCentral(JFrame form) {
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
int x = (dim.width - form.getSize().width)/2;
int y = (dim.height - form.getSize().height)/2;
form.setLocation(x,y);
form.setLayout(null);
form.setResizable(false);
}
}
