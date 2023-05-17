package com.hcl.rest.service;import java.security.Provider.Service;import java.util.List;import unknown.CartService;import unknown.Product;
@Service
public class CartServiceImpl implements CartService {
    private static final int SHIPPING_FEE = 60;
    
    @Override
    public int calculateTotal(List<Product> products) {
        int total = 0;
        for (Product product : products) {
            total += product.getUnitPrice() * product.getMaxPurchase();
        }
        total += SHIPPING_FEE;
        return total;
    }
}