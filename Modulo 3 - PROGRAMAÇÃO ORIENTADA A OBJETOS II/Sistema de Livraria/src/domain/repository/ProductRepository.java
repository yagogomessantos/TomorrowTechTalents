package domain.repository;

import domain.model.Product;

import java.util.List;

public interface ProductRepository <T extends Product>{

    List<T> list();
    T findById(String id);
    void save(T t);
    void remove(String id);
    void update(String id,T t);


}
