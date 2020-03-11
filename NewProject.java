/*Class will capture the project's details

 */
package com.mycompany.task7;

import javax.swing.JOptionPane;

/**
 *
 * @author KeamogetsweMashao
 */
public class NewProject
{


    int num = 0;

    // Inputs
    int pnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the project number"));
    String pname = JOptionPane.showInputDialog("Please enter the project name");
    String building = JOptionPane.showInputDialog("What building is being desgined eg House, apartment block etc");
    String address = JOptionPane.showInputDialog("Whats the physical address of the project");
    int erfnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the ERF number"));
    double tcost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the total amount of the projects"));
    double cpaid = Double.parseDouble(JOptionPane.showInputDialog("Please enter the ammount you have already paid"));
    String date = JOptionPane.showInputDialog("Please enter the deadline of the date using the format YYYY/MM/DD");



    String cusname = JOptionPane.showInputDialog("Please enter the customers name");
    int cuscpnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the customers number"));
    String cusemail = JOptionPane.showInputDialog("Please enter the customers email address");
    String cusaddress = JOptionPane.showInputDialog("Please enter the customers physical address");

    int slocation = cusname.indexOf(" ") + 1;
    String cussurname = cusname.substring(slocation);

    //NewProject[num] pobj = {pnum, pname, building, address, erfnum, tcost, cpaid, date, cusnmae, cuscpnum, cusemail, cusaddress};

    NewProject(int pnum, String pname, String building, String address, int erfnum, double tcost, double cpaid, String date, String cusname, int cuscpnum, String cusemail, String cusaddress)
    {
        
    }

    //function for cost
    public double getCost()
    {
        double sum = tcost - cpaid;

        //returns cost minus paid amount
        return sum;
    }

    NewProject()
    {
        
    }

}

