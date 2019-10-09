public class Ejercicio10 {
  public static void main(String[] args) {
    String Mb;
    System.out.print("Escribe los Mb que quieres convertir a kb: ");
    Mb = System.console().readLine();
    int kb;
    kb =  Integer.parseInt(Mb);
    
    int conversion;
    conversion = kb * 1024;
    
    System.out.printf(Mb + " Mb son " + conversion + "kb");
}
}
