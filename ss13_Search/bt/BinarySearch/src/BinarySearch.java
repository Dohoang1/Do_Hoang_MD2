public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,4));
        System.out.println(binarySearch(list,6));
        System.out.println(binarySearch(list,7));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,45));
        System.out.println(binarySearch(list,50));
        System.out.println(binarySearch(list,60));
        System.out.println(binarySearch(list,70));
        System.out.println(binarySearch(list,90));
        System.out.println(binarySearch(list,79));
    }



    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while  (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else  {
                low = mid + 1;
            }
        }
        return -1;
    }
}
