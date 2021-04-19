public class akuna_group_options {
    public static int calculateGroups(int pos, int prev, int left, int k){
        if ( pos == k){
            if (left == 0 ){
                return  1;
            }else {
                return  0;
            }
        }

        if (left == 0 ) return  0;
        int ans = 0;
        for (int i = prev; i <= left; i++){
            ans += calculateGroups(pos + 1, i, left -i, k);
        }
        return  ans;
    }

    public static int calculateGroups1(int prev, int n, int k){
        if (k == 1){
            if (n >= prev){
                return  1;
            }else return 0;
        }

        int ans = 0;

        for (int i = prev; i <=n;i++){
            ans += calculateGroups1(i,n-i,k-1);
        }
        return  ans;

    }


    // n people
    // k group
    public static int countWaysToDivide(int n, int k){
        return calculateGroups1(1,n,k);
//        return  calculateGroups(0,1,n,k);
    }

}
