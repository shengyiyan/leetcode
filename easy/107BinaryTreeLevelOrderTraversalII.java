public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if (root==null) return ans;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> curr = new ArrayList<>();
        for (int i=0; i<size; i++) {
            TreeNode node = queue.poll();
            curr.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        ans.add(0,curr);
    }
    return ans;
}