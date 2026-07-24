package DAY25;

class SymmetricTree {
        public boolean isSymmetric(TreeNode root) {
            if (root == null)
                return true;

            return mirror(root.left, root.right);
        }

        public boolean mirror(TreeNode a, TreeNode b) {
            if (a == null && b == null)
                return true;

            if (a == null || b == null)
                return false;

            return a.val == b.val &&
                    mirror(a.left, b.right) &&
                    mirror(a.right, b.left);
        }
    }

}