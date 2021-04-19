/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Julia Rzepka
 */
public class loadData{
    
    public void loadData() {};
    
    public ArrayList<Long> load() throws IOException {
        
        ArrayList<Long> numbers = new ArrayList();
        
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("D:/Laboratory6/Numbers.csv"));
            String s;
            int counter = 0;
            
            while ((s = fileReader.readLine()) != null){
            
                Long a = Long.parseLong(s); 
                numbers.add(a);
            }
            
        } catch (Exception E){
        } finally {
            if (fileReader != null) {
                fileReader.close();}
        } 
        return numbers;
    }
}
    