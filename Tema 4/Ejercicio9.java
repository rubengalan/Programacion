public class Ejercicio9 {
  public static void main(String[] args) {
    double a;
    double b;
    double c;
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");
    System.out.print("Introduce el valor de a: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el valor de c: ");
    c = Integer.parseInt(System.console().readLine());
    
    if (a == 0) {
      System.out.print("El valor de x es: " + (-c/b));
    } else {
      if ((b * b)-4 * a * c <0) {
        System.out.print("No tiene solucion real");
      } else {
        if ( (a == 0 ) && ( b == 0) && ( c == 0)) {
          System.out.print("No tiene solucion real");
          } else {
            double raiz = b * b - (4 * a * c);
            System.out.println("El valor de x es: " + (-b +  Math.sqrt(raiz))/(2 * a));
            System.out.println("El valor de x es: " + (-b -  Math.sqrt(raiz))/(2 * a));
        }
      }
    }
  }
}