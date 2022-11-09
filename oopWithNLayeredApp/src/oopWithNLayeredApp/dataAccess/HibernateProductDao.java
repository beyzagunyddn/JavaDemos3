package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır.../ SQL
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    //implement PorductDao demek aslında JdbcProductDao
    //bir ProductDao referansını tutar demektir ve ProductDao'nun
    //kurallarına uymak zorundadır.
}
