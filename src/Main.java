import java.util.Arrays;

public class Main {

    public static int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        int resultIndex = 0;
        int numsIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                result[i] = 3;
                result[i+1] = 4;
            }
        }
        while(resultIndex < nums.length){
            if(result[resultIndex] == 3){
                resultIndex += 2;
            }
            else if(nums[numsIndex] == 3 || nums[numsIndex] == 4){
                numsIndex++;
            }
            else{
                result[resultIndex] = nums[numsIndex];
                resultIndex++;
                numsIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] firstSample = new int[]{1, 3, 1, 4};
        int[] secondSample = new int[]{1, 3, 1, 4, 4, 3, 1};
        int[] thirdSample = new int[]{3, 2, 2, 4};

        int[] firstFixed = fix34(firstSample);
        int[] secondFixed = fix34(secondSample);
        int[] thirdFixed = fix34(thirdSample);

        System.out.println(Arrays.toString(firstFixed));
        System.out.println(Arrays.toString(secondFixed));
        System.out.println(Arrays.toString(thirdFixed));

    }
}