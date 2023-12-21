package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.User;
import ru.PaleLuna.EduCheck.Services.Implementations.UserService;

import java.util.List;

@Controller
@RequestMapping("/v1/user")
public class UserController extends UnitController<User>{

    public UserController(UserService _service) {
        super(_service);
    }

    @Override
    public List<User> GetAllUnits() {
        return super.GetAllUnits();
    }

    @Override
    public User SaveUnit(@RequestBody User unit) {
        return super.SaveUnit(unit);
    }

    @Override
    public ResponseEntity<User> FindById(@PathVariable("id") int id) {
        return super.FindById(id);
    }

    @Override
    public ResponseEntity<String> Update(@RequestBody User unit) {
        return super.Update(unit);
    }

    @Override
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id) {
        return super.DeleteById(id);
    }
}
