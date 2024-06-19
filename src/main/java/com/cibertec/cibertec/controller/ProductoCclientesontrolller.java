package com.cibertec.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.cibertec.entity.Producto;
import com.cibertec.cibertec.service.ProductoService;

@RestController
@RequestMapping("/url/productos")
public class ProductoCclientesontrolller {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/listaTodos")
    public List<Producto> getAllClientes() {
        return productoService.listaProducto();
    }
}
