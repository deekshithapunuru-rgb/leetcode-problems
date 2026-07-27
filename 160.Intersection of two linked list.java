blic class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        Set<ListNode> set = new HashSet<>();

        while(currA != null){
            set.add(currA);
            currA = currA.next;
        }

        while(currB != null){
            if(set.contains(currB)){
                return currB;
            }
            currB = currB.next;
        }
        return null;
    }
}
