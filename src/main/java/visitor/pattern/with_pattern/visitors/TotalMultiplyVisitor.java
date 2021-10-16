package visitor.pattern.with_pattern.visitors;

import visitor.pattern.with_pattern.elements.*;

import java.util.List;

public class TotalMultiplyVisitor implements NumberVisitor{
    private int totalProd = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int prod = twoElement.a * twoElement.b;
        System.out.println("Adding " + twoElement.a + "*" + twoElement.b + "=" + prod + " to total");
        totalProd += prod;
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int prod = threeElement.a * threeElement.b * threeElement.c;
        System.out.println("Adding " + threeElement.a + "*" + threeElement.b + "*" + threeElement.c + "=" + prod + " to total");
        totalProd += prod;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement element : elementList)
            element.accept(this);
    }

    public int getTotalProd() {
        return totalProd;
    }
}
