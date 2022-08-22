package com.jlp.leetcode;
/**
	 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
	
	示例 1：
	
	输入: "babad"
	输出: "bab"
	注意: "aba" 也是一个有效答案。
	示例 2：
	
	输入: "cbbd"
	输出: "bb"
	
	来源：力扣（LeetCode）
	链接：https://leetcode-cn.com/problems/longest-palindromic-substring
	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jianglingpingboy@163.com
 *
 */
public class ZuichangHuiwenZicuan {

	public static void main(String[] args) {
		System.out.println(solution1("111112211"));
		System.out.println(solution1("ababacd"));
		System.out.println(solution1("bbcvcababacd"));
	}

	
	public static String solution1(String str) {
		int n=str.length();
		boolean  [][]devArr=new boolean[n][n];
		int maxlen=0;
		String longest="";
		for(int len=0;len<str.length();len++) {
			for(int i=0;i<n;i++) {
				int j=i+len;
				if(j>n-1) {
					continue;
				}
				
				if(len<=1) {
					devArr[i][j]= str.charAt(i)==str.charAt(j);
				}else {
					devArr[i][j]=devArr[i+1][j-1] && str.charAt(i)==str.charAt(j);	
				}
				
				if(devArr[i][j] && maxlen<len) {
					longest=str.substring(i, j+1);
				}
				System.out.println("dev"+" "+i+","+j+":"+devArr[i][j]);
			}
		}
		return longest;
	}
	static int  times=0;
	public static boolean isHuiwen(String s,int idi,int idj) {
		times++;
		if(s.charAt(idi)==s.charAt(idj) && (  idj-idi<=1 || isHuiwen(s,idi+1,idj-1))) {
			return true;
		}
		return false;
	}
}
