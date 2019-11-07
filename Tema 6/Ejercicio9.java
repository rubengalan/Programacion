public class Ejercicio9 {
  public static void main(String[] args) {
    
    int numero;
    int contador = 0;
    
    do {
      
      numero = (int)(Math.random()*100);
      
      if (numero % 2 == 0) {
        contador++;
      }
      
    } while (!(numero == 24));
    
    System.out.print("Se han generado: " + contador + " números");
    
  }
}
