package ru.PaleLuna.EduCheck.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.PaleLuna.EduCheck.Model.Group;
import ru.PaleLuna.EduCheck.Services.Implementations.GroupService;

import java.util.List;

@Controller
@RequestMapping("/v1/group")
public class GroupController extends UnitController<Group>{
    public GroupController(GroupService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<Group> GetAllUnits() {
        return super.GetAllUnits();
    }

    @Override
    @PostMapping("/save_group")
    public Group SaveUnit(@RequestBody Group unit) {
        return super.SaveUnit(unit);
    }

    @Override
    @ResponseBody
    @GetMapping("{id}")
    public ResponseEntity<Group> FindById(@PathVariable("id") int id) {
        return super.FindById(id);
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<String> Update(@RequestBody Group unit) {
        return super.Update(unit);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> DeleteById(@PathVariable("id") int id) {
        return super.DeleteById(id);
    }
}
