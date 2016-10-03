public List<Integer> preorderTraversal(TreeNode root) {
    Stack<TreeNode> s = new Stack<TreeNode>();
    if (root == null) return new ArrayList<Integer>();
    s.push(root);
    ArrayList<Integer> res = new ArrayList<Integer>();
    while (!s.isEmpty()) {
        TreeNode now = s.pop();
        res.add(now.val);
        if(now.right != null) {
            s.push(now.right);
        }
        if(now.left != null) {
            s.push(now.left);
        }
    }
    return res;
}