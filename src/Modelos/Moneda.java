package Modelos;

import netscape.javascript.JSObject;

public class Moneda {
    private String monedaBase;
    private String monedaCambio;
    private double valor;
    private double valorDivisar;
    private String result;

    public Moneda(String monedaBase, String monedaCambio, MonedaAPI monedaAPI, double valorDivisar){
        this.valor = monedaAPI.conversion_rate();
        this.result = monedaAPI.result();
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.valorDivisar = valorDivisar;
    }

    @Override
    public String toString() {

        if (result.contentEquals("error")){
            return "Código de divisa no existente!";
        }
        return "El valor " + valorDivisar + "[" + monedaBase + "] corresponde al valor final de ===> " + (valor*valorDivisar) + "["+ monedaCambio + "]";
    }
}
