/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.client.IHM;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;
import java.awt.event.*;
import static javafx.scene.paint.Color.TRANSPARENT;
import javax.swing.*;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Laura nassim
 */
public class Authentification extends JPanel {
private JCheckBox c1, c2;
    public Authentification(){
    
    
        JPanel pannel = new JPanel();
    
        pannel.setBackground(Color.WHITE);
    
        pannel.setLayout(new GridLayout(3,3));
        pannel.setPreferredSize(new Dimension(450,120));
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
        
   
        
        
    
    
 
    
    
    
  
    

