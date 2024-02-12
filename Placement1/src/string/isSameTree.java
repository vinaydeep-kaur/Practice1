package string;

public class isSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) {
			return false;
		}

		boolean left = isSameTree(p.left, q.left);
		if (!left) {
			return false;
		}
		boolean right = isSameTree(p.right, q.right);
		if (!right) {
			return false;
		}
		return left && right;
	}
}
