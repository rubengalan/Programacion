public class Ejercicio5 {
  public static void main(String[] args) {
    
    int [] num = new int [10];
    
    System.out.print("Introduce número: ");
    num[0] = Integer.parseInt(System.console().readLine());
    
    int numMax = num[0];
    int numMin = num[0];
    
      for (int i = 1; i < 10; i++) {
        System.out.print("Introduce numero: ");
        num[i] = Integer.parseInt(System.console().readLine());
        if (num[i] > numMax) {
          numMax = num[i];
        }
        if (num[i] < numMax) {
          numMin = num[i];
        }
      }
      System.out.println("El maximo es: " + numMax);
      System.out.println("El mínimo es: " + numMin);
      
  }
}
