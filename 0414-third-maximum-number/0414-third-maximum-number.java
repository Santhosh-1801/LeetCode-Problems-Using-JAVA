import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int thirdMax(int[] nums) {
        Integer[] numArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numArray, Collections.reverseOrder());
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer num : numArray) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }
        return uniqueNumbers.size() >= 3 ? uniqueNumbers.get(2) : uniqueNumbers.get(0);
    }
}