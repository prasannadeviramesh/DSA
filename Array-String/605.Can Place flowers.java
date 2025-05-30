class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  // number of flowers we can plant
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
           
            if (flowerbed[i] == 0) {
                // check left and right plots
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1 || flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // plant a flower
                    count++;
                    if (count >= n) return true;
                }
            }
        }
        
        return count >= n;
    }
}
