package ru.PaleLuna.EduCheck.Model.Extends;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.engine.internal.Cascade;
import ru.PaleLuna.EduCheck.Model.Unit;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true, optional = false)
    @JoinColumn(name = "idUser", nullable = false, unique = true)
    private User user;

    @ManyToOne
    @JoinColumn(name = "idGroup")
    private Group group;

    @Override
    public Long getId() {
        return id;
    }
}
