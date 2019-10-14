public class Ejercicio20 {
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    /**Introducimos boolean porque solo sera o verdadero o falso **/
    boolean capicua = false;
    
    if (numero < 10) {
      capicua = true;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true; 
        } 
      }
    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true; 
      } 
        }
    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        capicua = true; 
        } 
      }
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true; 
        } 
      }
    
    if (capicua) {
      System.out.println("El número introducido es capicúo."); 
      } else { 
        System.out.println("El número introducido no es capicúo.");
      }
  }
}
