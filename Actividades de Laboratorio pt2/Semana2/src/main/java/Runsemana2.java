/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sugey
 */
import java.util.Scanner;

public class Runsemana2 {
    public static void main(String[] args){
    Scanner sm = new Scanner(System.in);
    CalculadoraBasica casio = new CalculadoraBasica();
    
    System.out.println("Introduce la marca");
    String mrca = sm.nextLine();
    casio.setMarca(mrca);
    System.out.println("Introduce el color");
    String color = sm.nextLine();
    casio.setcolor(color);
    
    System.out.println("Marca: " + casio.getMarca());
    System.out.println("Color: " + casio.getcolor());    
    double rs = casio.suma(6.5, 9);
    System.out.println("La suma es: "+ rs);
    System.out.println("Resta: "+ casio.resta(4, 2));
    System.out.println("Multiplicacion: " + casio.mult(9, 9));
    System.out.println("Division: "+ casio.div(10, 2));
    
    }
    
}
