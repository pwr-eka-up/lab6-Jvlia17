/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae4;

/**
 *
 * @author Julia Rzepka
 */
public class Multithread extends Thread{
    Long value;
    boolean isprime;
    
    public Multithread (Long x){value = x;}
    
    /**
     *
     */
    @Override
    public void run() {
        
        Prime p1 = new Prime(value);
        isprime = p1.check();
        
        saveToCsv s1 = new saveToCsv();
        s1.save(value, isprime);
    }
}
