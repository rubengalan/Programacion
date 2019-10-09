public class Ejercicio9 {
  public static void main(String[] args) {
  String figura;
  System.out.print("Escribe los cm del radio: ");
  figura = System.console().readLine();
  int radio;
  radio =  Integer.parseInt(figura);
  double radios;
  radios = (Math.pow(radio,2));
  
  System.out.print("Escribe los cm de la altura: ");
  figura = System.console().readLine();
  int altura;
  altura =  Integer.parseInt(figura);
  
  double area;
  area = 0.3 * 3.14 * (radios) * (altura);
  
  System.out.print("El area de este cono es: " + area); 

}
}
