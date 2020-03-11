/*Class that will be used to create the person

 */
package com.mycompany.task7;

import javax.swing.JOptionPane;

/**
 *
 * @author KeamogetsweMashao
 */
public class NewArchitect
{
    //Person's details
    String name = JOptionPane.showInputDialog("Please enter the Architect name");
    int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the Architects phone number"));
    String email = JOptionPane.showInputDialog("Please enter the Architects email address");
    String address = JOptionPane.showInputDialog("Please enter the Architects physical address");

    
    NewArchitect(String name, int num, String email, String address)
    {
        
    }

    NewArchitect()
    {
        
    }
    
}

