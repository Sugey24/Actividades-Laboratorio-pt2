//clase padre
public abstract class Transporte {
    public int velocidad, gas;
    public String marca, modelo;
    
   public Transporte(String marca, String modelo, int velocidad, int gas){
    this.marca = marca;
    this.modelo = modelo;
    this.velocidad = velocidad;
    this.gas = gas;
   }
   
    public void acelerar(int gas){
     if(gas > 10){
       System.out.println("Acelera");
     }
    }
    
    public String mostrar(){
      return "Marca: " + marca + "\nModelo: "+modelo+"\nVelocidad: "+velocidad+"\nGas: "+gas;
    }
    
    public abstract void encender();
    
}
