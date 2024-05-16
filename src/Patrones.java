import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        int seleccion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("======= Menú =======\n[1] mostrar Patrón A\n[2] mostrar Patrón B\n[3] mostrar Patrón C\n[0] salir\n\n<- Selecciona una opción ->");
            seleccion = entrada.hasNextInt() ? entrada.nextInt() : -1;
            entrada.nextLine(); // consume newline

            if (seleccion == 0) {
                System.out.println("Adios");
                break;
            }

            System.out.println("Ingrese un número:");
            int n = entrada.hasNextInt() ? entrada.nextInt() : 0;
            entrada.nextLine(); // consume newline

            switch (seleccion){
                case 1: patronA(n);
                    break;
                case 2: patronB(n);
                    break;
                case 3: patronC(n);
                    break;
                default:
                    System.out.println("Error, ingrese una opcion valida de las que se muestran: [1] [2] [3] [0]");
                    break;
            }

        } while (seleccion != 0);
    }

    public static void patronA(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(i % 2 == 0 ? "*" : ".");
        }
        System.out.println();
    }

    public static void patronB(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("1234");
        }
        System.out.println();
    }

    public static void patronC(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(i % 2 == 0 ? "||" : "*");
        }
        System.out.println();
    }
}
