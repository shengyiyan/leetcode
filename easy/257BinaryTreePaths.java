public List<String> binaryTreePaths(TreeNode root) {
    if(root == null) return new ArrayList<String>();
    List<String> result = new ArrayList<String>();
    dfs(root, "", result);
    return result;
}
private void dfs(TreeNode root, String s, List<String> result){
    if(root.left == null && root.right==null)
        result.add(s+String.valueOf(root.val));
    if(root.left != null)
        dfs(root.left, s+String.valueOf(root.val)+"->", result);
    if(root.right !=null)
        dfs(root.right, s+String.valueOf(root.val)+"->", result);
}