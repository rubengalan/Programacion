public class Ejercicio6 {
  public static void main(String[] args) {
    
    int [] num = new int [15];
    
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduce numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    int x = num[14];
    
    for (int i = 14; i > 0; i--) {
      num[i] = num[i-1];
    }
    
    num[0] = x;
    
    for (int i = 0; i < 15; i++) {
      System.out.print(num[i]+ " ");
    }
  }
}
