package uca.ing;

import java.util.function.Predicate;

public class OrRoleOperator extends RoleOperator {

    private final RoleExpression left;
    private final RoleExpression right;

    public OrRoleOperator(RoleExpression left, RoleExpression right) {
        super(null); // Passing null to the base class since we're not using the `operands` list.
        this.left = left;
        this.right = right;
    }

    @Override
    public String stringify() {
        return "(" + left.stringify() + " OR " + right.stringify() + ")";
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return left.toPredicate().or(right.toPredicate());
    }
}
