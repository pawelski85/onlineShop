package com.kodilla.ecommercee.mapper;

import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.dto.CartDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CartMapper {
    public Cart mapToCart(final CartDto cartDto){
        return  new Cart(cartDto.getId(),cartDto.getUser(),cartDto.getProducts());
    }

    public CartDto mapToCartDto(Cart cart){
        return new CartDto(cart.getId(),cart.getUser(),cart.getProducts());
    }

    public List<Cart>cartToList(final List<CartDto>cartDtoList){
        return cartDtoList.stream().map(this::mapToCart).collect(Collectors.toList());
    }

    public List<CartDto>cartDtoList(final List<Cart>cartToList){
        return cartToList.stream().map(this::mapToCartDto).collect(Collectors.toList());
    }
}
