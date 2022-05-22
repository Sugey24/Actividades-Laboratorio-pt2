
public class RunSemana3 {
    public static void main(String[] args){
        
        Television T = new Television();
        Calculadora C = new Calculadora();
        
        T.setMarca("Hitachi");
        T.setModelo("modeloT");
        C.setMarca("Casio");
        C.setModelo("modeloC");
        
        System.out.println("******Television**********");
        System.out.println("Marca: "+T.getMarca());
        System.out.println("Modelo: "+T.getModelo());
        System.out.println("Color: "+T.color("rojo"));
        T.encender();
        System.out.println(T.cambiarCanal());
        System.out.println(T.cambiarVolumen());
        System.out.println(T.apagar());
        
        System.out.println("*****Calculadora***********");
        System.out.println("Marca: "+C.getMarca());
        System.out.println("Modelo: "+C.getModelo());
        C.encender();
        System.out.println(C.suma(4, 2));
        System.out.println(C.resta(4, 2));
        System.out.println(C.division(4, 2));
        System.out.println(C.multiplicacion(4, 2));
        System.out.println(C.apagar());
    }
    
}
