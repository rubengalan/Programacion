public class Ejercicio13 {
  public static void main(String[] args) {
    
    int positivos = 0;
    int negativos = 0;
    
    for(int i = 0; i<10; i++) {
      
      System.out.print("Introduce un numero: ");
      int r1 = Integer.parseInt(System.console().readLine());
      
      if (r1 > 0) {
        positivos++;
      } else {
        negativos++;
      }
    }
    System.out.print("De los 10 numero introducidos " + positivos + " han sido positivos " + negativos + " han sido negativos");
    
  }
}
