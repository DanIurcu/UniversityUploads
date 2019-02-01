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

private void view() {
    Font fnt = new Font("Georgia", Font.PLAIN, 24);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setTitle("Coursework - Daniel Roberts");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel cen = new JPanel();
    cen.setLayout(new FlowLayout());
    
    String html = "<html><body>Hello <b>Danny</b></body></html>";
    JLabel cenLbl = new JLabel(html);
    cenLbl.setFont(fnt);
    cen.add(cenLbl);
    add(BorderLayout.CENTER, cen);
    
    JPanel wst = new JPanel();
    wst.setLayout(new FlowLayout());
    String wstHtml ="<html><body>test</body></html>";
    JButton wstButton = new JButton(wstHtml);
    wst.add(wstButton);
    add(BorderLayout.WEST, wst);
    
    wstButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            cenLbl.setText("<html><body><b>SHAZAM!</b></body></html>");
        }
});
    
    setVisible(true);  // Needed to ensure that the items can be seen.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("actionPerformed not coded yet.");
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