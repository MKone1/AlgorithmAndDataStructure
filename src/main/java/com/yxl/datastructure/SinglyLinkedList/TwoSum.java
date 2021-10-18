package com.yxl.datastructure.SinglyLinkedList;

import java.util.HashMap;
import java.util.Map;

/** LeetCode:1
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 示例一：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * @author Charlie.Yu
 */
public class TwoSum {
    //暴力破解
    public static int[] twoSum1(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
//                    arr[0] = nums[i];
//                    arr[1] = nums[j];
                    System.out.println(i + "_" + j);
                }
            }
        }

        return null;
    }

    //hashtable
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                //存在一个值等于目标值减去数组中的值
                return new int[]{map.get(target - nums[i]), i};
            }
            //不存在一个值等于目标值减去数组中的值，将这个值存储在map中
            //value 作为key,index 作为value
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
//          int[] num = new int[]{2, 7, 11, 15};
        int[] num = new int[]{3, 3, 1,5};
        twoSum1(num, 6);
        int[] ints = twoSum2(num, 6);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
