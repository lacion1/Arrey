import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1])
                count++;
        }

        System.out.println();
        System.out.println(count);
    }
}
