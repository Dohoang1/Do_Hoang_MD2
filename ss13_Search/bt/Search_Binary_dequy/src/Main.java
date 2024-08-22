import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.substring(i, i + 1));
        }
        Collections.sort(arrayList);

        System.out.println("Sorted List: " + arrayList);

        System.out.println("Enter a value to search: ");
        String searchValue = sc.nextLine();

        int result = binarySearch(arrayList, 0, arrayList.size() - 1, searchValue );
        if (result != -1) {
            System.out.println("Value found at index: " + result);
        } else {
            System.out.println("Value not found");
        }
    }

    public static int binarySearch(List<String> list,int left,int right, String value) {

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int comparison = list.get(middle).compareTo(value);

            if (comparison == 0) {
                return middle;
            }

            if (comparison < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
