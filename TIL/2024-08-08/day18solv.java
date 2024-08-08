import java.util.ArrayList;

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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();  // 중위 순회 결과를 저장하기 위한 리스트 생성 

        inOrder(root, inOrderList);  // 중위 순회 재귀 함수 호출 

        TreeNode tempNode = new TreeNode(0);    // 새로운 트리의 임시 노드 생성
        TreeNode currnetNode = tempNode;        // 현재 노드에 임시 노드 저장 

        // for-each 문을 통해 리스트 순회
        for(int val : inOrderList) {
            currnetNode.right = new TreeNode(val);   // 현재 노드의 오른쪽 자식 노드 연결 
            currnetNode = currnetNode.right;         // 현재 노드를 새로 만든 오른쪽 자식 노드로 이동 
        }

        return tempNode.right;   // 새로운 트리 임시 노드의 오른쪽 자식 노드 반환 
    }

    // 중위 순회 함수 
    public void inOrder(TreeNode node, List<Integer> inOrderList) {
        if(node != null) {        // 노드가 null 값이 아닌 경우 
            inOrder(node.left, inOrderList);  // 왼쪽 자식 방문
            inOrderList.add(node.val);        // 현재 노드 값을 리스트에 저장 
            inOrder(node.right, inOrderList); // 오른쪽 자식 방문 
        }
    }
}
