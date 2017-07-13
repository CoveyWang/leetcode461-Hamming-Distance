/**
 * Created by Covey Wang on 2017/7/13.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
