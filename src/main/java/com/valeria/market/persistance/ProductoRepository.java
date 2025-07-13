package com.valeria.market.persistance;

import com.valeria.market.persistance.crud.ProductoCrudRepository;
import com.valeria.market.persistance.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
