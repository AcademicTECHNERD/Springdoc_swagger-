package com.example.springdocdemo.service;

import com.example.springdocdemo.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
//import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class ProductService {
    private final Map<Long, Product> store = new LinkedHashMap<>();

    @PostConstruct
    public void initData() {
        store.put(1L, new Product(1L, "iPhone 14", "Apple 最新款手机", 7999.99));
        store.put(2L, new Product(2L, "MacBook Pro", "Apple 16 英寸笔记本", 19999.0));
        store.put(3L, new Product(3L, "AirPods Pro", "Apple 主动降噪耳机", 1999.0));
    }

    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
