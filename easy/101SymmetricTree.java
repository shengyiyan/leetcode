public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root, root);
}

private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if ((left == null && right != null) ||(right == null && left != null)) return false;
    return (left.val != right.val) ? false : (isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left));
}