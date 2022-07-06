package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    /*
     * Um repositório é um mecanismo para encapsular armazenamento
     * , recuperação e comportamento de pesquisa que emula uma coleção de objetos.
     */
}
