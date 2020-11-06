package io.juliocdet.funciones;

import java.util.HashMap;
import java.util.Map;

public class SumTwoNum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }

    public static int[] twoSumWithMaps(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
