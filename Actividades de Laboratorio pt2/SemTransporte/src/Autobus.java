public class Autobus extends Transporte implements ISElectrico, IFrenos{
    
    public Autobus(String modelo, String marca, int velocidad, int gas){
      super(modelo, marca, velocidad, gas);
    }
    
    @Override
    public void encender(){
     System.out.println("El autobus ha encendido");
    }
    
    @Override
    public String prendeLuces(){
      return "Las luces estan encendidas";
    }
    
   @Override
   public String bajaSubeVidrios(){
    return "Los vidrios se han subido";
   }
   
   @Override
   public String frenar(){
   return "El autobus se ha detenido";
   }
   
   public void Puertas(){
    System.out.println("Las puertas estan cerradas");
   }
}
