package com.example.springdocdemo.controller;

import com.example.springdocdemo.model.Product;
import com.example.springdocdemo.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@Tag(name = "商品管理", description = "商品列表及详情接口")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "查询所有商品", description = "返回系统中所有商品的列表")
    public List<Product> listProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "根据 ID 查询商品详情", description = "如果商品不存在，返回 404")
    public Product getProduct(@PathVariable Long id) {
        return service.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "商品未找到"));
    }
}
