public class Ejercicio13 {
  public static void main(String[] args) {
    
    int dado1;
    int dado2;
    int contador = 0;
    boolean iguales = false;
    
    do {
    
    dado1 = (int)(Math.random()*6+1);
    dado2 = (int)(Math.random()*6+1);
    
    if (dado1 == dado2) {
      iguales = true;
    }
    
    contador++;
    
  } while (iguales == false);
  
    System.out.println("Se han tirado los dados: " + contador + " veces");
    System.out.println(dado1 + " " + dado2);
    
  }
}
