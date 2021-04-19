/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psae4;

import java.util.Random;

/**
 *
 * @author Julia Rzepka
 */
public class Simple_multithreading_application implements Runnable{ //once i used runnable once threads because i wanted to try how does it work
    String name;
    int time;
    Random r= new Random();
    int number;
    
    public Simple_multithreading_application (String x){
        name=x;
        time = r.nextInt(999);
        number = 0;
    }
    

    public void run() {
        try{
            System.out.println(name+" is sleeping for "+time);
            Thread.sleep(time);
            number = number + r.nextInt(99);
            System.out.println(name+" "+number);
            Thread.sleep(time);
            number = number + r.nextInt(99);
            System.out.println(name+" "+number);
            Thread.sleep(time);
            number = number + r.nextInt(99);
            System.out.println(name+" "+number);
            Thread.sleep(time);
            number = number + r.nextInt(99);
            System.out.println(name+" "+number);
            Thread.sleep(time);
            number = number + r.nextInt(99);
            System.out.println(name+" "+number);
            System.out.println(name+" is done");
  	} catch (Exception e){}
    }
}