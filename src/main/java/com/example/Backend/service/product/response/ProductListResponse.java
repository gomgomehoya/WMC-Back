package com.example.Backend.service.product.response;

import com.example.Backend.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductListResponse {
    private Long productId;
    private String name;
    private String description;
    private Integer stock;
    private Integer price;
    private String firstPhoto;

    public ProductListResponse(Product product) {
        this.productId = product.getProductId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.stock = product.getStock();
        this.price = product.getPrice();
        this.firstPhoto = product.getImageDataList().get(0).getImageData();
    }
}
