public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.print("Introduce un numero de la semana: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    String dia;
    
      switch (numero) {
    
      case 1:
      dia = "Lunes";
      break;
    
      case 2:
      dia = "Martes";
      break;
      
      case 3:
      dia = "Miercoles";
      break;
      
      case 4:
      dia = "Jueves";
      break;
      
      case 5:
      dia = "Viernes";
      break;
      
      case 6:
      dia = "Sabado";
      break;
      
      case 7:
      dia = "Domingo";
      break;
      
      default:
      dia = "No existe ese dia";
    }
    System.out.println("Dia " + numero + ": " + dia);

  }
}
