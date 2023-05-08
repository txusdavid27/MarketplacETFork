package com.javeriana.servidorsoap.repository;


import java.util.HashMap;
import java.util.Map;

import com.proyecto.ecoturist.servicio.Servicio;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
@Component
public class ServiceRepository {
    private static final Map<Long, Servicio> services = new HashMap<>();
    @PostConstruct
    public void initData() {
        Servicio service = new Servicio();
        service.setId(2);
        service.setDescripcion("delicioso arroz con pollo");
        service.setDisponibilidad(true);
        service.setNombre("arroz con pollo");
        service.setPrecio(20000);
        service.setStock(12);
        services.put(service.getId(), service);
        Servicio service1 = new Servicio();
        service1.setId(5);
        service1.setDescripcion("servicio alojamiento familiar");
        service1.setDisponibilidad(true);
        service1.setNombre("alojamiento");
        service1.setPrecio(250000);
        service1.setStock(5);
    }
    public Servicio findServiceById(Long id) {
        return services.get(id);
    }
}
