import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<Integer> arr;
    private int[] candies;

    public Solution(List<Integer> arr) {
        this.arr = arr;
        this.candies = new int[arr.size()];
    }

    public int solve() {
        int prev, curr, next;

        Arrays.fill(candies, 1);

        for (int i = 1; i < arr.size(); i++) {
            prev = arr.get(i - 1);
            curr = arr.get(i);

            if (curr > prev) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = arr.size(); i > 0; i--) {
            prev = arr.get(i - 1);
            curr = arr.get(i);

//            if (curr ) {
//
//            }
        }

        return 0;
    }
}
