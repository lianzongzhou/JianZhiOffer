import java.util.ArrayList;
import java.util.Stack;

//构建、初始化单链表
 class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
    val = x;
    }
    public static ListNode makeNode(int[] nums) {
        if (nums.length == 0) return null;
        ListNode listNode = new ListNode(nums[0]);
        ListNode head = listNode;
        for (int i = 1; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            listNode.next = node;
            listNode = node;
        }
        return head;
    }
}
public class PrintListFromTailToHead {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        ListNode listNode =  ListNode.makeNode(a);
        //方法1输出
        System.out.println(printListFromTailToHead(listNode));
        //方法2输出
        System.out.println(printListFromTailToHead2(listNode));
    }
//方法1：使用栈
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        //将链表进栈
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        //将栈内容出栈进入arraylist
        while(!stack.isEmpty()){
            arraylist.add(stack.pop());
        }
        return arraylist;
    }
//方法2:递归
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        if(listNode != null){
            arraylist.addAll(printListFromTailToHead2(listNode.next));//递归
            arraylist.add(listNode.val);
        }
        return arraylist;
    }
}
