package uca.ing;

import java.util.List;

public abstract class RoleOperator implements RoleExpression {
    protected List<RoleExpression> operands;

    public RoleOperator(List<RoleExpression> operands) {
        this.operands = operands;
    }

    public List<RoleExpression> getOperands() {
        return operands;
    }
}
