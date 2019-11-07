public class Ejercicio3 {
  public static void main(String[] args) {
    
      int [] num = new int [10];
      
      for (int i = 0; i < 10; i++) {
        System.out.print("Introduce numero: ");
        num[i] = Integer.parseInt(System.console().readLine());
      }
      for (int i = 9; i >= 0; i--) {
        System.out.println(num[i]);
      }
  }
}
