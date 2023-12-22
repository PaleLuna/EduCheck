package ru.PaleLuna.EduCheck.Controllers.Implementations.Extends;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Controllers.Implementations.UnitController;
import ru.PaleLuna.EduCheck.Model.Extends.User;
import ru.PaleLuna.EduCheck.Services.Implementations.Extends.UserService;

@Controller
@RequestMapping("/v1/user")
public class UserController extends UnitController<User> {

    public UserController(UserService _service) {
        super(_service);
    }
}