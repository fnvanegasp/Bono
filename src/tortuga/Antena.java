/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class Antena extends Thread{
    private Turtle turtle;

  Antena(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
public void run(){
    segment(turtle);
}

private void segment(Turtle t){
    t.forward(30);
    t.right(90);
    t.penUp();
    t.forward(10);
    t.right(90);
    t.penDown();
    t.forward(30);
    t.right(90);
    t.forward(10);
    t.right(90);
    t.forward(30);
    
    for(int i = 0; i < 360; i++){
            t.forward(0.09);
            t.right(1);
        }
    
    t.penUp();
    t.right(90);
    t.forward(40);
}
}
