public class Ejercicio5 {
  public static void main(String[] args) {
    double a;
    double b;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Introduce el valor de a: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    b = Integer.parseInt(System.console().readLine());
    
    if (a == 0) {
      System.out.print("La ecuación no tiene solución real");
    } else {
      System.out.print("El valor de x es: " + (-b/a));
      }
  }
}
