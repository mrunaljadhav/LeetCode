/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        int size=0;
        while(head.next!=null){
         
            if(size%2==0){
                mid=mid.next;
                head=head.next;
            }else{
                mid=mid;
                head=head.next;
            }
        size++;
       
        }
        return mid;
    }
}