package ru.PaleLuna.EduCheck.Model.Extends;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
public class Discipline extends Unit {

    private Long id;

    private String disciplineName;

    @Override
    public Long getId() {
        return id;
    }
}
