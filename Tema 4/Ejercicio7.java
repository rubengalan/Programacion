public class Ejercicio7 {
  public static void main(String[] args) {
    
    
    System.out.print("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la primera nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la primera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    
    
    System.out.print("Tu nota media es: " + ((nota1 + nota2 + nota3)/3));
  }
}