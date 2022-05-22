
public class Barco extends Transporte implements IFrenos{
    
    public Barco(String marca, String modelo, int velocidad, int gas){
     super(marca, modelo, velocidad, gas);
    }
    
    @Override
    public void encender(){
        System.out.println("El barco esta encendido");
    }
    
    @Override
    public String frenar(){
    return "El ancla ha sido liberado";
    }
    
    public void salvavidas(){
     System.out.println("Hay 5 salvavidas disponibles");
    }
}
