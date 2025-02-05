package uca.ing;

import java.util.function.Predicate;

public class AndRoleOperator extends RoleOperator {

    private final RoleExpression left;
    private final RoleExpression right;

    public AndRoleOperator(RoleExpression left, RoleExpression right) {
        super(null); // Passing null to the base class since we're not using the `operands` list.
        this.left = left;
        this.right = right;
    }

    @Override
    public String stringify() {
        return "(" + left.stringify() + " AND " + right.stringify() + ")";
    }

    @Override
    public Predicate<Roles> toPredicate() {
        return left.toPredicate().and(right.toPredicate());
    }
}
