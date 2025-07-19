/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int prev=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                prev=node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            ans.add(prev);
        }

        return ans;

        
    }
}