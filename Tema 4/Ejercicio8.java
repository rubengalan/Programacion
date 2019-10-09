public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.print("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la primera nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la primera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double notaFinal = (nota1 + nota2 + nota3)/3;
    
    if (notaFinal < 5) {
      System.out.print("Insuficiente");
    } else {
      if (notaFinal < 6) {
        System.out.print("Suficiente");
      } else {
        if (notaFinal < 7) {
          System.out.print("Bien");
        } else {
          if (notaFinal < 9) {
            System.out.print("Notable");
          } else {
            if (notaFinal <= 10) {
              System.out.print("Sobresaliente");
            } else {
              System.out.print("Nota incorrecta");
            }
          }
        }
      }
    }
  }
}
