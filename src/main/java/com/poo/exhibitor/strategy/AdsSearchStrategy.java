package com.poo.exhibitor.strategy;
import com.poo.exhibitor.model.ProductModel;
import java.util.List;

public interface AdsSearchStrategy {
	
    List<ProductModel> searchAds(Long userId);
}
