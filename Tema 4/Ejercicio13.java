public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el primer valor: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el primer valor: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el primer valor: ");
    int c = Integer.parseInt(System.console().readLine());
    
    int orden;
    
    if (a > b) {
      aux = a;
      a = b;
      b = orden; 
      }
    if (b > c) {
      aux = b;
      b = c;
      c = orden; 
      }
    if (a > b) {
      aux = a;
      a = b;
      b = orden;
      }

      System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
    
  }
 }
