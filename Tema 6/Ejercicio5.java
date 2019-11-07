public class Ejercicio5 {
  public static void main(String[] args) {
    
    int numero;
    int suma;
    
    int max;
    int min;
    
    max = 100;
    min = 199;
    suma = 0;
    
    for (int i = 0; i < 20; i++) {
      numero = (int)((Math.random()*99+1) + 100);
      suma = numero + suma;
      
      if (numero < min) {
        min = numero;
      } 

      if (numero > max) {
        max = numero;
      }
      System.out.println(numero);
    }
    System.out.println("");
    System.out.println("El numero mayor es: " + max);
    System.out.println("El numero menor es: " + min);
    System.out.println("La media de todos los numeros mostrados es: " + suma/2);
  }
}
