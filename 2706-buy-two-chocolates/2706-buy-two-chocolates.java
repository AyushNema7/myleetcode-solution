class Solution {
    public int buyChoco(int[] prices, int money) {
        int ans = 0;
        int count = 0;
        Arrays.sort(prices);
        outer:
        for(int i=0; i<=prices.length-1; i++){
            int n1 = prices[i];
            count = 0;
        for(int j=i+1; j<=prices.length-1; j++){
            int n2 = prices[j];
            
            int rem = money-n1;
            int rem2 = rem-n2;
            
            if(rem2 >= 0){
                count++;
                ans=rem2;
                break outer;
            }
        }
            
        }
        if(count==0)
        {
            ans = money;
        }
        return ans;
    }
    }
