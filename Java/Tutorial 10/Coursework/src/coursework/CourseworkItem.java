/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Danny
 */
public class CourseworkItem extends CommonCode {
     public ArrayList<Note> coursworkItem = new ArrayList<>();
     public int max = 0;
     
     public String addCourse() {
         String newItem;
         newItem = JOptionPane.showInputDialog("Insert Course");
         
         try {
             FileWriter fw = new FileWriter("Courses.txt", true);
             PrintWriter pw = new PrintWriter(fw);
             
             pw.println(newItem);
             pw.close();  
         } catch (IOException e) {
             out.println("Error");
         }
         return newItem;
     }
}
