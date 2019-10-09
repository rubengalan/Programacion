public class Ejercicio4 {
  public static void main(String[] args) {
    int horas;
    int horasExtras;
    
    System.out.print("Introduce las horas trabajadas ");
    horas = Integer.parseInt(System.console().readLine());
    
    if (horas <= 40) {
      System.out.print("Tu salario es: " + (horas * 12) + " €");
    } else {
      horasExtras = (horas - 40) * 16 + (40*12);
      System.out.print("Tu salario es: " + horasExtras);
     }
   }
 }
