public class Avion extends Transporte implements IFrenos{
    public Avion(String modelo, String marca, int velocidad, int gas){
     super(modelo, marca, velocidad, gas);
    }
    
    @Override
    public void encender(){
     System.out.println("El avion esta encendido");
    }
    
    @Override
    public String frenar(){
     return "el avion se ha detenido con ayuda de los spoilers";
    }
    
    public void luces(){
     System.out.println("las luces de navegacion y anticolision estan encendidas");
    }
}
