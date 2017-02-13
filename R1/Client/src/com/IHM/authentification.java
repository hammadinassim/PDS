/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Laura
 */
public class Authentification extends JPanel {
private JCheckBox c1, c2;
    public Authentification(){
    
    
        JPanel pannel = new JPanel();
      //  setSize(400,400);
        setLocation(100, 100);
        add(pannel);
        pannel.setBorder(new TitledBorder("Authentifiez vous")); 
        pannel.setLayout(new BoxLayout(pannel, BoxLayout.Y_AXIS)); 
     
        JLabel id = new JLabel();
        id.setText("Identifiant :");
        JTextField enterID = new JTextField("Entrez votre identifiant", 20);
        pannel.add(id);
        pannel.add(enterID);
        JLabel mdp = new JLabel();
        mdp.setText("Mot de passe :");
        JTextField enterPWD = new JTextField("Entrez votre mot de passe", 20);
        pannel.add(mdp);
        pannel.add(enterPWD);
        setVisible(true);
     
    }

}
        
   
        
        
    
    
 
    
    
    
  
    

