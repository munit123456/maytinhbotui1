/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Van Dat
 */
public class Hellowrold extends JFrame{
    public Hellowrold() throws HeadlessException{
        setSize(400, 400);
    }
    
    public static void main(String[] args){
        new Hellowrold().setVisible(true);
    }

    
    
}
