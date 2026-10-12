package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private productService productService;
    @GetMapping
    public List<Products>getAllproducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Products getById(@PathVariable Long id) {
        return new Products(id, "Laptop", 999.99);
    }
}
