class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        String result = Integer.toString(val);
        if(next != null) {
            result = result + " -> " + next.toString();
        }
        return result;
    }
}
