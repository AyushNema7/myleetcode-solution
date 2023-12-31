class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 10;
        }
        
        int count = 10;
        int u=9;
        int a=9;
        for(int i=1; i<n; i++){
            u = u*a;
            count+=u;
            a--;
        }
        return count;
    }
}