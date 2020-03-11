/* This code will create a project management system for a small structural engineering
firm, this will allow the program to keep track on the many projects on which they work
 */
package com.mycompany.task7;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author KeamogetsweMashao
 */
public class Poised
{

    //Main Method
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        //Creating the objects to capture details
        //Array constricts to 5; only five new variables can be added at a given time
        
        NewProject[] pobj = new NewProject[5];
        int pnum = 0;

        NewArchitect[] aobj = new NewArchitect[5];
        int anum = 0;

        NewContractor[] cobj = new NewContractor[5];
        int cnum = 0;

        //Importing current date
        String timestamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        char option = JOptionPane.showInputDialog("What would you like to do. A) Add a project B) Add an Architect C) Add a Contracter D) Finalize a Project Z) Edit E) Exit").toLowerCase().charAt(0);

        //While loop to make sure that the menu keeps showing up until E in input
        while (option != 'e')
        {
            //Condition for what the user wants to do
            if (option == 'a')
            {

                if (pnum > 4)
                {
                    //output should there be no projects left
                    System.out.println("There are no more projects that could be added right now. Please try again later");
                } else
                {
                    //addition of new project
                    NewProject plink = new NewProject();
                    pobj[pnum] = new NewProject(plink.pnum, plink.pname, plink.building, plink.address, plink.erfnum, plink.tcost, plink.cpaid, plink.date, plink.cusname, plink.cuscpnum, plink.cusemail, plink.cusaddress);
                    System.out.println("Your project has been added and your project number is " + pnum );
                    pnum++;
                }
            }

            if (option == 'b')
            {
                if (anum > 4)
                {
                    //condtion 
                    System.out.println("No more Architects may be added");
                } 
                
                else
                {
                    NewArchitect alink = new NewArchitect();
                    aobj[anum] = new NewArchitect(alink.name, alink.num, alink.email, alink.address);
                    anum++;
                }
            }

            if (option == 'c')
            {
                if (cnum > 4)
                {
                    System.out.println("No more Contracters may be added");
                } else
                {
                    NewContractor clink = new NewContractor();
                    cobj[cnum] = new NewContractor(clink.name, clink.num, clink.email, clink.address);
                    cnum++;
                }
            }

            if (option == 'd')
            {
                //Allows code to write to the text document
                PrintWriter writer = new PrintWriter("Finished Projects.txt");

                int projnum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the project you want to finilize"));
                if (pobj[projnum].getCost() > 0.00)
                {
                    System.out.println("You still owe R" + pobj[projnum].getCost());
                    writer.write("You still owe R" + pobj[projnum].getCost() + "\n");
                    writer.write("Name: " + pobj[projnum].cusname + "\n");
                    writer.write("Email: " + pobj[projnum].cusemail + "\n");
                    writer.write("Phone number: " + pobj[projnum].cuscpnum + "\n");
                    writer.write("Address: " + pobj[projnum].cusaddress + "\n");
                    writer.write("Project number: " + pobj[projnum].pnum + "\n");
                    writer.write("Project name: " + pobj[projnum].pname + "\n");
                    writer.write("Building type: " + pobj[projnum].building + "\n");
                    writer.write("ERF Number: " + pobj[projnum].erfnum + "\n");
                    writer.write("Total cost: " + pobj[projnum].tcost + "\n");
                    writer.write("Due Date: " + pobj[projnum].date + "\n");
                    writer.write(timestamp);//date is YYYYMMDD Format
                    System.out.println("");
                    writer.close();
                } 
                
                else
                {
                    writer.println("Name: " + pobj[projnum].cusname + "\n");
                    writer.write("Email: " + pobj[projnum].cusemail + "\n");
                    writer.write("Phone number: " + pobj[projnum].cuscpnum + "\n");
                    writer.write("Address: " + pobj[projnum].cusaddress + "\n");
                    writer.write("Project number: " + pobj[projnum].pnum + "\n");
                    writer.write("Project name: " + pobj[projnum].pname + "\n");
                    writer.write("Building type: " + pobj[projnum].building + "\n");
                    writer.write("ERF Number: " + pobj[projnum].erfnum + "\n");
                    writer.write("Total cost: " + pobj[projnum].tcost + "\n");
                    writer.write("Due Date: " + pobj[projnum].date + "\n");
                    writer.write(timestamp);
                    System.out.println("");
                    writer.close();
                }
            }

            if (option == 'z')
            {
                char option2 = JOptionPane.showInputDialog("What would you like to change A) A projects Due Date B) The total price of the project C) A Contractors information E) Exit").toLowerCase().charAt(0);

                //To edit anything that needs to be edited
                while (option2 != 'e')
                {
                    int projnum2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter which project you want to change"));
                    if (option2 == 'a')
                    {
                        if (pobj[projnum2].date.isEmpty())
                        {
                            System.out.println("This project does no exist");
                        } else
                        {
                            String change = JOptionPane.showInputDialog("Please enter the new due date using this format YYYY/MM/DD");
                            System.out.println("The project due date has been changed");
                            System.out.println("Old due date: " + pobj[projnum2].date);
                            pobj[projnum2].date = change;
                            System.out.println("New due date: " + pobj[projnum2].date);
                        }
                    }

                    if (option2 == 'b')
                    {
                        double change = Double.parseDouble(JOptionPane.showInputDialog("Enter the new amount"));

                        System.out.println("The project total cost has been changed");
                        System.out.println("The old total cost was R" + pobj[projnum2].tcost);
                        pobj[projnum2].tcost = change;
                        System.out.println("The new total cost is R" + pobj[projnum2].tcost);
                    }

                    if (option2 == 'c')
                    {
                        cobj[projnum2].name = JOptionPane.showInputDialog("Please enter the new contracter name");
                        cobj[projnum2].num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the new contracter phone number"));
                        cobj[projnum2].email = JOptionPane.showInputDialog("Please enter the new contracter email address");
                        cobj[projnum2].address = JOptionPane.showInputDialog("Please enter the new contracter physical address");
                    }
                }
            }
            option = JOptionPane.showInputDialog("What would you like to do. A) Add a project B) Add an Architect C) Add a Contracter D) Finalize a Project Z) Edit E) Exit").toLowerCase().charAt(0);
        }
    }
}
