package QuantityApp.QuantityApp.controller;

import QuantityApp.QuantityApp.dto.QuantityDTO;
import QuantityApp.QuantityApp.service.IQuantityMeasurementService;

public class QuantityMeasurementController {

    private IQuantityMeasurementService service;

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    public void compare(QuantityDTO a, QuantityDTO b) {
        System.out.println(service.compare(a,b));
    }

    public void add(QuantityDTO a, QuantityDTO b) {
        QuantityDTO result = service.add(a,b);
        System.out.println(result.getValue()+" "+result.getUnit());
    }

    public void convert(QuantityDTO a, String target) {
        QuantityDTO result = service.convert(a,target);
        System.out.println(result.getValue()+" "+result.getUnit());
    }
}
