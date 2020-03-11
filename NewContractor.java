/*Class will capture the contractr's details

*/
package com.mycompany.task7;

import javax.swing.JOptionPane;

/**
 * @author Keamogetswe Mashao
 */
public class NewContractor
{
    //Inputs for contractor's details
    String name = JOptionPane.showInputDialog("Please enter the Contracters name");
    int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Contracters phone number"));
    String email = JOptionPane.showInputDialog("Please enter the Contracters email address");
    String address = JOptionPane.showInputDialog("Please enter the Contracters physical address");

    NewContractor(String name, int num, String email, String address)
    {
        
    }

    
    NewContractor()
    {
        
    }
}
