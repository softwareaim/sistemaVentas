package com.ventas.sistemadeventas.model;

import com.ventas.sistemadeventas.entitys.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
