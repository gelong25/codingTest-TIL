import java.util.ArrayList;
import java.util.List; 

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();      // 결과를 저장할 리스트 생성

        inorder(root, answer);    // 재귀 호출 
        return answer;            // 결과 반환 
    }

    public void inorder(TreeNode node, List<Integer> answer) {
        if(node != null) {       // 노드가 null이 아닌 경우 
            inorder(node.left, answer);    // 왼쪽 자식 방문
            answer.add(node.val);          // 리스트에 현재 노드값 추가 
            inorder(node.right, answer);   // 오른쪽 자식 방문 
        }
    } 
}
