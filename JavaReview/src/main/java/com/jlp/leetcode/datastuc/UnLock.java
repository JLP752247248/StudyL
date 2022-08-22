package com.jlp.leetcode.datastuc;

public class UnLock {
    public static int unLock(String[] deadends, String target, String source) {
        //解题思路：采用广度优先遍历
        MyQueue<String> queue = new MyQueue<String>();
        MyQueue<String> alreadyUsed = new MyQueue<String>();
        queue.offer(source);
        alreadyUsed.add(source);
        String numstr = "0123456789";
        int k =0;
        while (!queue.isEmpty()) {
            String nodeData = queue.pull().data;
            for (int i = 0; i < 4; i++) {
                StringBuilder sb = new StringBuilder(nodeData);
                char num = nodeData.charAt(i);
                int idx = nodeData.indexOf(num);
                for (int j = 1; j <= 9; j++) {
                    idx = (idx + 1) % 10;
                    char newC = numstr.charAt(idx);
                    sb.setCharAt(i,newC);
                    String newStr = sb.toString();
                    //如果已经有，或者不可走，跳过
                    if(alreadyUsed.contains(newStr) || willLockForever(deadends,newStr)){
                        continue;
                    }
                    //加入已经走
                    alreadyUsed.add(newStr);
                    //如果找到目标，返回权重值
                    if(newStr.equals(target)){
                        return k;
                    }else{
                        //找不到，加入队列尾巴
                        queue.offer(newStr);
                    }
                }
            }
            k++;
        }
        return -1;
    }


    public static boolean willLockForever(String[] deadends, String target) {
        for (String dep : deadends) {
            if (dep.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] deadends = new String[] {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        String source = "0000";
        int res = unLock(deadends,target,source);
        System.out.println(res);
    }
}
