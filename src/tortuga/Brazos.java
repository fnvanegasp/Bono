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
public class Brazos extends Thread{
  private Turtle turtle;

  Brazos(Turtle turtle){
    this.turtle = turtle;
    }
 
 
 public void run(){
    segment(turtle);
 }

 private void segment(Turtle t){
    t.right(90);
    t.forward(10);
    t.penUp();
    t.right(90);
    t.forward(5);
    t.right(90);
    t.penDown();
    t.forward(10);
    
    t.right(180);
    t.penUp();
    t.forward(10);
    t.left(90);
    t.forward(2.5);
    t.penDown();
    
    for(int i = 0; i < 360; i++){
            t.forward(0.2);
            t.right(1);
        }
    
    t.penUp();
    t.right(90);
    t.forward(6);
    t.penDown();
    t.left(90);
    
    for(int i = 0; i < 360; i++){
            t.forward(0.1);
            t.right(1);
        }
    
    t.penUp();
    t.right(180);
    t.forward(12.5);
    t.penDown();
    
    t.forward(5);
    t.left(90);
    t.forward(15);
    t.left(90);
    t.forward(5);
    t.left(90);
    t.forward(15);
    t.left(90);
    t.forward(5);
    
    t.right(90);
    t.forward(2.5);
    t.left(90);
    t.forward(60);
    t.left(90);
    t.forward(21);
    t.left(90);
    t.forward(60);
    t.left(90);
    t.forward(20);
    t.right(90);
    
    t.penUp();
    t.forward(20);
    t.left(90);
    t.forward(14);
    t.forward(150);
    t.penDown();
    
    t.forward(10);
    t.penUp();
    t.left(90);
    t.forward(5);
    t.left(90);
    t.penDown();
    t.forward(10);
    
    t.left(180);
    t.penUp();
    t.forward(10);
    t.right(90);
    t.forward(2.5);
    t.penDown();
    
    for(int i = 0; i < 360; i++){
            t.forward(0.2);
            t.left(1);
        }
    
    t.penUp();
    t.left(90);
    t.forward(6);
    t.penDown();
    t.right(90);
    
    for(int i = 0; i < 360; i++){
            t.forward(0.1);
            t.left(1);
        }
    
    t.penUp();
    t.left(180);
    t.forward(12.5);
    t.penDown();
    
    t.forward(5);
    t.right(90);
    t.forward(15);
    t.right(90);
    t.forward(5);
    t.right(90);
    t.forward(15);
    t.right(90);
    t.forward(5);
    
    t.left(90);
    t.forward(2.5);
    t.right(90);
    t.forward(60);
    t.right(90);
    t.forward(21);
    t.right(90);
    t.forward(60);
    t.right(90);
    t.forward(20);
    t.left(90);
    
    }
}
