public class Ejercicio7 {
  public static void main(String[] args) {
    
    String factura;
    System.out.print("Escriba el precio del producto 1: ");
    factura = System.console().readLine();
    float producto1;
    producto1 = Integer.parseInt(factura);
    String iva;
    System.out.print("Escriba el iva del producto: ");
    iva = System.console().readLine();
    int iva1;
    iva1 = Integer.parseInt(iva);
    float precio1;
    float total1;
    precio1 = (producto1 * iva1)/100;
    total1 = producto1 + precio1;
    System.out.println("El precio total del producto 1 es: " + total1 + " €");
    
    System.out.print("Escriba el precio del producto 2: ");
    factura = System.console().readLine();
    float producto2;
    producto2 = Integer.parseInt(factura);
    System.out.print("Escriba el iva del producto: ");
    iva = System.console().readLine();
    int iva2;
    iva2 = Integer.parseInt(iva);
    float precio2;
    float total2;
    precio2 = (producto2 * iva2)/100;
    total2 = producto2 + precio2;
    System.out.println("El precio total del producto 2 es: " + total2 + " €");
    
    System.out.print("Escriba el precio del producto 3: ");
    factura = System.console().readLine();
    float producto3;
    producto3 = Integer.parseInt(factura);
    System.out.print("Escriba el iva del producto: ");
    iva = System.console().readLine();
    int iva3;
    iva3 = Integer.parseInt(iva);
    float precio3;
    float total3;
    precio3 = (producto3 * iva3)/100;
    total3 = producto3 + precio3;
    float facturatotal;
    facturatotal = total1 + total2 + total3;
    System.out.println("El precio total del producto 3 es: " + total3 + " €");
    System.out.println("---------------------------------------");
    System.out.printf("El total de la factura es %.2f €: ", facturatotal);
}
}
