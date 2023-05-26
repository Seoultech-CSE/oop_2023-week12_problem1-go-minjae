import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                int num = input.nextInt();
                list.add(num);
            } else {
                double num = input.nextDouble();
                list.add(num);
            }
        }

        sort(list);

        System.out.print(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }

    public static void sort(ArrayList<Number> list) {
         list.sort(new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        });
    }
}
