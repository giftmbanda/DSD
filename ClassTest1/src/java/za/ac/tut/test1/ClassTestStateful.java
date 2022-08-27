/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.test1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

/**
 *
 * @author QXW5421
 */
@Stateful
public class ClassTestStateful {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    public String readWrite(String filename) { 
        
      Path path = Paths.get(filename);
      String text="";
        try {
            text = Files.readAllLines(path).get(0);
        } catch (IOException ex) {
            Logger.getLogger(ClassTestStateful.class.getName()).log(Level.SEVERE, null, ex);
        }
      return text;     
    }
}
