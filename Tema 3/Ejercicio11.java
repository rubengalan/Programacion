public class Ejercicio11 {
  public static void main(String[] args) {
    String kb;
    System.out.print("Escribe los kb que quieres convertir a Mb: ");
    kb = System.console().readLine();
    double Mb;
    Mb =  Integer.parseInt(kb);
    
    double conversion;
    conversion = Mb / 1024;
    
    System.out.print(kb + " kb son " + conversion + " Mb");
}
}
