
package ejercicio.pkg2.guia.pkg10.manejo.exepciones;

public class Ejercicio2Guia10ManejoExepciones {

   
    public static void main(String[] args) {
        Definir def=new Definir();
    try{
        System.out.println(def.nueva());
    }
    catch(ArrayIndexOutOfBoundsException a){
        System.out.println("ocurrio un error, ya que la posicion "+a.getMessage()+" no existe en este array");
    }
    }
    
}
/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/