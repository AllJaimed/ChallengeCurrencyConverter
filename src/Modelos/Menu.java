package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public void menu(){

        List<String> listaMonedas = new ArrayList<>();


        listaMonedas.addAll(List.of("Dólar americano [USD]", "Euro [EUR]", "Libra esterlina [GBP]", "Yen japonés [JPY]", "Yuan chino [CNY]", "Peso argentino [ARS]", "Peso colombiano [COP]", "Peso mexicano [MXN]" , "Real brasileño [BRL]"));
        System.out.println("\n");
        System.out.println("*".repeat(50)+ "\n");
        System.out.println("Bienvenido a la aplicación de cambio de divisas \uD83D\uDCB5");
        System.out.println("\nPrincipales monedas del mercado:");
        for (String item: listaMonedas){
            System.out.println(item);
        }
        System.out.println("\n\nLa aplicación usa el código de moneda de tres letras ISO 4217, por ejemplo, USD para dólares americano.\n\n");
    }
}
