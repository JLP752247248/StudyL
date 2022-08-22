package com.jlp.leetcode;

import java.util.HashSet;
import java.util.Set;
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jianglingpingboy@163.com
 *
 */
public class ZuichangZicuan {

	public static void main(String[] args) {

		System.out.println(longestChildernStringLenOfString("abcdeaf"));
		System.out.println(longestChildernStringLenOfString("abadeaf"));
		System.out.println(longestChildernStringLenOfString("abcdefgav"));
		System.out.println(longestChildernStringLenOfString("123454321"));
		System.out.println(longestChildernStringLenOfString("111111111"));
	}
	
	/**
	 * 思路：两个指针，不断缩小范围，特别要理解的地方是当j指针和i指针范围第一次达到最长，也就是j后面以为和前面有重复时，前面的数据已经不重要了，但是为了要找到和
	 * 末尾字符重复的字符，还需要把i指针往右移动知道Set对象里面不包含重复的，说明可以从i的新位置往后找更长的了。
	 * @param aim
	 * @return
	 */
	private static int longestChildernStringLenOfString(String aim) {
		Set<Character> charSet=new HashSet<>();
		char[] charArr=aim.toCharArray();
		int i=0,j=0,mlen=0;
		while(i<aim.length() && j<aim.length()) {
			if(!charSet.contains(charArr[j])) {
				charSet.add(charArr[j++]);
				mlen=Math.max(mlen, j-i);
			}else {
				charSet.remove(charArr[i++]);
			}
		}
		return mlen;
	}

}
