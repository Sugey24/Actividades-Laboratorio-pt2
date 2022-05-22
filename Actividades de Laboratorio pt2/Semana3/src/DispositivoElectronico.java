
public abstract class DispositivoElectronico {
    private String marca,modelo;
    
    public abstract void encender();
    
    public String apagar(){
      return "Dispositivo apagado";
    }
    
    public String getMarca(){
      return marca;
    }
    
    public void setMarca(String marca){
      this.marca = marca;
    }
    
    public String getModelo(){
     return modelo;
    }
    
    public void setModelo(String modelo){
      this.modelo = modelo;
    }
    
}
