public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
        return true;
    } else if (p != null && q != null) {
        if (p.val == q.val) {
        } else {
            return false;
        }
    } else {
        return false;
    }
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}