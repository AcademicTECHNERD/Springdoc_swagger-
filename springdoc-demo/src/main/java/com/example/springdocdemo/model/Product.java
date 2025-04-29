package com.example.springdocdemo.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "商品实体")
public class Product {
    @Schema(description = "商品ID", example = "1")
    private Long id;

    @Schema(description = "商品名称", example = "iPhone 14")
    private String name;

    @Schema(description = "商品描述", example = "Apple 最新款手机")
    private String description;

    @Schema(description = "商品价格（元）", example = "7999.99")
    private Double price;

    // 构造器、Getter/Setter

    public Product() { }

    public Product(Long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
