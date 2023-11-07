package com.poo.exhibitor.strategy;

import com.poo.exhibitor.model.ProductModel;
import com.poo.exhibitor.service.ProductService;

import java.util.List;

public class MyAdsSearchStrategy implements AdsSearchStrategy {
    private ProductService productService;

    public MyAdsSearchStrategy(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public List<ProductModel> searchAds(Long userId) {
        return productService.getMyAdsList(userId);
    }
}
