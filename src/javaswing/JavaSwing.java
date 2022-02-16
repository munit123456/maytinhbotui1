/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaswing;

/**
 *
 * @author Van Dat
 */
import javax.swing.JFrame;
public class JavaSwing {

    public JavaSwing(){
        JFrame frame = new JFrame("Hello");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
            
    public static void main(String[] args) {
        new JavaSwing();
        
    }
    
}
