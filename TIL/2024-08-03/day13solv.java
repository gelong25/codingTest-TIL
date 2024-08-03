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
// 이진 탐색 트리에서 특정 값 검색 하기 
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {                // 노드가 null이 아닐 때까지 반복
            if (val == root.val) {            // 현재 노드의 값이 검색할 값과 일치하면 현재 노드를 반환
                return root;
            } else if (val < root.val) {      // 검색할 값이 현재 노드의 값보다 작으면 왼쪽 자식 노드로 이동
                root = root.left;
            } else {                          // 검색할 값이 현재 노드의 값보다 크면 오른쪽 자식 노드로 이동
                root = root.right;
            }
        }
        return null;                          // 검색할 값이 없는 경우, null값 반환 
    }
}


