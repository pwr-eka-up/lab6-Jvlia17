/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae4;

import java.io.FileWriter;

/**
 *
 * @author Julia Rzepka
 */
public class saveToCsv {
    
    public saveToCsv() {};
    
    synchronized void save (long value, boolean isprime){    
        try {
            FileWriter fw = new FileWriter("D:/Laboratory6/Task2.csv", true);
            StringBuilder sb = new StringBuilder();
            
            sb.append(value);
            sb.append(";");
            
            if (!isprime) {
            sb.append("No");
            sb.append("\r\n");}
            else {
            sb.append("Yes");
            sb.append("\r\n");}
            
            fw.write(sb.toString());
            fw.close();
            
        } catch (Exception e){}  
    }
}
