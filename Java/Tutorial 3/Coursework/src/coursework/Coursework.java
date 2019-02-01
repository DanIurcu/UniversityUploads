/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Danny
 */
public class Coursework extends JFrame implements ActionListener, KeyListener {

    JPanel pnl = new JPanel(new BorderLayout());
    JTextField txtShowText = new JTextField(20);
    
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

protected JMenuItem makeMenuItem(String txt,String actionCommand,String toolTipText,Font fnt) {
    JMenuItem mnuItem = new JMenuItem();
    mnuItem.setText(txt);
    mnuItem.setActionCommand(actionCommand);
    mnuItem.setToolTipText(toolTipText);
    mnuItem.setFont(fnt);
    mnuItem.addActionListener(this);
    
    return mnuItem;
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
    
    JMenu course = new JMenu();
    course = new JMenu("Course");
    course.setToolTipText("Courses I am enrolled on");
    course.setFont(fnt);
    course.add(makeMenuItem("Object oriented Programming", "OOP", "OOP Notes", fnt));
    course.addSeparator();
    course.add(makeMenuItem("Smart Systems", "Smart Systems", "Smart Systems Notes", fnt));
    course.addSeparator();
    course.add(makeMenuItem("Math 1011", "Math", "Math 1011 Notes", fnt));
    course.addSeparator();
    course.add(makeMenuItem("Database Systems Development", "DSD", "Database Systems Developments Notes", fnt));

    menuBar.add(course);
    
    pnlTop.add(menuBar);
    add(pnlTop, BorderLayout.NORTH);
    
    JPanel cen = new JPanel();
    cen.setLayout(new FlowLayout());
    
    String html = "<html><body>Hello <b>Danny</b></body></html>";
    JLabel cenLbl = new JLabel(html);
    cenLbl.setFont(fnt);
    cen.add(cenLbl);
    add(BorderLayout.CENTER, cen);
    
    JPanel wst = new JPanel();
    wst.setLayout(new FlowLayout());
    JButton wstButton = new JButton("Show note");
    wstButton.setActionCommand("NewNote");
    wstButton.addActionListener(this);
    
    wst.add(wstButton);
    wst.add(txtShowText);
    
    add(BorderLayout.WEST, wst);
    
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    
    setVisible(true);  // Needed to ensure that the items can be seen.
    }

    @Override
     public void actionPerformed(ActionEvent ae){
            if ("NewNote".equals(ae.getActionCommand())) {
                txtShowText.setText("This is a note.");
            }
            if ("Close".equals(ae.getActionCommand())) {
                txtShowText.setText("");
            }
            if ("Exit".equals(ae.getActionCommand())) {
            System.exit(0);
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
        System.out.println("model not coded yet.");
    }

    private void controller() {
        System.out.println("controller not coded yet.");
    }

}