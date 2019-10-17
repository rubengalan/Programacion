public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int f1 = 0;
    int f2 = 1;
    int aux = f1;
    
    for (n = n; n > 2; n--) {
      
      aux = f1;
      f1 = f2;
      f2 = aux + f2;
      
      System.out.print(f2 + " ");
    }
  }
}
