public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Introduce la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segTotal;
    int horasSegundos;
    int minutosSegundos;
    int suma;
    int solucion;
    
    horasSegundos = hora * 3600;
    minutosSegundos = minutos * 60;
    suma = horasSegundos + minutosSegundos;
    segTotal = 86400;
    solucion = segTotal - suma;
    
    System.out.print("Quedan " + solucion + " segundos para la media noche");
    
  }
}
