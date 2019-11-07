public class Ejercicio11 {
  public static void main(String[] args) {
    
    int notas;
    int contador = 0;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for (int i = 0; i < 20; i++) {
      
      notas = (int)(Math.random()*10);
      
      switch (notas) {
        
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        System.out.println("La nota del examen " + (contador+1) + " y esta suspenso");
        suspenso++;
        break;
        case 5:
        System.out.println("La nota del examen " + (contador+1) + " y esta suficiente");
        suficiente++;
        break;
        case 6:
        System.out.println("La nota del examen " + (contador+1) + " y esta bien");
        bien++;
        break;
        case 7:
        case 8:
        System.out.println("La nota del examen " + (contador+1) + " y esta notable");
        notable++;
        break;
        case 9:
        case 10:
        System.out.println("La nota del examen " + (contador+1) + " y esta sobresaliente");
        sobresaliente++;
        break;
        default:
      }
      contador++;
    }
    
    System.out.println("");
    System.out.println("La cantidad de examenes suspensos son: " + suspenso);
    System.out.println("La cantidad de examenes suficientes son: " + suficiente);
    System.out.println("La cantidad de examenes bien son: " + bien);
    System.out.println("La cantidad de examenes notables son: " + notable);
    System.out.println("La cantidad de examenes sobresalientes son: " + sobresaliente);
    
  }
}
