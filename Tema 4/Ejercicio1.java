public class Ejercicio1 {
  public static void main(String[] args){
    String dia;
    System.out.print("Que dia quieres saber que tienes a primera hora: ");
    dia = System.console().readLine();
    
    if ("lunes".equals(dia)) {
       System.out.println("Entorno de desarrollo");
        } else {
           if ("martes".equals(dia)) {
              System.out.println("Programacion"); 
              } else {
                 if ("miercoles".equals(dia)) {
                    System.out.println("programacion"); 
                    } else {
                      if ("jueves".equals(dia)) {
                        System.out.println("PRogramacion"); 
                        } else { System.out.println("FOL"); }
                 
                 }
               }
             }
}
}
