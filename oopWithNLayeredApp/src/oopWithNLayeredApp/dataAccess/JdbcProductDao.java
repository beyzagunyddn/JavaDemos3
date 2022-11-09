package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//Dao Data Access Object demek.
public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır.../ SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
    //implement PorductDao demek aslında JdbcProductDao
    //bir ProductDao referansını tutar demektir ve ProductDao'nun
    //kurallarına uymak zorundadır.

}
