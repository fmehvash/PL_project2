package src;

public class ExprEvaluator implements ExprVisitor<Float> {
    /*
     * Part 2: impelement the visitor pattern for expressions
     */
    public Float visit(FloatExpr expr) {
        return expr.eval();
    }

    public Float visit(PlusExpr expr) {
        return expr.eval();
    }

    public Float visit(MinusExpr expr) {
        return expr.eval();
    }

    public Float visit(TimesExpr expr) {
        return expr.eval();
    }

    public Float visit(DivExpr expr) {
        return expr.eval();
    }
}
