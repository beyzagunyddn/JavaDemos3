package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
    //interfaceler sadece method imzasını taşıyabilir.
    //void add(Product product) gibi bir imza.
    void add(Product product);
}
