package com.jlp.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。

示例:

输入: [1,1,2]
输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/permutations-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jianglingpingboy@163.com
 *
 */
public class Le47_QuanPailie {

	public static void main(String[] args) {
		int[] test=new int[] {2,3,11,11};
		System.out.println(permuteUnique(test));
	}
	
	
	public static  List<LinkedList<Integer>> permuteUnique(int[] nums) {
        List<LinkedList<Integer>> result=new ArrayList<>();
        Set<Integer> numSet=new HashSet<Integer>();
        if(nums.length==1) {
        	LinkedList<Integer> t=new LinkedList<Integer>();
        	t.add(nums[0]);
        	result.add(t);
        }
        for(int i=0;i<nums.length;i++){
            if(numSet.contains(nums[i])){
                continue;
            }else{
                numSet.add(nums[i]);
                int []numsChild=new int[nums.length-1];
                System.arraycopy(nums, 0, numsChild, 0, i);
                if(i<numsChild.length) {
                	System.arraycopy(nums, i+1, numsChild, i, numsChild.length-i);
                }
                List<LinkedList<Integer>> resChild=permuteUnique(numsChild);
                for(LinkedList<Integer> cll:resChild){
                    cll.add(0,nums[i]);
                }
                result.addAll(resChild);
            }
        }
		return result;
        
    }
}
