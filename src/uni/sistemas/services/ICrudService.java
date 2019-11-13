package uni.sistemas.services;

import java.util.List;
//interface genérica
public interface ICrudService<T> {

    //definir las firmas
    void create(T t);

    void update(T t);

    void delete(T t);

    T finForId(String t);

    List<T> readAll();
}
