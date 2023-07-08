class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for(int i=1; i<points.length; i++){
            int[] curr = points[i], prev = points[i-1];
           count += Math.max(Math.abs(curr[0] - prev[0]),
                             Math.abs(curr[1] - prev[1]));
        }
        return count;
    }
}