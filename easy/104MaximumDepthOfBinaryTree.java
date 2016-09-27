public int max = 1;
public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    findDepth(root, 1);
    return max;
}
private void findDepth(TreeNode root, int depth) {
    if (root == null) return;
    max = Math.max(max, depth);
    if (root.left != null) {
        findDepth(root.left, depth + 1);
    }
    if (root.right != null) {
        findDepth(root.right, depth + 1);
    }
}