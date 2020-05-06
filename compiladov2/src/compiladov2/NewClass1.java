/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladov2;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//from  w  ww  . j  a  v a  2s  .co  m
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
/**
 *
 * @author JOHNJAIRO
 */
public class NewClass1 {
   
  public static void main(String... args) {
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel titulo = new JLabel("prueba poblamient");
    
    
    JTextArea tarea = new JTextArea(10, 50);
    JLabel labelM = new JLabel("Not Only of Sight, but of: ");
    
        
    /**JFileChooser fc = new JFileChooser();
    JButton readButton = new JButton("OPEN FILE");
    readButton.addActionListener(ev -> {
      int returnVal = fc.showOpenDialog(frame);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        **/
        try {
          BufferedReader input = new BufferedReader(new InputStreamReader(
              new FileInputStream("sess/l0_1.txt"),"ISO-8859-1"));
          tarea.read(input, "READING FILE :-)");
          System.out.println("line");
        } catch (Exception e) {
            System.err.format("File does not exist");
          /*e.printStackTrace();*/
        }
      /**} else {
        System.out.println("Operation is CANCELLED :(");
      }
    });**/

    frame.getContentPane().add(tarea, BorderLayout.CENTER);
    /*frame.add(tarea);*/
    frame.getContentPane().add(labelM);
    /*frame.getContentPane().add(readButton, BorderLayout.PAGE_END);
    frame.setLayout(null);*/
    frame.pack();
    frame.setVisible(true);
  }
}