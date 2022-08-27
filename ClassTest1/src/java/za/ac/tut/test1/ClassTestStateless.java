/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.test1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author QXW5421
 */
@Stateless
public class ClassTestStateless {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
   
    
    public void fileWrite(String filename, String text) {
              
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(filename);
        } catch (IOException ex) {
            Logger.getLogger(ClassTestStateless.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(text);
        printWriter.close(); 
    }   
    
}
