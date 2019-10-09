public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.print("Introduce hora: ");
    int dia =  Integer.parseInt(System.console().readLine());
    
    if( (6 <= dia) && (dia <= 12)) {
      System.out.println("Buenos dias");
      } else {
        System.out.println("No son buenos dias");}
  }
}

