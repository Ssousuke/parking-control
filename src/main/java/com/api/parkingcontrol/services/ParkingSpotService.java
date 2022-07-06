package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    /*
     * O componente de Service de inicialização Spring é definido como um arquivo de classe
     * que inclui a anotação @Service e permite que os desenvolvedores adicionem funcionalidades
     * de negócios . A anotação é usada com as classes que fornecem essas funcionalidades de negócios.
     */

    final
    ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
