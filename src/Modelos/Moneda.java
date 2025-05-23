package Modelos;

public class Moneda {
    private String monedaBase;
    private String monedaCambio;
    private double valor;
    private double valorDivisar;
    private String result;
    private String fecha;


    public Moneda(String monedaBase, String monedaCambio, MonedaAPI monedaAPI, double valorDivisar){
        this.valor = monedaAPI.conversion_rate();
        this.result = monedaAPI.result();
        this.fecha = monedaAPI.time_last_update_utc();
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.valorDivisar = valorDivisar;
    }

    @Override
    public String toString() {

        if (result.contentEquals("error")){
            return "Código de divisa no existente!";
        }
        System.out.println("\nEl valor " + valorDivisar + "[" + monedaBase + "] corresponde al valor final de ===> " + (valor*valorDivisar) + "["+ monedaCambio + "]");
        return "Fecha y hora de la última actualización: " + fecha;
    }
}
