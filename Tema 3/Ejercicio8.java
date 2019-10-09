public class Ejercicio8 {
  public static void main(String[] args) {
    String horas;
    System.out.print("Escribe las horas trabajadas esta semana: ");
    horas = System.console().readLine();
    
    int trabajadas;
    trabajadas = Integer.parseInt(horas);
    
    int euros;
    euros = 12;
    
    int salario;
    salario = trabajadas * euros;
    
    System.out.print("El salario de esta semana es de: " + salario + "€");
}
}
