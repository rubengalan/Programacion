public class Ejercicio7 {
  public static void main(String[] args) {
    
    int codigo = 9654;
    int oportunidad = 0;
    boolean acierto = false;
    int combinacion;
    
    do {
      
      System.out.print("Introduce combinacion de la caja fuerte: ");
      combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion == codigo) {
        System.out.print("Has acertado la combinacion");
        acierto = true;
      } else {
        System.out.println("Has fallado y llevas " + (oportunidad + 1) + " de 4 intentos");
        oportunidad++;
      }
      
    } while ((oportunidad < 4) && (acierto = false));
  }
}
