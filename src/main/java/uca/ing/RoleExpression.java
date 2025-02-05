package uca.ing;

import java.util.function.Predicate;

public interface RoleExpression {

    String stringify();

    Predicate<Roles> toPredicate();
}
