/**
 * 二叉查找树API
 * 
 */
package Chapter3;

public class BST<Key extends Comparable<Key>, Value> {
	// 根节点
	private Node root;
	private class Node{
		// 键
		private Key key;
		// 值
		private Value value;
		// 指向子树的连接
		private Node left, right;
		// 以该节点为根节点的子树中节点的总数
		private int N;
		public Node(Key key, Value value, int N){
			this.key = key;
			this.value = value;
			this.N = N;
		}
		// 二叉树大小
		public int size(){
			return size(root);
		}
		private int size(Node x){
			if(x == null){
				return 0;
			}else{
				return x.N;
			}
		}
		// 查询节点
		public Value get(Key key){
			return get(root, key);
		}
		private Value get(Node x, Key key){
			if(x == null) return null;
			int cmp = key.compareTo(x.key);
			if(cmp < 0){
				return get(x.left, key);
			}else if(cmp > 0){
				return get(x.right, key);
			}else{
				return x.value;
			}
		}
		// 插入节点
		public void put(Key key, Value value){
			root = put(root, key, value);
		}
		private Node put(Node x, Key key, Value value){
			if(x == null){
				return new Node(key, value, 1);
			}
			int cmp = key.compareTo(x.key);
			if(cmp < 0){
				x.left = put(x.left, key, value);
			}else if(cmp > 0){
				x.right = put(x.right, key, value);
			}else{
				x.value = value;
			}
			x.N = x.size(x.left) + x.size(x.right) + 1;
			return x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
