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
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null) {        // 루트 노드가 null이면 대칭이므로 true 반환 
            System.out.println("루트가 null이면 트리는 대칭이다.");
            return true; 
        }
        return isMirror(root.left, root.right);  // 루트의 왼쪽과 오른쪽 서브트리가 대칭인지 확인하기 위한 재귀 함수 호출 

    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) {            // 왼쪽과 오른쪽 서브트리의 루트가 둘 다 null이면 대칭이므로 true 반환 
            System.out.println("두 노드 값이 null이면 true 반환");
            return true;
        } else if (left == null || right == null) {    // 왼쪽 또는 오른쪽 서브트리 중 하나만 null인 경우 대칭이 아니므로 false 반환  
            System.out.println("한 노드만 null이면 false 반환 left: " + (left == null ? "null" : left.val) + ", right: " + (right == null ? "null" : right.val));
            return false; 
        } else if (left.val != right.val) {            // 왼쪽과 오른쪽 노드 값이 다르면 대칭이 아니므로 false 반환 
            System.out.println("두 노드 값이 다르면 false 반환 left: " + left.val + ", right: " + right.val);
            return false; 
        } 
        // 왼쪽 노드의 왼쪽 자식과 오른쪽 노드의 오른쪽 자식을 비교하고 
        // 왼쪽 노드의 오른쪽 자식과 오른쪽 노드의 왼쪽 자식을 비교해 둘 다 대칭인지 확인 
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);  
    }
}
