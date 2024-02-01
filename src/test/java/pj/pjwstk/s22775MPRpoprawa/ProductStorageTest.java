package pj.pjwstk.s22775MPRpoprawa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductStorageTest {

    @Test
    void getProducts() {
        ProductStorage productStorage = new ProductStorage();
        Products products = new Products("beer", 10);
        productStorage.addProducts(products);

        assertEquals(products, productStorage.getProducts("beer"));
    }
}