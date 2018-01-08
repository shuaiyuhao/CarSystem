package carSystem.service;
import carSystem.Model.*;

import java.util.List;

public interface messageService {

//    static List<PassengerFormEntity> getAllPassengerFormEntities(){
//        return getAllPassengerFormEntities();
//    }

    List<PassengerFormEntity> getAllPassengerFormEntities();

    List<DriverFormEntity> getAllDriverFormEntities();
}
