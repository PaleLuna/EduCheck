package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseStatus;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.ResponseStatusService;


@Controller
@RequestMapping("/v1/resp_status")
public class ResponseStatusController extends UnitController<ResponseStatus> {
    public ResponseStatusController(ResponseStatusService _service) {
        super(_service);
    }
}
