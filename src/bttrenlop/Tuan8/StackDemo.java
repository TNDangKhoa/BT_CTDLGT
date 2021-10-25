package bttrenlop.Tuan8;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
    Stack<String> stack;

    stack = new Stack<> ();
    stack.push(" WildRift ");
    stack.push(" e ");
    stack.push(" Youkoso ");

    System.out.println(stack);
    //them phan tu(xoa phan tu)
    String poped = stack.pop();

    System.out.println(" phần tử đã lấy từ danh sách " + poped);
    System.out.println(" phần tử con lại của danh sách");
    System.out.println(stack);

    }
}