public class Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el numero: ");
    int valor = Integer.parseInt(System.console().readLine());
    
    if(valor % 2 == 0) {
      System.out.println("Es par.");
    } else {
      System.out.println("Es impar.");
    }
    
    if (valor % 5 == 0) {
      System.out.println("Es divisible.");
    } else {
      System.out.println("No es divisible.");
    }
  }
}
