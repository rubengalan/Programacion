public class Ejercicio4 {
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
  int suma;
  int division;
  int resta;
  multiplicacion = numero1 * numero2;
  suma = numero1 + numero2;
  resta = numero1 - numero2;
  division = numero1 / numero2;
  
  System.out.println("La multiplicacion del los dos numeros introducidos es: " + multiplicacion); 
  System.out.println("La suma del los dos numeros introducidos es: " + suma);
  System.out.println("La resta del los dos numeros introducidos es: " + resta);
  System.out.println("La division del los dos numeros introducidos es: " + division); 
}
}

