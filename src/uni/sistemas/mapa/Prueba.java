
package uni.sistemas.mapa;

import java.util.HashMap;
import java.util.Map;

public class Prueba {
    public static void main(String[] args) {
        //crear objeto de tipo map
        Map<String, String> mapa=new HashMap<>();
        //agregar elementos a la colección map
        mapa.put("jose", "José Fernandez");
        mapa.put("luis", "Luis Flores");
        mapa.put("karla", "Karla García");
        mapa.put("raul", "Raúl Gonzales");
        //listar
        System.out.println("Lista de Personas");
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clave: "+key+" -- Valor: "+value);
        }
    }
    
}
