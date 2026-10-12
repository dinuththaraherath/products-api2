package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private productService productService;
    @GetMapping
    public List<Products>getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getById(@PathVariable Long id) {
        return new Products(id, "Laptop", 999.99);
    }
    @PostMapping
    public Products addProduct(@RequestBody Products Products){
        return productService.addProduct(Products);
    }
    @DeleteMapping("/{id}")
    public void deleteProductsById(@PathVariable Long id){
      productService.deleteById(id);
    }
    @GetMapping("/search")
    public List<Products>search(String name){

    }
}
