package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it represents a shipped item that has all the core properties of a product.
// A ShoppingCart HAS-A Product (it contains them), so it would NOT extend Product.
public class PhysicalProduct extends Products {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}