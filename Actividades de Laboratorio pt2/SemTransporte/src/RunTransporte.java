public class RunTransporte {
 public static void main(String [] args){
   RAutomovil();
   RAutobus();
   RAvion();
   RHelicoptero();
 }
 
 private static void RAutomovil(){
   Automovil auto = new Automovil("Chevrolet","Camaro",41,23);
   System.out.println("---------------Automovil--------------");
   System.out.println(auto.mostrar());
   auto.cajuela();
   System.out.println(auto.bajaSubeVidrios());
   System.out.println(auto.prendeLuces());
   auto.encender();
   auto.acelerar(23);
   System.out.println(auto.frenar());
 }
 
 private static void RAutobus(){
   Autobus bus = new Autobus("Mercedes Benz","Citaro k",25,13);
   System.out.println("---------------Autobus--------------");
   System.out.println(bus.mostrar());
   bus.Puertas();
   System.out.println(bus.bajaSubeVidrios());
   System.out.println(bus.prendeLuces());
   bus.encender();
   bus.acelerar(13);
   System.out.println(bus.frenar());
   
 }
 
 private static void RAvion(){
   Avion av = new Avion("Boeing","Boeing 747-400",933,45);
   System.out.println("---------------Avion--------------");
   System.out.println(av.mostrar());
   av.luces();
   av.encender();
   av.acelerar(45);
   System.out.println(av.frenar());
 }
 
private static void RHelicoptero(){
   Helicoptero Heli = new Helicoptero("Rostvertol","Mil Mi-26",800,51);
   System.out.println("---------------Helicoptero--------------");
   System.out.println(Heli.mostrar());
   Heli.parabrisas();
   Heli.encender();
   Heli.acelerar(51);
   System.out.println(Heli.frenar());
}

private static void RBarco(){
  Barco B = new Barco("Hatteras","Hatteras 52",37,23);
  System.out.println("---------------Barco--------------");
  System.out.println(B.mostrar());
  B.salvavidas();
  B.encender();
  B.acelerar(23);
  System.out.println(B.frenar());
}
}
