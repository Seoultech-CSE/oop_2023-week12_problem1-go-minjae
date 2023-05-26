import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class week13_1 {
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
        Collections.sort(list);
    }
}
