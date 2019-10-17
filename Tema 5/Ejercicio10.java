public class Ejercicio10 {
  public static void main(String[] args) {
    
    int num = 0;
    int numeroIntroducido = 0;
    int suma = 0;
    
    
    while(numeroIntroducido>=0) {
      System.out.print("Introduce un numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      num++;
      suma += numeroIntroducido;
    }
    System.out.print("La media de los números introducidos es: " + (suma - numeroIntroducido)/ (num - 1));
  }
}
