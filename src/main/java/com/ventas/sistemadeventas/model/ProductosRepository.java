package com.ventas.sistemadeventas.model;

import com.ventas.sistemadeventas.entitys.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
