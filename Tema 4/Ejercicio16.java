public class Ejercicio16 {
  public static void main(String[] args) {

    int punto  = 0;

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    String pre1 = System.console().readLine();
    System.out.print("2. Ha aumentado sus gastos de vestuario: ");
    String pre2 = System.console().readLine();
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: ");
    String pre3 = System.console().readLine();
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia(si es mujer): ");
    String pre4 = System.console().readLine();
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil: ");
    String pre5 = System.console().readLine();
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    String pre6 = System.console().readLine();
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    String pre7 = System.console().readLine();
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
    String pre8 = System.console().readLine();
    System.out.print("9. Has notado que últimamente se perfuma más: ");
    String pre9 = System.console().readLine();
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    String pre10 = System.console().readLine();
    
    
    if (pre1.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre2.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre3.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre4.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre5.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre6.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre7.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre8.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre9.equals("Verdadero")){
      punto = punto + 3;
    }
    if (pre10.equals("Verdadero")){
      punto = punto + 3;
    }
    System.out.println("Tu puntuacion es: " + punto);
  }
}
