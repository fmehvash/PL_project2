package src;

public interface ExprVisitor<R> {
    /*
     * Part 2: Implement the visitor pattern for expressions
     */
    R visit(FloatExpr expr);

    R visit(PlusExpr expr);

    R visit(MinusExpr expr);

    R visit(TimesExpr expr);

    R visit(DivExpr expr);
}
