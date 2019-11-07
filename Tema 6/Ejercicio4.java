public class Ejercicio4 {
  public static void main(String[] args) {
    
    int numero;
    int numero2;
    
    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random()*10+1);
      numero2 = (int)(Math.random()*10+1);
      System.out.println(numero + " " +  numero2);
    }
  }
}
