import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problme1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        System.out.println(list);
    }

    public static void sort(List<Number> list) {
        Collections.sort(list, new NumberComparator());
    }
    
    static class NumberComparator implements java.util.Comparator<Number> {
        @Override
        public int compare(Number num1, Number num2) {
            return Double.compare(num1.doubleValue(), num2.doubleValue());
        }
    }
}
