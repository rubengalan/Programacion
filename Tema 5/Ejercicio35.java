public class Ejercicio35 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int huecosMedios;
    
    //Espacios por delante
    
    huecosMedios = altura-2;
    
    for (int i = 0; i < altura/2;i++){
      for (int j = 0; j < i; j++){
        System.out.print(" ");
      }
      //Pinta el relleno
      
      System.out.print(relleno);
      
        for (int j=0; j < huecosMedios; j++) {
          System.out.print(" ");
        }
        huecosMedios-=2;
        System.out.println(relleno);
    }
    
    for (int i=0; i<altura/2; i++) {
      System.out.print(" ");
    }
    
    //pintar *
    
    System.out.println(relleno);

    huecosMedios = 1;
    
    for (int i = altura/2-1; i >= 0 ;i--){
      for (int j = 0; j < i; j++){
        System.out.print(" ");
      }
      //Pinta el relleno
      
      System.out.print(relleno);
      
      for (int j=0; j < huecosMedios; j++) {
        System.out.print(" ");
      }
      System.out.println(relleno);
      huecosMedios+=2;
    }
  }
}
