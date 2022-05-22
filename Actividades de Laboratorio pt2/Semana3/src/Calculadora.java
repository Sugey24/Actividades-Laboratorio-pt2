
public class Calculadora extends DispositivoElectronico{
    
    @Override
    public void encender(){
      System.out.println("Calculadora encendida");
    }
    
    public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a, double b){
      return a-b;
    }
    
    public double division(double a, double b){
      double r;
      r=(a/b);
      return r;
    }
    
    public double multiplicacion(double a, double b){
     return a*b;
    }
    
}
