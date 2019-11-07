public class Ejercicio1 {
  public static void main(String[] args) {
    
    int dado1;
    int dado2;
    int dado3;
    
    dado1 = (int)(Math.random()*6+1);
    dado2 = (int)(Math.random()*6+1);
    dado3 = (int)(Math.random()*6+1);
    
    int suma = dado1 + dado2 + dado3;
    
    System.out.println("El valor del primer dado es: " + dado1);
    System.out.println("El valor del segundo dado es: " + dado2);
    System.out.println("El valor del tercer dado es: " + dado3);
    
    System.out.println("La suma de los 3 dados es: " + suma);
    
  }
}
