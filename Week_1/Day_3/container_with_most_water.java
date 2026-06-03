class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        for(int i = 0; i < height.length; i++) {

            for(int j = i + 1; j < height.length; j++) {

                int width = j - i;

                int minHeight;

                if(height[i] < height[j]) {
                    minHeight = height[i];
                } else {
                    minHeight = height[j];
                }

                int area = width * minHeight;

                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }
}
