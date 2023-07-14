class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        
        int tribonacci_number[] = new int[n+1];
            tribonacci_number[0] = 0;
            tribonacci_number[1] = 1;
            tribonacci_number[2] = 1;
        
        for(int i=3; i<=n; i++){
            tribonacci_number[i] = tribonacci_number[i-1] +  tribonacci_number[i-2] +  tribonacci_number[i-3];
        }
        
        return tribonacci_number[n];
    }
}