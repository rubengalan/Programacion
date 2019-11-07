public class Ejercicio7 {
  public static void main(String[] args) {
    
    int numero;
    int contador = 0;
    
    for (int i = 0; i < 15; i++) {
      numero = (int)(Math.random()*3);
      
      switch (numero) {
        case 0:
        System.out.println("El partido " + (contador+1) + " gana el equipo 1");
        break;
        case 1:
        System.out.println("El partido " + (contador+1) + " empate");
        break;
        case 2:
        System.out.println("El partido " + (contador+1) + " gana el equipo 2");
        break;
        default:
      }
      contador++; 
    }    
  }
}
