import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] items = scanner.nextLine().split(" ");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(items[i]);
        }

        Collections.sort(list);

        String searchItem = scanner.nextLine();

        System.out.println("Sorted Items: " + list);

        if (list.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
