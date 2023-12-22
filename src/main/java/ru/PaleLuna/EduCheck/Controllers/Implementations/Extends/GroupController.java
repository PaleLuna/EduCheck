package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.Group;
import ru.PaleLuna.EduCheck.Services.Implementations.EntityService;

@Controller
@RequestMapping("/v1/group")
public class GroupController extends UnitController<Group> {
    public GroupController(EntityService<Group> service) {
        super(service);
    }
}
