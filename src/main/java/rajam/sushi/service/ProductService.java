package rajam.sushi.service;

import org.springframework.stereotype.Component;
import rajam.sushi.modal.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {

//    List<Product> products =  new List<Product>(new Product("nina",1,10));
    List<Product> products = new ArrayList<Product>(
            Arrays.asList(
                new Product("ito",2,10000),
                new Product("nina",1,10)
            )
);

    public List<Product> getAllProducts(){
        return  products;
    }

    public void postProduct(Product pro){
        products.add(pro);
    }

    public Product getProductById(int prodId) {
        for (Product product : products) {
            if (product.getId() == prodId) {
                return product;
            }
        }

//        for (int i = 0; i <products.size() ; i++) {
//            Product product = products.get(i);
//            if (product.getId()== prodId){
//                return product;
//            }
//        }

        return null;
    }
}
