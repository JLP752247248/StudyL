package com.jlp.leetcode;


/**
 * 
 * 
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。

返回被除数 dividend 除以除数 divisor 得到的商。

示例 1:

输入: dividend = 10, divisor = 3
输出: 3
示例 2:

输入: dividend = 7, divisor = -3
输出: -2
说明:

被除数和除数均为 32 位有符号整数。
除数不为 0。
假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/divide-two-integers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author jianglingpingboy@163.com
 *
 */
public class liangshuxiangchu {

	public static void main(String[] args) {
			int x=8;
			x=x>>2;
			System.out.println(getDiv(20,8));
	}

	public static int getDiv(int a,int b) {
		int aAbs=Integer.MAX_VALUE & a;
		int bAbs=Integer.MAX_VALUE & b;
		int resZF=-1;
		if((aAbs==a) == (bAbs==b)) {
			resZF=1;
		}
		int div=1;
		if(aAbs<bAbs) {
			return 0;
		}else {
			int aAbsTemp=aAbs;
			int times=0;
			while((aAbsTemp=aAbsTemp>>1) >bAbs) {
				System.out.println("  aAbsTemp :"+aAbsTemp + " > bAbs :"+bAbs);
				aAbs=aAbsTemp;
				times++;
			}
			for(int i=2<< times;i< 2<<( times+1);i++) {
				
			}
			
		}
		
		return div*resZF;
	}
	
	
}
