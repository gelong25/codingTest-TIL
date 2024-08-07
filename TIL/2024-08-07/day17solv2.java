import java.util.ArrayList;
import java.util.List;
import java.util.Stack; 

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
        List<Integer> answer = new ArrayList<>();  // 결과를 저장할 리스트 생성
        Stack<TreeNode> stack = new Stack<>();  // 트리 탐색을 위한 스택 생성
        TreeNode current = root; // 현재 노드를 root로 설정 

        // 현재 노드가 null이 아니거나 스택이 비어 있지 않을 때까지 반복
        while(current != null || !stack.isEmpty()) {   
            // 현재 노드의 왼쪽 자식이 존재할 때까지 스택에 노드 추가 
            while(current != null) {
                stack.push(current);      // 현재 노드를 스택에 추가 
                current = current.left;   // 현재 노드를 왼쪽 자식으로 이동 
            }
            current = stack.pop();      // 스택에서 노드를 꺼내 
            answer.add(current.val);    // 결과 리스트에 추가 
            current = current.right;    // 현재 노드를 오른쪽 자식으로 이동 
        } 

        return answer;
    }
}
