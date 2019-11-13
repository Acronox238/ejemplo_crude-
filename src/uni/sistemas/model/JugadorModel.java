
package uni.sistemas.model;

import java.util.ArrayList;
import java.util.List;
import uni.sistemas.beans.Jugador;
import uni.sistemas.services.ICrudService;

public class JugadorModel implements ICrudService<Jugador>{
    //crear objeto del tipo colección List
    List<Jugador> alumnos=new ArrayList<>();
    static int cont;
    static{
        cont=0;
    }
    
    public void create(Alumno t) {
        cont++;
        t.setId("A00"+cont);
        alumnos.add(t); //aquí agrega el obejeto t a la colección
    }

    @Override
    public void update(Alumno t) {
        alumnos.set(Indice(t.getId()), t);
    }

    @Override
    public void delete(Alumno t) {
        alumnos.remove(Indice(t.getId()));
    }

    @Override
    public Alumno finForId(String t) {
        int p=Indice(t);
        if(p!=-1){
            return alumnos.get(p);
        }
    return null;
    }

    @Override
    public List<Alumno> readAll() {
        return alumnos;
    }
    
    //método que devuelve el índice de un elemento de la colección
    private int Indice(String id){
        int index=0;
        for (Alumno alu: alumnos){
            if(alu.getId().equals(id)){
                return index;
            }
            index++;
        }
    return -1;    
    }
}
