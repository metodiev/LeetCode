

package com.pcbsys.nirvana.client.clusterClientConnection;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestSum {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    twoSum(nums, target);
    twoSumMap(nums, target);
    onePassHashTable(nums, target);
  }

  public static int[] twoSum(int[] nums, int target) {
    ArrayList list = new ArrayList();
    if (nums.length >= 2) {
      for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[i] + nums[j] == target) {
            list.add(i);
            list.add(j);
          }
        }
      }
    }
    int[] myArray = new int[list.size()];

    for (int i = 0; i < list.size(); i++) {
      myArray[i] = (int) list.get(i);
    }
    return myArray;
  }

  public  static int[]  twoSumMap(int[] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length ; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length ; i++) {
      int compement = target - nums[i];
      if (map.containsKey(compement) && map.get(compement) != i){
        return new int[] {i, map.get(compement)};
      }
    }
    return nums;
  }

  public static int[] onePassHashTable(int[] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length ; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)){
        return new int[] {map.get(complement), i};
      }
      map.put(nums[i], i);
    }

    return nums;
  }

}
