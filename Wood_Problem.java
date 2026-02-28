package Recursion;
import java.util.Scanner;

public class Wood_Problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int maxheight = Integer.MIN_VALUE;
        for(int h : arr){
            maxheight = Math.max(maxheight, h);
        }

        int ans = solve(arr, 0, maxheight, x);
        System.out.println(ans);
    }

    public static int solve(int[] arr, int low, int high, int x){

        if(low > high){
            return high;   // maximum valid height
        }

        int mid = low + (high - low) / 2;
        long wood = CanCutWood(arr, mid);

        if(wood >= x){
            return solve(arr, mid + 1, high, x);
        } else {
            return solve(arr, low, mid - 1, x);
        }
    }

    public static long CanCutWood(int[] arr, int mid){
        long result = 0;
        for(int h : arr){
            if(h > mid){
                result += (h - mid);
            }
        }
        return result;
    }
}
