public class akuna_factor35 {

    public static int nthUglyNumber(int n){
        int[] nums = new int[n];
        nums[0] =1 ;
        int index3 = 0;
        int index5 =0;
        for(int i = 1; i < n ; i ++){
            nums[i] = Math.min(nums[index3]*3,nums[index5]*5);
            if (nums[i] == nums[index3]*3){
                index3 ++;
            }
            if (nums[i] == nums[index5]*5){
                index5 ++;
            }
        }
        for(int i : nums){
            System.out.println(i);
        }
        return  nums[n-1];
    }
    public static int getNumbers(int low, int high){
        System.out.printf(low + "," + high + "\n");

        int num = 1;
        int n= 0;
        int res = 0;

        while (num <= high){
            if (num >= low){
                res ++ ;
            }
            n++;
            num = nthUglyNumber(n);
        }



        return  res;
    }


}
