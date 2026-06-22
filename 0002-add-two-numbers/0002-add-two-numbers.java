class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode(0);
        ListNode temp=sum;
        int t=0;
        while(l1!=null || l2!=null || t!=0)
        {
            int s2=t;
            if(l1!=null)
            {
                s2+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                s2+=l2.val;
                l2=l2.next;
            }
            t=s2/10;
            temp.next=new ListNode(s2%10);
            temp=temp.next;
        }
        return sum.next;
    }
}