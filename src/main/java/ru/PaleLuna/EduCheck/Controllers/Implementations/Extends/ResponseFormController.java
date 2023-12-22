package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.ResponseForm;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.ResponseFormService;

@Controller
@RequestMapping("/v1/resp_form")
public class ResponseFormController extends UnitController<ResponseForm> {
    public ResponseFormController(ResponseFormService _service) {
        super(_service);
    }
}
