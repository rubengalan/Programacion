public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.print("Introduce numero: ");
    int tabla = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < 11; i++) {
      System.out.println(tabla + " * " + i + " = " + (tabla * i));
    }
   }
 }
