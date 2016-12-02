/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import ch.aplu.turtle.Turtle;
/**
 *
 * @author Freddy Vanegas
 */
public class Piernas extends Thread{
    private Turtle turtle;
    
    Piernas(Turtle turtle){
    this.turtle = turtle;
    }
    
    private void segment(Turtle t){
        t.forward(50);
        t.right(135);
        t.forward(70.71);
        t.right(135);
        t.forward(50);
        
        t.penUp();
        t.forward(50);
        t.penDown();
        
        t.right(90);
        t.forward(50);
        t.left(135);
        t.forward(70.71);
        t.left(135);
        t.forward(50);
        
        t.left(90);
        t.forward(100);
        t.left(90);
        t.forward(20);
        t.left(90);
        t.forward(70);
        
        t.left(90);
        t.penUp();
        t.forward(90);
        
        t.left(90);
        t.penDown();
        t.forward(70);
        t.left(90);
        t.forward(20);
        t.left(90);
        t.forward(50);
        
        t.left(90);
        t.forward(20);
        t.left(180);
        
        t.penUp();
        t.forward(70);
        t.penDown();
        t.forward(20);
        
        t.penUp();
        t.forward(40);
             
    }
    
    public void run(){
        segment(turtle); 
    }
}
