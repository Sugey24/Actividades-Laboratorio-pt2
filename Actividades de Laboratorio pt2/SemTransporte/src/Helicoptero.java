public class Helicoptero extends Transporte implements IVolar, IFrenos{
    
    public Helicoptero(String modelo, String marca, int velocidad, int gas){
    super(modelo, marca, velocidad, gas);
    }
    
    @Override
    public void encender(){
      System.out.println("El helicoptero esta encendido");
    }
    
    @Override
    public String volar(){
     return "El helicoptero ha despegado";
    }
    
    @Override
    public String frenar(){
     return "se ha disminuido la velocidad para un aterrizaje seguro";
    }
    
    public void parabrisas(){
     System.out.println("Los parabrisas estan limpios");
    }
      
}
