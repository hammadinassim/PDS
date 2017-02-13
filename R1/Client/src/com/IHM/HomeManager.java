/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.client.IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.Toolkit;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author nassimhammadi
 */
public class HomeManager extends JFrame{
    
    
    public HomeManager(){
       
        JPanel panelNord = new JPanel();
        panelNord.setLayout(new GridLayout(1, 2)); // 1 ligne, 2 colonnes
        JPanel panelBarre = new JPanel();
        BoxLayout layoutBarre = new BoxLayout(panelBarre, BoxLayout.X_AXIS);
        panelBarre.add(new JLabel("Manager : Monkey D. Dragon "));
        panelNord.add(panelBarre);

        JPanel panelWest = new JPanel(new GridLayout(1,3));
        
        JPanel panelWest1 = new JPanel(new GridLayout(5,1));
        panelWest1.setPreferredSize(new Dimension(300, 200));
        panelWest1.setBorder(new TitledBorder("Listes des informations sur le véhicule : "));
        panelWest1.add(new JLabel("Identifiant du véhicule :"));
        JTextField id = new JTextField();
        JButton search = new JButton("Rechercher");
        panelWest1.add(id);
        panelWest1.add(search);
        JPanel panelWest2 = new JPanel(new GridLayout(5,1));
        panelWest2.setPreferredSize(new Dimension(300, 200));
        panelWest2.setBorder(new TitledBorder("Mettre à jour l'année du véhicule : "));
        panelWest2.add(new JLabel("Identifiant du véhicule :"));
        JTextField iden = new JTextField();
        panelWest2.add(iden);
        panelWest2.add(new JLabel("Année du véhicule :"));
        JTextField id4 = new JTextField();
        JButton search2 = new JButton("Mettre un jour");
        panelWest2.add(id4);
        panelWest2.add(search2);
        JPanel panelWest3 = new JPanel(new GridLayout(5,1));
        panelWest3.setPreferredSize(new Dimension(300, 200));
        panelWest3.setBorder(new TitledBorder("Supprimer un véhicule de la base de données : "));
        panelWest3.add(new JLabel("Identifiant du véhicule :"));
        JTextField id3 = new JTextField();
        JButton search3 = new JButton("Supprimer");
        panelWest3.add(id3);
        panelWest3.add(search3);
        panelWest.add(panelWest1);
        panelWest.add(panelWest2);
        panelWest.add(panelWest3);

        JPanel panelSouth =  new JPanel(new GridLayout(1,2));
        panelSouth.setPreferredSize(new Dimension(300,400));
        panelSouth.setBorder(new TitledBorder("Informations sur le véhicule : "));
        panelSouth.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        JPanel southLeft =  new JPanel();
        BoxLayout layoutSouthLeft = new BoxLayout(southLeft, BoxLayout.Y_AXIS);
        southLeft.setLayout(layoutSouthLeft);

        southLeft.add(new JLabel("Modèle : "));
        southLeft.add(Box.createGlue());
        southLeft.add(new JLabel("Année : "));
        southLeft.add(Box.createGlue());
        southLeft.add(new JLabel("Marque : "));
        southLeft.add(Box.createGlue());
        southLeft.add(new JLabel("Type : "));
        southLeft.add(Box.createGlue());
        panelSouth.add(southLeft);

        JPanel southRight = new JPanel(); 
        southRight.add(Box.createGlue());

        southRight.add(Box.createGlue());
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; 
        JScrollPane jsp=new JScrollPane(southRight,v,h);
        jsp.setBorder(new TitledBorder("Historique des réparations : "));
        BoxLayout layoutSouthRight = new BoxLayout(southRight, BoxLayout.Y_AXIS);
        southRight.setLayout(layoutSouthRight);

        for(int i=0; i<30; i++){
            southRight.add(new JLabel("      - Test histo numero "+i));
            southRight.add(Box.createVerticalGlue());
        }  
        panelSouth.add(jsp);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(panelNord, BorderLayout.NORTH);
        panelPrincipal.add(panelWest, BorderLayout.CENTER);
        panelPrincipal.add(panelSouth, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       

        setContentPane(panelPrincipal);
        this.pack();
        this.setLocationRelativeTo(null);
        setVisible(true);

    }
    
    

}
        
   
        
        
    
    
 
    
    
    
  
    




