public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int cifra = numero % 10;
    
    System.out.print("La ultima cifra es: " + cifra);
  }
}
