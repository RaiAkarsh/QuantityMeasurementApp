package QuantityApp.QuantityApp.repository;

import QuantityApp.QuantityApp.model.QuantityMeasurementEntity;
import java.util.List;

public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);
    List<QuantityMeasurementEntity> findAll();
}
