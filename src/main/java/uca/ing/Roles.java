package uca.ing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Roles {
    private List<Role> roles;

    public Roles() {
        roles = new ArrayList<>();
    }

    public Roles(String... rolenames) {
        roles = new ArrayList<>();
    }

    public boolean contains(Role role) {
        return roles.contains(role);
    }

    public static Roles of(Role... roleArray) {
        Roles newRoles = new Roles();
        newRoles.roles.addAll(Arrays.asList(roleArray));
        return newRoles;
    }

    public static Roles of(String... roleNames) {
        return new Roles(Arrays.asList(roleNames).stream()
                .filter(Objects::nonNull));
    }
}
