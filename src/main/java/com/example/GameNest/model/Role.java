package com.example.GameNest.model;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "Role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    // RoleName enum
    public enum RoleName {
        Admin, Employee, Customer
    }
}
