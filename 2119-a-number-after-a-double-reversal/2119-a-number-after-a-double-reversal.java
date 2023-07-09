class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        while(num != 0){
            int remainder = num % 10;
            if(remainder==0 && num == temp)
                return false;
            
            num = num/10;    
    }
        return true;
}
}