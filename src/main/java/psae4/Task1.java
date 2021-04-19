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
public class Task1{ //the first task consists of simple_multithreading_application
    
    public static void main(String[] args) {
        
    Thread t1 = new Thread(new Simple_multithreading_application("First"));
    Thread t2 = new Thread(new Simple_multithreading_application("Second"));
    Thread t3 = new Thread(new Simple_multithreading_application("Third"));
    Thread t4 = new Thread(new Simple_multithreading_application("Fourth"));
    Thread t5 = new Thread(new Simple_multithreading_application("Fifth"));
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}