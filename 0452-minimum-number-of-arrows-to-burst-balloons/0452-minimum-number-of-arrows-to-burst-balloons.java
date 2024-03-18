class Solution {
    public int findMinArrowShots(int[][] points) {
         Arrays.sort(points, (a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        if(points.length == 1) return 1;
        int furthestMutual = points[0][1];
        int result = 1;

        for(int i = 1; i < points.length; i++) {
            int balloonStart = points[i][0];
            int balloonEnd = points[i][1];
            if(furthestMutual >= balloonStart) {
                furthestMutual = Math.min(furthestMutual, balloonEnd);
            } else {
                result++;
                furthestMutual = balloonEnd;
            }
        }

        return result;
    }
}