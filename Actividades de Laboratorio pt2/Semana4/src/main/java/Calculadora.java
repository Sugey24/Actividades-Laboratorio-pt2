/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sugey
 */
public class Calculadora extends DispositivoElectronico implements IOperacioneStandar{

    @Override
    public String encender() {
        return "Calculador Encendido"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public double suma(double a, double b){
    return a + b;
    }
    @Override
    public double resta(double a, double b){
        return a - b;
    }
}
    
