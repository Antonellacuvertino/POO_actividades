
package gestiondeestudiante;
import java.util.Scanner; 
public class GestionDeEstudiante {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;
    
       System.out.println("ingresa tu matricula");
       String matricula = scanner.nextLine() ;
       
       System.out.println("ingresa tu nombre ");
       String nombre = scanner.nextLine() ;
       
       System.out.println("tu nota es") ;
       Boolean notaFinal = scanner.nextBoolean() ;
       
       Estudiante estudiante1 = new Estudiante( matricula, nombre , notaFinal) ;
       
       //mostrar toda la info del estudiante
        System.out.println("informacion del producto");
        System.out.println(estudiante1.getMatricula());
         
       // verificar si el producto esta disponible
       if(estudiante1.setNotaFinal()){
           System.out.println("el producto esta disponible y listo para su compra");
       }
       else {
           System.out.println("im sorry is not disponible product");
       } 
       
    }
    
}
