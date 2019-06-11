
package notepad;

import javax.swing.JFrame;

/**
 *
 * @author HRITHIK CHOUHAN
 */
public class Notepad 
{
    public static void main(String[] args) 
    {
        NotepadGUI obj = new NotepadGUI();
        obj.setBounds(0, 0, 700, 400);
        obj.setTitle("Notepad");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
