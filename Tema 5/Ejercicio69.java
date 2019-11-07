public class Ejercicio69 {
  public static void main(String[] args) {
    
  System.out.print("Por favor, introduzca la altura de la pirámide: ");
  int altura = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduzca el carácter de relleno: ");
  String relleno = System.console().readLine();
  
  int alturaP1;
  String espacio = " ";
  int espacios = altura +1;
  int alturaP2;
  int alturaReal;
  
    for (int i = 0; i <= altura; i++) {
      for (int j = i; j < espacios -1; j++){
      System.out.print(espacio);
      }
      
      if (!( i % 2 == 0)) {
        for (int j = 1; j < 5+2*i; j++) {
          System.out.print(relleno);
        }
      } else {
        for (int j =0; j < i; j++) {
          System.out.print(relleno);
      }
        System.out.print("    ");
        
        for ( int j=0; j < i; j++) {
          System.out.print(relleno);
      }
      } 
      System.out.println("");
    }
  
  }
}
