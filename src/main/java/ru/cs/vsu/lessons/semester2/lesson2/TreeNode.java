package ru.cs.vsu.lessons.semester2.lesson2;

public class TreeNode {

    public Integer value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public int countChildren() {
        if (left != null && right != null) {
            return 2;
        } else if (left == null && right == null) {
            return 0;
        }
        return 1;
    }
}
