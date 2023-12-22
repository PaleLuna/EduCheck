package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.*;
import lombok.*;
import ru.PaleLuna.EduCheck.Model.Unit;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "group_table")
public class Group extends Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGroup")
    private Long id;

    @Column(name = "GroupName", nullable = false, unique = true)
    private String groupName;

    @Override
    public Long getId() {
        return id;
    }
}
