package com.kodilla.ecommercee;

import com.kodilla.ecommercee.product.ProductDto;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

    @PostMapping(value = "createNewCart")
    public void createNewCart() {

    }

    @GetMapping(value = "getProducts")
    public List<ProductDto> getProducts() {
        return new ArrayList<>();
    }

    @PutMapping(value = "addToCart")
    public void addProductToCart(@RequestParam Long cartId, @RequestParam Long productId) {

    }

    @DeleteMapping(value = "deleteProduct")
    public void deleteProduct(@RequestParam Long productId) {

    }

    @PostMapping(value = "createOrder")
    public void createOrder(@RequestBody CartDto cartDto) {

    }
}