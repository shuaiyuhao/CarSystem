package carSystem.service;

import carSystem.Model.DriverFormEntity;
import carSystem.Model.PassengerFormEntity;

import java.util.List;

public class messageServicelmpl implements messageService {
    private List<PassengerFormEntity> passengerFormEntities;
    private List<DriverFormEntity> driverFormEntities;
    @Override
    public List<PassengerFormEntity> getAllPassengerFormEntities() {
        return passengerFormEntities;
    }

    @Override
    public List<DriverFormEntity> getAllDriverFormEntities() {
        return driverFormEntities;
    }
}
