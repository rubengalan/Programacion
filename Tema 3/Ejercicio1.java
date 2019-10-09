public class Ejercicio1 {
  public static void main(String[] args) {
  String numeros;
  System.out.print("Escribe primer numero: ");
  numeros = System.console().readLine();
  int numero1;
  numero1 =  Integer.parseInt(numeros);
  
  System.out.print("Escribe segundo numero: ");
  numeros = System.console().readLine();
  int numero2;
  numero2 =  Integer.parseInt(numeros);
  int multiplicacion;
  multiplicacion = numero1 * numero2;
  
  System.out.print("La multiplicacion del los dos numeros introducidos es: " + multiplicacion); 

}
}
