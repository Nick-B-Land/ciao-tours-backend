package com.sait.ciaoToursEMS.model;
import javax.persistence.*;

/**
 * Role
 * User account roles used for authorization and access control.
 */
@Entity
@Table(name = "roles")
public class Role {

    /**
     * Role id (primary key)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;

    /**
     * Role name @see EmumRoles
     */
    @Enumerated(EnumType.STRING)
    @Column
    private EnumRoles name;

    public Role() {}

    /**
     * Get role id
     * @return role id
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     * Set role id
     * @param role_id role id
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    /**
     * Get role name
     * @return role name
     */
    public EnumRoles getRole_name() {
        return name;
    }

    /**
     * Set role name
     * @param role_name role name enum
     */
    public void setRole_name(EnumRoles role_name) {
        this.name = role_name;
    }
}
