public int sumOfLeftLeaves(TreeNode root) {
    int sum = 0;
    if (root == null) return sum;
    if (root.left != null) {
        if (root.left.left == null && root.left.right == null) {
            sum += root.left.val + sumOfLeftLeaves(root.left);
        } else {
            sum += sumOfLeftLeaves(root.left);
        }
    }
    if (root.right != null) {
        sum += sumOfLeftLeaves(root.right);
    }
    return sum;
}   