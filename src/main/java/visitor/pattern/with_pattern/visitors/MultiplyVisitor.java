package visitor.pattern.with_pattern.visitors;

import visitor.pattern.with_pattern.elements.*;

import java.util.List;

public class MultiplyVisitor implements NumberVisitor {
    @Override
    public void visit(TwoElement twoElement) {
        int prod = twoElement.a * twoElement.b;
        System.out.println(twoElement.a + "*" + twoElement.b + "=" + prod);
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int prod = threeElement.a * threeElement.b * threeElement.c;
        System.out.println(threeElement.a + "*" + threeElement.b + "*" + threeElement.c + "=" + prod);
    }

    @Override
    public void visit(List<NumberElement> elementList) {

        for (NumberElement element : elementList)
            element.accept(this);

    }
}
