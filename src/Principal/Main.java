package Principal;

import Conexion.Conexion;
import Modelos.Convertir;
import Modelos.Menu;
import Modelos.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        Convertir convertir = new Convertir();
        Menu menu = new Menu();
        Scanner teclado = new Scanner(System.in);

        while(true){
            menu.menu();
            System.out.println("Ingrese el código de moneda base: ");
            String monedaBase = teclado.nextLine().toUpperCase();
            monedaBase = monedaBase.length() >= 3 ? monedaBase.substring(0, 3) : monedaBase;
            System.out.println("Ingrese el código de moneda a divisar: ");
            String monedaDevisar = teclado.nextLine().toUpperCase();
            monedaDevisar = monedaDevisar.length() >= 3 ? monedaDevisar.substring(0,3) : monedaDevisar;
            System.out.println("Valor a divisar");
            double valorDivisar = teclado.nextDouble();
            Moneda miMoneda = new Moneda(monedaBase, monedaDevisar,convertir.convertirJSON(conexion.conexion("https://v6.exchangerate-api.com/v6/bd76c6d371f6bc69b4fb62f8/pair/"+monedaBase+"/"+monedaDevisar)), valorDivisar);
            System.out.println(miMoneda);
            System.out.println("\n0. Para salir\nCualquier letra para continuar.\n");
            if(teclado.nextInt() == 0){
                System.out.println("Gracias por usar la aplicación! :]");
                break;
            }
        }
    }
}