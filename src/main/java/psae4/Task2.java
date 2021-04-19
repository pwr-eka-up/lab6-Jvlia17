/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae4;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Julia Rzepka
 */
public class Task2{ //the second task consists of prime, multithread, loadData, savetoCsv
    
    public static void main(String[] args) throws IOException {
        
        int counter = 0;
        loadData lf1 = new loadData();
        ArrayList<Long> numbers = lf1.load();
        for (int i = 0; i<numbers.size(); i++){
            if (counter % 4 == 0){
            Multithread t1 = new Multithread(numbers.get(i));
            t1.start();}
            if (counter % 4 == 1){
            Multithread t2 = new Multithread(numbers.get(i));
            t2.start();}
            if (counter % 4 == 2){
            Multithread t3 = new Multithread(numbers.get(i));
            t3.start();}
            if (counter % 4 == 3){
            Multithread t4 = new Multithread(numbers.get(i));
            t4.start();}
            counter++;
        }   
    }
}
        