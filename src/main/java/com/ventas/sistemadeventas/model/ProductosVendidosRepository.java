package com.ventas.sistemadeventas.model;

import com.ventas.sistemadeventas.entitys.ProductoVendido;
import org.springframework.data.repository.CrudRepository;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}
