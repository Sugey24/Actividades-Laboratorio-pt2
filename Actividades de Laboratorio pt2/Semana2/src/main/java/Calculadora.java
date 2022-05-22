/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sugey
 */
public class Calculadora {
    private String marca;
    
    public double suma(double a, double b){
      return a+b;
    }
    
    public double resta(double a, double b){
       return a-b;
    }

    public String getMarca(){
      return marca;
    }
    
    public void setMarca(String marca){
      this.marca = marca;
    }

    
}
