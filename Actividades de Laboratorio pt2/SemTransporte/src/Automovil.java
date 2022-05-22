public class Automovil extends Transporte implements IFrenos, ISElectrico{
    public Automovil(String marca, String modelo, int velocidad, int gas){
      super(marca, modelo, velocidad,gas);
    }
    
    @Override
    public void encender(){
      System.out.println("El auto esta encendido");
    }
    
    @Override
    public String frenar(){
        return "El Auto ha frenado";
    }
    
    @Override
    public String prendeLuces(){
    return "Luces encendidas";
    }
    
    @Override
    public String bajaSubeVidrios(){
        return "El vidrio ha sido bajado";
    }
    
    public void cajuela(){
      System.out.println("La cajela esta cerrada");
    }
}
