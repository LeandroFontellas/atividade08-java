package visitor.pattern.without_pattern;

import visitor.pattern.without_pattern.elements.*;
import visitor.pattern.without_pattern.interfaces.*;

import java.util.List;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("------------SumTest-------------------------");
        TwoNumber two1 = new TwoNumber(3, 3);
        TwoNumber two2 = new TwoNumber(2, 7);
        ThreeNumber three = new ThreeNumber(3, 4, 5);

        List<Sum> numberElementList = new ArrayList<Sum>();
        numberElementList.add(two1);
        numberElementList.add(two2);
        numberElementList.add(three);

        System.out.println("Somatorio em um Array: "+new ArrayNumber().sum(numberElementList));

        System.out.println("\n------------MultiplyTest-------------------------");

        List<Multi> prodElementList = new ArrayList<Multi>();
        prodElementList.add(two1);
        prodElementList.add(two2);
        prodElementList.add(three);

        System.out.println("Somatorio em um Array: "+new ArrayNumber().multi(prodElementList));
    }
}
