package school.mjc.stage0.conditions.task4;

import org.w3c.dom.ls.LSOutput;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
            if (first >= second && first >= third){
                System.out.println(first);
        }   else if (second >= third && second >= first) {
                System.out.println(second);
            }   else {
                    System.out.println(third);
                }

    }
}
