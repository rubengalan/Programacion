public class Ejercicio3 {
  public static void main(String[] args) {
    String pesetas;
    System.out.print("Escribe las pesetas que quieres convertir: ");
    pesetas = System.console().readLine();
    int dinero;
    dinero =  Integer.parseInt(pesetas);
    
    double euros;
    euros = dinero / 166.386;
    
    System.out.printf(dinero + " pesetas son %.2f €", euros);
}
}

