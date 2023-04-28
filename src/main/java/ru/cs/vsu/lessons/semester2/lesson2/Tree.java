package ru.cs.vsu.lessons.semester2.lesson2;

public class Tree {
    private TreeNode root;

    public void add(Integer value) {
        TreeNode newNode = new TreeNode(value);
        TreeNode node = root;
        TreeNode parent;
        while (node != null) {
            parent = node;
            if (node.value < value) {
                node = node.left;
                if (node == null) {
                    parent.left = newNode;
                }
            } else {
                node = node.right;
                if (node == null) {
                    parent.right = newNode;
                }
            }
        }
    }

    public void remove(Integer value) {
        TreeNode node = root;
        TreeNode parent = root;
        boolean isLeft = true;
        while (node != null && node.value != value) {
            parent = node;
            if (node.value >= value) {
                node = node.right;
                isLeft = false;
            } else {
                node = node.left;
                isLeft = true;
            }
        }
        if (node != null) {
            int i = node.countChildren();
            switch (i) {
                case 0: {
                    if (isLeft) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
                case 1: {
                    if (node.left != null) {
                        if (isLeft) {
                            parent.left = node.left;
                        } else {
                            parent.right = node.left;
                        }
                    } else if (node.right != null) {
                        if (isLeft) {
                            parent.left = node.right;
                        } else {
                            parent.right = node.right;
                        }
                    }
                }
                case 2: {
                }
            }
        }
    }

    public TreeNode find(Integer value) {
        TreeNode node = root;
        while (node != null && node.value != value) {
            if (node.value >= value) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return node;
    }

    // (inorder)
    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }
    // postOrder
    private void postOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            inOrder(node.right);
            System.out.print(node.value + " ");
        }
    }
    // preorder
    private void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }
}
