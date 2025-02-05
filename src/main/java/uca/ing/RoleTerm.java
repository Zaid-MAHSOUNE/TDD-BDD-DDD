package uca.ing;

import java.util.function.Predicate;

public class RoleTerm implements RoleExpression {
    private Role role;

    public RoleTerm(Role role) {
        this.role = role;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String stringify() {
        return role.name;
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return roles -> roles.contains(role);
    }
}
