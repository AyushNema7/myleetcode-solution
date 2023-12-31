import java.math.BigInteger;
class Solution {
    public static int mode = 1000000007;
    public int numPrimeArrangements(int n) {
        boolean[] check = new boolean[n+1];
        Arrays.fill(check, 2, n+1, true);
        int primenum = 0;
        
        for(int i=2; i*i<=n; i++){
            if(check[i]){
                for(int j=i*i; j<=n; j+=i){
                    check[j]=false;
                }
            }
        }
        
        for(int i=0; i<=n; i++){
            if(check[i])primenum++;
        }
        BigInteger a = get(primenum);
        BigInteger b = get(n-primenum);
        return a.multiply(b).mod(BigInteger. valueOf(mode)).intValue();
    }
    public BigInteger get(int a){
        BigInteger c = BigInteger.ONE;
        for(int i=2; i<=a; i++){
            c=c.multiply(BigInteger.valueOf(i));
        }
        return c;
    }
}