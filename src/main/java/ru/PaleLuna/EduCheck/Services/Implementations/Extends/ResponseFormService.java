package ru.PaleLuna.EduCheck.Services.Implementations.Extends;

import org.springframework.stereotype.Service;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Repositories.Implementations.Extends.InMemoryResponseFormDAO;
import ru.PaleLuna.EduCheck.Services.Implementations.ServiceUnit;

@Service
public class ResponseFormService extends ServiceUnit<ResponseForm> {
    public ResponseFormService(InMemoryResponseFormDAO _repos) {
        super(_repos);
    }
}