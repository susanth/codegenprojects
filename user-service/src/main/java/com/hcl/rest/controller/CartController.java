package com.hcl.rest.controller;import java.util.List;import unknown.CartService;import unknown.Product;
@RestController
public class CartController {
    @Autowired
    private CartService cartService;
    
    @PostMapping("/cart/total")
    public int calculateTotal(@RequestBody List<Product> products) {
        return cartService.calculateTotal(products);
    }
}