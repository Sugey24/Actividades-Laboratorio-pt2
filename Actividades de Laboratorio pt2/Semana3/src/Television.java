
public class Television extends DispositivoElectronico{
    @Override
    public void encender(){
      System.out.println("Television encendida");
    }
    
    public String cambiarVolumen(){
      return "sube volumen";
    }
    
    public String cambiarCanal(){
        return "Television cambia de canal";
    }
    
    public String color(String color){
      return color;
    }
}
