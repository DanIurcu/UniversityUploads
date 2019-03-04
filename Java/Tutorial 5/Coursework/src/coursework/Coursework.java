/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author Danny
 */
public class Coursework extends JFrame implements ActionListener, KeyListener {

    JPanel pnl = new JPanel(new BorderLayout());
    JTextArea txtNewNote = new JTextArea();
    JTextArea txtDisplayNotes = new JTextArea();
    ArrayList<String> note = new ArrayList<>();

    ArrayList<String> course = new ArrayList<>();
    JComboBox courseList = new JComboBox();
    String crse = "";
    AllNotes allNotes = new AllNotes();
    
public static void main(String[] args) {
        // This is required for the coursework.
        JOptionPane.showMessageDialog(null, "Daniel Roberts");
        Coursework prg = new Coursework();
}

// Using MVC
public Coursework() {
    model();
    view();
    controller();
}

@Override
     public void actionPerformed(ActionEvent ae){
         if ("NewNote".equals(ae.getActionCommand())){
             addNote(txtNewNote.getText());
             txtNewNote.setText(""); 
         }   
         if ("Exit".equals(ae.getActionCommand())) {
            System.exit(0);
            }
         if ("Course".equals(ae.getActionCommand())) {
             crse = courseList.getSelectedItem().toString();
             System.out.println(crse);
         }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped not coded yet.");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed not coded yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased not coded yet.");
    }
    
    private void model() {
        course.add("COMP1752");
        course.add("COMP1753");
        crse = course.get(0);
        
        //Take these out AFTER you have created the file
        Note nt = new Note();
        nt.setNoteID(1);
        nt.setDayte(getDateAndTime());
        nt.setCourse(crse);
        nt.setNote("Arrays are of fixed length and are inflexible.");
        allNotes.addNote(nt.getNoteID(), nt.getCourse(), nt.getNote());        
        
        //Take these out AFTER you have created the file
        nt = new Note();
        nt.setNoteID(2);
        nt.setDayte(getDateAndTime());
        nt.setCourse(crse);
        nt.setNote("ArraysList can be added to and items can be deleted.");
        allNotes.addNote(nt.getNoteID(), nt.getCourse(), nt.getNote());        
    }



private void view() {
    Font fnt = new Font("Georgia", Font.PLAIN, 24);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setTitle("Coursework - Daniel Roberts");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel pnlTop = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    
    JMenu note = new JMenu();
    note = new JMenu("Note");
    note.setToolTipText("Note tasks");
    note.setFont(fnt);
    
    note.add(makeMenuItem("New", "NewNote", "Create a new note.", fnt));
    note.addSeparator();
    note.add(makeMenuItem("Close", "Close", "Clear the current note.", fnt));
    
    menuBar.add(note);
    menuBar.add(makeMenuItem("Exit", "Exit", "Close this program", fnt));
    
    for (String crse : course) {
        courseList.addItem(crse);
    }
    
    courseList.setFont(fnt);
    courseList.setMaximumSize(courseList.getPreferredSize());
    courseList.addActionListener(this);
    courseList.setActionCommand("Course");
    menuBar.add(courseList);
    this.setJMenuBar(menuBar);
    
    JToolBar toolBar = new JToolBar();
    // Setting up the ButtonBar
    JButton button = null;
    button = makeButton("Create", "NewNote",
                "Create a new note.",
                "New");
    toolBar.add(button);
    button = makeButton("closed door", "Close",
                "Close this note.",
                "Close");
    toolBar.add(button);
    toolBar.addSeparator();
    button = makeButton("exit", "Exit",
                "Exit from this program.",
                "Exit");
    toolBar.add(button);
    
    add(toolBar, BorderLayout.NORTH);
    
    add(pnlTop, BorderLayout.NORTH);
    pnlTop.add(toolBar, BorderLayout.NORTH);
    menuBar.add(toolBar);

    this.setJMenuBar(menuBar);
    
    JPanel pnlWest = new JPanel();
    pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
    pnlWest.setBorder(BorderFactory.createLineBorder(Color.black));
        
    txtNewNote.setFont(fnt);
    pnlWest.add(txtNewNote);

    JButton btnAddNote = new JButton("Add note");
    btnAddNote.setActionCommand("NewNote");
    btnAddNote.addActionListener(this);
    pnlWest.add(btnAddNote);
        
    add(pnlWest, BorderLayout.WEST);
    
    JPanel cen = new JPanel();
    cen.setLayout(new BoxLayout(cen, BoxLayout.Y_AXIS));
    cen.setBorder(BorderFactory.createLineBorder(Color.black));
    txtDisplayNotes.setFont(fnt);
    cen.add(txtDisplayNotes);
        
    add(cen, BorderLayout.CENTER);

    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setVisible(true);  // Needed to ensure that the items can be seen.
    }

  private void controller() {
      addAllNotes();
    }
  
  protected JMenuItem makeMenuItem(String txt,String actionCommand,String toolTipText,Font fnt) {
    JMenuItem mnuItem = new JMenuItem();
    mnuItem.setText(txt);
    mnuItem.setActionCommand(actionCommand);
    mnuItem.setToolTipText(toolTipText);
    mnuItem.setFont(fnt);
    mnuItem.addActionListener(this);
    
    return mnuItem;
}
  
  protected JButton makeButton(
            String imageName,
            String actionCommand,
            String toolTipText,
            String altText) {

        //Create and initialize the button.
        JButton button = new JButton();
        button.setToolTipText(toolTipText);
        button.setActionCommand(actionCommand);
        button.addActionListener(this);

        //Look for the image.
        String imgLocation = System.getProperty("user.dir")
                + "\\icons\\"
                + imageName
                + ".png";

        File fyle = new File(imgLocation);
        if (fyle.exists() && !fyle.isDirectory()) {
            // image found
            Icon img;
            img = new ImageIcon(imgLocation);
            button.setIcon(img);
        } else {
            // image NOT found
            button.setText(altText);
            System.err.println("Resource not found: " + imgLocation);
        }

        return button;
    }
  
  private void addNote(String text) {
        note.add(txtNewNote.getText());
        addAllNotes();
    }
    
    private void addAllNotes() {
        String txtNotes = "";
        
        for (Note n : allNotes.getAllNotes()) {
            txtNotes += n.getNote() + "\n";
        }
        txtDisplayNotes.setText(txtNotes);
    }
    
    private String getDateAndTime() {
        String UK_DATE_FORMAT_NOW = "dd-MM-yyyy HH:mm:ss";
        String ukDateAndTime;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat uksdf = new SimpleDateFormat(UK_DATE_FORMAT_NOW);
        ukDateAndTime = uksdf.format(cal.getTime());
        return ukDateAndTime;
    }
}