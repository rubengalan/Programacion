public class Ejercicio6 {
  public static void main(String[] args) {
  String figura;
  System.out.print("Escribe los cm de la base: ");
  figura = System.console().readLine();
  int base;
  base =  Integer.parseInt(figura);
  
  System.out.print("Escribe los cm de la altura: ");
  figura = System.console().readLine();
  int altura;
  altura =  Integer.parseInt(figura);
  int area;
  area = (base * altura)/2;
  
  System.out.print("El area de este triangulo es: " + area + " cm cuadrados"); 

}
}
