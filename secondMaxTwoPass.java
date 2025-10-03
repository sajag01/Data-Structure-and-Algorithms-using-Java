import java.util.*;
public class secondMaxTwoPass{

    public static int secondLargestElement(int[] nums) {
        boolean flag = false;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int smax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < max && nums[i] > smax){
                smax = nums[i];
                flag = true;
            }
        }
        if(flag == true){
            return smax;
        }
        else{
            return -1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = secondLargestElement(arr);
        System.out.println(x);

    }

}