package coursework;

import java.util.Calendar;
import javax.swing.*;

/**
 *
 * @author dr3344j
 */
public class Coursework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //User input
        String usrYear = JOptionPane.showInputDialog(null, "What year were you born? " );
        String usrMonth = JOptionPane.showInputDialog(null, "What month were you born?");
        
        //Changing user input to lower case to help manage the variants of possible responses
        String usrMonthLc = usrMonth.toLowerCase();
        
        String[] monthArray = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        
        int minusAge = 0;
        
        //For loop and if statement to test the user input against the array
        for(int i=0;i <= 11; i++){
            
            if(monthArray[i].equals(usrMonthLc)){
                
                minusAge = ((i * 7) * 4);
            }
        }
        
        //Calendar allows access to the current year (as set on the current machine)
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        
        //Turns the user input into a integer for calculations
        int age = Integer.parseInt(usrYear);
        
        int ageCalc = (((currentYear - age)* 365) - minusAge);

        
        JOptionPane.showMessageDialog(null, "You are approximately " + ageCalc + " days old.");
    }

}
