import java.util.HashMap; 
import java.util.Collections;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count 
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map.toString());
        int n = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == Collections.max(map.values())) {
                n = key;
                break;
            }
        }
        System.out.println(n);
    }
}
