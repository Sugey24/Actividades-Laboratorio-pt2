/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sugey
 */
public class CalculadoraBasica extends Calculadora{
    
    private String color;
    
    public double div(double a, double b){
     return a/b;
    }
    
    public double mult(double a, double b){
      return a*b;
    }
    
    public String getcolor(){
     return color;
    }
    
    public void setcolor(String color){
      this.color = color;
    }
}
