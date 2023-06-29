package bt05;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        int index = searchBinary(arr, target);
        if (index == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println(target + " Nằm tại vị trí " + index);
        }
    }

    public static int searchBinary(int[] arr, int target) {
        try {
            int low = 0;
            int high = arr.length - 1;
            while (high >= low) {
                int mid = (high + low) / 2;
                if (arr[mid] < target) {
                    low = mid + 1;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
