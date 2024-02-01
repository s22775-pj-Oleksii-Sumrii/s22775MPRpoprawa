package pj.pjwstk.s22775MPRpoprawa;

import java.util.ArrayList;
import java.util.List;

public class ProductStorage {
    public List<Products> productsList = new ArrayList<>();

    public List<Products> getProductsList(){
        return productsList;
    }

    public void addProducts(Products products){
        productsList.add(products);
    }

    public void getRemoveProducts(Products products){
        productsList.remove(products);
    }

    public Products findByProducts (String name){
        for(Products products : productsList){
            if(products.getName().equals(name)){
                return products;
            }
        }
        return null;
    }
}
