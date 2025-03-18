import java.util.Scanner;

public class Portafolio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n\n");
            System.out.println("Bienvenidos a mi jose java [jose Versión 1.0]");


          System.out.println(" _                ");
          System.out.println("    | | ___  ___  ___ ");
          System.out.println(" _  | |/ _ \\/ __|/ _ \\");
          System.out.println("| |_| | (_) \\__ \\  __/");
          System.out.println(" \\___/ \\___/|___/\\___|");
          System.out.println("");

          System.out.println("[?] Selecciona una opcion para continuar");
          System.out.println("Proyecto Iniciado --->> Mar 18 8:25 am 2025");
          System.out.println("");



            //Menu
            System.out.println("[1] La suma de dos Numeros");
            System.out.println( "[2] ");
            System.out.println("[3] ");
            System.out.println( "[0] Salir ");
            System.out.print("[?] :");

            opcion = scanner.nextInt();
          
            //Opciones

            switch (opcion) {
                case 1:
                
                System.out.println("<---------------------------->");
                System.out.println("[1] Numero 1: ");
                int n1 = scanner.nextInt();

                System.out.println("[2] Numero 1: ");
                int n2 = scanner.nextInt();

                double Suma= n1+n2;
                System.out.println("| [ Resultado ]: " + Suma);


            
    
                    
                    
                    break;
            
                default:
                    break;
            }
        } while (opcion != 0 );
    }
    
}
