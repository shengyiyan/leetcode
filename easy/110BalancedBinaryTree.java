public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    if (getHeight(root.left) - getHeight(root.right) > 1 || getHeight(root.right) - getHeight(root.left) > 1) {
        return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
}
public int getHeight(TreeNode root) {
    if(root == null) {
        return 0;
    }
    return Math.max(getHeight(root.left), getHeight(root.right))+1;
}