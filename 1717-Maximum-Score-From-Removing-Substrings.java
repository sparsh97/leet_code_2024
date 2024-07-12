class Solution {
    // public int maximumGain(String s, int x, int y) {
    // String temp = s;
    // int max = 0;
    // StringBuilder sub = new StringBuilder();
    // int flag = 0;
    // if (x > y) {
    // sub.append("ab");
    // flag = 1;
    // } else {
    // sub.append("ba");
    // flag = 2;
    // }
    // while (temp.contains(sub.toString())) {
    // temp = temp.replaceFirst(sub.toString(), "");
    // // System.out.println(temp);
    // max += flag == 1 ? x : flag == 2 ? y : 0;
    // }
    // sub = sub.reverse();
    // flag = flag == 1 ? 2 : 1;
    // while (temp.contains(sub.toString())) {
    // temp = temp.replaceFirst(sub.toString(), "");
    // // System.out.println(temp1);
    // max += flag == 1 ? x : flag == 2 ? y : 0;
    // }
    // return max;
    // }

    public int maximumGain(String s, int x, int y) {
        int max = 0;
        boolean flag = false;
        if (x > y)
            flag = true;
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (flag) {
                    if (stack.peek() == 'a' && s.charAt(i) == 'b') {
                        stack.pop();
                        max += x;
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else {
                    if (stack.peek() == 'b' && s.charAt(i) == 'a') {
                        stack.pop();
                        max += y;
                    } else {
                        stack.push(s.charAt(i));
                    }
                }
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if (stack1.isEmpty()) {
                stack1.push(stack.get(i));
            } else {
                if (!flag) {
                    if (stack1.peek() == 'a' && stack.get(i) == 'b') {
                        stack1.pop();
                        max += x;
                    } else {
                        stack1.push(stack.get(i));
                    }
                } else {
                    if (stack1.peek() == 'b' && stack.get(i) == 'a') {
                        stack1.pop();
                        max += y;
                    } else {
                        stack1.push(stack.get(i));
                    }
                }
            }
        }
        return max;
    }
}