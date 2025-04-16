package rajam.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rajam.sushi.modal.Product;
import rajam.sushi.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired // here this annotation is not compulsory as is by default in constructor injection
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return  productService.getAllProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void postProduct(@RequestBody Product pro){
        productService.postProduct(pro);
    }


}
