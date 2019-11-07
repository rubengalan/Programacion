public class Ejercicio6 {
  public static void main(String[] args) {
    
    int numeroIntroducido;
    int numAleatorio;
    int contador = 1;
    boolean adivinado = false;
    
    numAleatorio = (int)(Math.random()*101);

    do {
      
      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido < numAleatorio) {
        System.out.println("El numero introducido es menor que el que estas adivinando");
        System.out.println("Llevas " + contador + " intentos de 5 intentos");
        contador++;
      } 
      if (numeroIntroducido > numAleatorio) {
        System.out.println("El numero introducido es mayor que el que estas adivinando");
        System.out.println("Llevas " + contador + " intentos de 5 intentos");
        contador++;
      }
      if (numeroIntroducido == numAleatorio) {
        adivinado = true;
        System.out.println("Acertaste");
      }
    } while ((contador < 6) && (adivinado == false));
      System.out.println("El numero es el " + numAleatorio);
  }
}
