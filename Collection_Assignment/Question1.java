package Collection_Assignment;

import java.util.Stack;

public class Question1 {
    public void push(int a, Stack<Integer> s){
        s.push(a);
    }

    public int pop(Stack<Integer> s){
        return s.pop();
    }

    public int min(Stack<Integer> s){
        int min=Integer.MAX_VALUE;
        for(int i:s){
            if(i<min){
                min=i;
            }
        }
        return min;
    }

    public boolean isFull(Stack<Integer>s, int n) {
        return s.size()==n;
    }

    public boolean isEmpty(Stack<Integer>s){
        return s.size()==0;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Question1 obj = new Question1();
        obj.push(5, st);
        obj.push(3, st);
        obj.push(2, st);
        obj.push(10, st);
        System.out.println(obj.min(st));
        System.out.println(obj.pop(st));;
    }
}
