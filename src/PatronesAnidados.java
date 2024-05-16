import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        int seleccion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("======= Menú =======\n[1] mostrar Patrón Anidado A\n[2] mostrar Patrón Anidado B\n[3] mostrar Patrón Anidado C\n[4] mostrar Patrón Anidado D\n[0] salir\n\n<- Selecciona una opción ->");
            try {
                seleccion = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número.");
                seleccion = -1;
                continue;
            }

            if (seleccion == 0) {
                System.out.println("Adios");
                break;
            }

            System.out.println("Ingrese un número:");
            int n = Integer.parseInt(entrada.nextLine());

            switch (seleccion){
                case 1: patronA(n);
                    break;
                case 2: patronB(n);
                    break;
                case 3: patronC(n);
                    break;
                case 4: patronD(n);
                    break;
                default:
                    System.out.println("Error, ingrese una opcion valida de las que se muestran: [1] [2] [3] [4] [0]");
                    break;
            }

        } while (seleccion != 0);
    }

    public static void patronA(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf((i == 0 || i == n - 1 || j == 0 || j == n - 1) ? "*  " : "   ");
            }
            System.out.println();
        }
        System.out.printf("\n");
    }

    public static void patronB(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == 0 || i == n - 1 || i + j == n - 1) ? "* " : "  ");
            }
            System.out.println();
        }
        System.out.printf("\n");
    }

    public static void patronC(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == j || i + j == n - 1) ? "x " : "  ");
            }
            System.out.println();
        }
        System.out.printf("\n");
    }

    public static void patronD(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(n == 2 && i == 1 && j == 0){
                    System.out.print("  ");
                }
                else if ((i == 0 && j < n - 2) || (j > 0 && j < n -2) || j == n - 2 || i == n -1 && j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf("\n");
    }
}
