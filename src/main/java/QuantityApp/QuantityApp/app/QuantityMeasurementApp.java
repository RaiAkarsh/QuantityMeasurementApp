package QuantityApp.QuantityApp.app;

import QuantityApp.QuantityApp.controller.QuantityMeasurementController;
import QuantityApp.QuantityApp.dto.QuantityDTO;
import QuantityApp.QuantityApp.repository.QuantityMeasurementDatabaseRepository;
import QuantityApp.QuantityApp.repository.IQuantityMeasurementRepository;
import QuantityApp.QuantityApp.service.QuantityMeasurementServiceImpl;


public class QuantityMeasurementApp {

    public static void main(String[] args) {

        IQuantityMeasurementRepository repository =
                new QuantityMeasurementDatabaseRepository();

        QuantityMeasurementController controller =
                new QuantityMeasurementController(
                        new QuantityMeasurementServiceImpl(repository)
                );

        QuantityDTO q1 = new QuantityDTO(1,"FEET","LENGTH");
        QuantityDTO q2 = new QuantityDTO(12,"INCHES","LENGTH");

        controller.compare(q1,q2);
        controller.add(q1,q2);
        controller.convert(q1,"INCHES");
    }
}