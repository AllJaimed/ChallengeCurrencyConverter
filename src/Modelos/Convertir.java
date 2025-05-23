package Modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Convertir {

    public MonedaAPI convertirJSON(String data){

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).setPrettyPrinting().create();
        MonedaAPI monedaAPI = gson.fromJson(data, MonedaAPI.class);
        return monedaAPI;
    }
}
