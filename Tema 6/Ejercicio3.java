public class Ejercicio3 {
  public static void main(String[] args) {
    
    int palos;
    int cartaPalo;
    
    palos = (int)(Math.random()*4+1);
    cartaPalo = (int)(Math.random()*10+1);
    
    switch (palos) {
      
      case 1:
        System.out.print("La carta es espadas");
        break;
      case 2:
        System.out.print("La carta es bastos");
        break;
      case 3:
        System.out.print("La carta es de copas");
        break;
      case 4:
        System.out.print("La carta es de oros");
        break;
      default:
    }
    
    switch (cartaPalo) {
      
      case 1:
        System.out.print(" y es el As");
        break;
      case 2:
        System.out.print(" y es el 2");
        break;
      case 3:
        System.out.print(" y es el 3");
        break;
      case 4:
        System.out.print(" y es el 4");
        break;
      case 5:
        System.out.print(" y es el 5");
        break;
      case 6:
        System.out.print(" y es el 6");
        break;
      case 7:
        System.out.print(" y es el 7");
        break;
      case 8:
        System.out.print(" y es la Sota");
        break;
        case 9:
        System.out.print(" y es el Caballo");
        break;
      case 10:
        System.out.print(" y es el Rey");
        break;
      default:
    }
  }
}
