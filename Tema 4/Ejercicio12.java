public class Ejercicio12 {
  public static void main(String[] args) {
    
    int punto = 0;
    
    System.out.print("1. Cual es la capital de España: \n Madrid \n Barcelona \n Malaga \n Sevilla \n --------- \n");
    String pre1 = System.console().readLine();
    System.out.print("2. Cual es la capital de Francia: \n Lille \n Toulose \n Paris \n Marsella \n ----------- \n");
    String pre2 = System.console().readLine();
    System.out.print("3. Cual es la capital de Alemania: \n Zurich \n Berlin \n Frankfurt \n ----------- \n");
    String pre3 = System.console().readLine();
    System.out.print("4. Cual es la capital de Italia: \n Roma \n Venecia \n Milan \n ----------- \n");
    String pre4 = System.console().readLine();
    System.out.print("5. Cual es la capital de Andalucia: \n Malaga \n Sevilla \n Jaen \n Granada \n ----------- \n");
    String pre5 = System.console().readLine();
    System.out.print("6. Cual es la capital de la Comunidad Valenciana: \n Valencia \n Alicante \n Castellon \n ----------- \n");
    String pre6 = System.console().readLine();
    System.out.print("7. Cual es la capital de Cataluña: \n Barcelona \n Girona \n Lleida \n Tarragona \n ----------- \n");
    String pre7 = System.console().readLine();
    System.out.print("8. Cual es la capital de Murcia: \n Murcia \n Ninguna \n ----------- \n");
    String pre8 = System.console().readLine();
    System.out.print("9. Cual de estos es un color primario: \n rojo \n lila \n naranja \n ----------- \n");
    String pre9 = System.console().readLine();
    System.out.print("10. Cual corre mas: \n coche \n moto \n ave \n ----------- \n");
    String pre10 = System.console().readLine();
    
    
    if (pre1.equals("Madrid")){
      punto++;
    }
    if (pre2.equals("Paris")){
      punto++;
    }
    if (pre3.equals("Berlin")){
      punto++;
    }
    if (pre4.equals("Roma")){
      punto++;
    }
    if (pre5.equals("Sevilla")){
      punto++;
    }
    if (pre6.equals("Valencia")){
      punto++;
    }
    if (pre7.equals("Barcelona")){
      punto++;
    }
    if (pre8.equals("Murcia")){
      punto++;
    }
    if (pre9.equals("rojo")){
      punto++;
    }
    if (pre10.equals("ave")){
      punto++;
    }
    System.out.println("Tu puntuacion es: " + punto);
  }
}
