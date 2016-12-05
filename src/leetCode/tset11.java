package src.leetCode;

public class tset11 {

	public static void main(String[] args) {
		Solution1 so = new Solution1();
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		
		ListNode l3 = so.addTwoNumbers(l1, l2);
		System.out.print(l3.val);
	}

}


class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode out = null;
    	ListNode note = null;
    	out = note =  new ListNode(0);
    	int sum = 0;
    	int carry = 0;
    	int remain =0;
    	while(l1!=null || l2!=null || carry !=0 ){
    		sum = (l1!=null ? l1.val :0) + (l2!=null ? l2.val :0) +carry;
    		carry = sum/10;
    		remain = sum%10;
    		note = note.next = new ListNode(remain); 
    		l1 = (l1 != null ? l1.next :null); 
    		l2 = (l2 != null ? l2.next :null); 
    	}
    	
        return out.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
