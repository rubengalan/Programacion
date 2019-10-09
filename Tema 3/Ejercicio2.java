public class Ejercicio2 {
  public static void main(String[] args) {
    String euros;
    System.out.print("Escribe los € que quieres convertir: ");
    euros = System.console().readLine();
    int dinero;
    dinero =  Integer.parseInt(euros);
    
    double pesetas;
    pesetas = dinero * 166.386;
    
    System.out.print(dinero + "€ son " + pesetas + " pesetas");
}
}
