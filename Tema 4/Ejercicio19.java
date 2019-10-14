public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    int cantidad = 0;
    
    if ((numero <10) {
      cantidad = 1;
     }
    if (( numero >= 10 ) && ( numero < 100 )) {
      cantidad = 2;
    }
    if (( numero >= 100 ) && ( numero < 1000 )) {
      cantidad = 3; 
    }
    if (( numero >= 1000 ) && ( numero < 10000 )) { 
      cantidad = 4;
    }
    if ( numero >= 10000 ) { 
      cantidad = 5;
    }
    System.out.print("El numero introducido tiene " + cantidad + " digitos");
    
  }
}
