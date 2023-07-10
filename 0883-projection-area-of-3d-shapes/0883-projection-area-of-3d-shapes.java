class Solution {
    public int projectionArea(int[][] grid) {
        int top = 0;
        int xsum = 0;
        int ysum = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] > 0){
                    top++;
                }
            }
        }
        
        for(int i=0; i<grid.length; i++){
            int max = 0;
            
            for(int j=0; j<grid[i].length; j++){
             max = Math.max(grid[i][j], max);
            }
            xsum += max;
    }
        
         for(int j=0; j<grid[0].length; j++){
            int max = 0;
            for(int i=0; i<grid.length; i++){
             max = Math.max(grid[i][j], max);
            }
            ysum += max;
    }
        return top + xsum + ysum;      
}
}