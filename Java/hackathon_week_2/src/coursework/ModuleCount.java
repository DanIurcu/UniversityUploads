/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author dr3344j
 */
public class ModuleCount extends AllNotes {
    
    public void count(ArrayList<String> course) throws IOException {
        int i;
        int crse1 = 0;

        try {
            
         FileReader fr = new FileReader("Notes.txt");
            try (BufferedReader br = new BufferedReader(fr)) {

                String frcourse;
                while ((frcourse = br.readLine()) != null)  {
                    i = 0;
                    crse1 = 0;
                    String[] words = frcourse.split(" ");
                                out.println(words[i]);

                    if(words[i].equals(course.get(1))){
                        
                       crse1++;
                    }
                    i++;
                    
                }
            }
            out.println(crse1);

        } catch(IOException e) {
            out.println("File Not Found");
        }
        //count(course);
 }
    }
