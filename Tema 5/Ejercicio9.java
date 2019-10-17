public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int contador = 1;
    
    do {
    
      num = num / 10;
      contador++;
    
    } while(num > 10);
    
    System.out.print("El numero tiene " + contador + " cifras");
  }
}
