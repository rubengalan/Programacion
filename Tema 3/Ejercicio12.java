public class Ejercicio12 {
  public static void main(String[] args) {
    String nota1;
    System.out.print("Escribe la nota del primer examen: ") ;
    nota1 = System.console().readLine();
    double notaexam1; 
    notaexam1 = Double.parseDouble(nota1);
    
    String deseo;
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    deseo = System.console().readLine();
    double notafinal;
    notafinal = Double.parseDouble(deseo);
    
    double nota2;
    nota2 = ((notafinal * 100) - (notaexam1 * 40)) /60 ;
    
    System.out.print("Para poder sacar un " + notafinal + " tienes que sacar en el segundo examen un " + (float)nota2);
} 
}