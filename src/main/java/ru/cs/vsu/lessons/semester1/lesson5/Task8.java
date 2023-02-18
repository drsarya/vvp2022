package ru.cs.vsu.lessons.semester1.lesson5;

import org.junit.Assert;
import ru.cs.vsu.lessons.graph.Node;

public class Task8 {

    public static void main(String[] args) {
        //Выполним тестирование методов
        checkTests();

        //Способы объявления матриц
        int[][] matrix0 = new int[2][2];
        int[][] matrix1 = new int[2][];

        // matrix2: Матрицу подобного вида (с переменным количеством столбцов) сначала необходимо привести к прямоугольному виду,
        // как вариант: дополнить нулями
        int[][] matrix2 = new int[][]{{3, 2, 5}, {9, 11, 12, 15}, {6, 0, 5}, {7, 21}};
        int[][] matrix3 = new int[][]{{3, 2}, {9, 11}, {6, 0}, {7, 21}};

        printMatrix(matrix3);

        System.out.printf("\nУдалить столбец %d в матрице", 0);
        int[][] modifiedMatrix1 = deleteColumn(matrix3, 0);

        System.out.printf("\nУдалить строку %d в матрице", 0);
        int[][] modifiedMatrix2 = deleteRow(matrix3, 0);

        System.out.printf("\nПоменять местами строки матрицы %d и %d", 0, 1);
        int[][] modifiedMatrix3 = swapRows(matrix3, 0, 1);

        System.out.printf("\nПоменять местами столбцы матрицы %d и %d", 0, 1);
        int[][] modifiedMatrix4 = swapColumns(matrix3, 0, 1);

    }

    private static void checkTests() {
        Assert.assertThrows(IllegalArgumentException.class, () -> deleteColumn(new int[][]{}, -1));
        Assert.assertThrows(IllegalArgumentException.class, () -> deleteRow(new int[][]{}, 1));
        Assert.assertThrows(IllegalArgumentException.class, () -> swapRows(new int[][]{}, 1, -1));
        Assert.assertThrows(IllegalArgumentException.class, () -> swapColumns(new int[][]{}, 1, 0));

        Assert.assertArrayEquals(new int[][]{{2, 3}, {11, 9}, {0, 6}, {21, 7}}, swapColumns(new int[][]{{3, 2}, {9, 11}, {6, 0}, {7, 21}}, 1, 0));
        Assert.assertArrayEquals(new int[][]{{9, 11}, {3, 2}, {6, 0}, {7, 21}}, swapRows(new int[][]{{3, 2}, {9, 11}, {6, 0}, {7, 21}}, 1, 0));
        Assert.assertArrayEquals(new int[][]{{3, 2}, {6, 0}, {7, 21}}, deleteRow(new int[][]{{3, 2}, {9, 11}, {6, 0}, {7, 21}}, 1));
        Assert.assertArrayEquals(new int[][]{{3}, {9}, {6}, {7}}, deleteColumn(new int[][]{{3, 2}, {9, 11}, {6, 0}, {7, 21}}, 1));

    }

    /**
     * Распечатать матрицу
     *
     * @param matrix матрица
     */
    private static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Удалить столбец из матрицы
     *
     * @param matrix      матрица
     * @param columnIndex индекс столбца
     * @return модифицированная матрица
     */
    public static int[][] deleteColumn(int[][] matrix, int columnIndex) {
        if (matrix.length == 0 || columnIndex >= matrix[0].length || columnIndex < 0) {
            return new int[0][];
        }
        int[][] modMatrix = new int[matrix.length][matrix[0].length - 1];
        for (int col = 0, realCol = 0; col < matrix[0].length; col++, realCol++) {
            if (col == columnIndex) {
                realCol--;
                continue;
            }
            for (int row = 0; row < matrix.length && realCol < modMatrix[row].length; row++) {
                modMatrix[row][realCol] = matrix[row][col];
            }
        }
        printMatrix(modMatrix);
        return modMatrix;
    }

    public static Node[][] deleteColumn(Node[][] matrix, int columnIndex) {
        if (matrix.length == 0 || columnIndex < 0) {
            return new Node[0][];
        }
        int indForDelete = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j].column == columnIndex) {
                indForDelete = j;
                break;
            }
        }
        Node[][] modMatrix = new Node[matrix.length][matrix[0].length - 1];
        for (int col = 0, realCol = 0; col < matrix[0].length; col++, realCol++) {
            if (col == indForDelete) {
                realCol--;
                continue;
            }
            for (int row = 0; row < matrix.length && realCol < modMatrix[row].length; row++) {
                modMatrix[row][realCol] = matrix[row][col];
            }
        }
        return modMatrix;
    }

    /**
     * Удалить строку из матрицы
     *
     * @param matrix   матрица
     * @param indexRow индекс строки для удаления
     * @return модифицированная матрица
     */
    public static Node[][] deleteRow(Node[][] matrix, int indexRow) {
        if (indexRow < 0) {
            return new Node[0][];
        }
        Node[][] modMatrix = new Node[matrix.length - 1][matrix[0].length];
        int indForDelete = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0].row == indexRow) {
                indForDelete = i;
                break;
            }
        }
        for (int row = 0, realRow = 0; row < matrix.length; row++, realRow++) {
            if (row == indForDelete) {
                realRow--;
                continue;
            }
            for (int col = 0; col < matrix[0].length; col++) {
                modMatrix[realRow][col] = matrix[row][col];
            }
        }
        return modMatrix;
    }

    public static int[][] deleteRow(int[][] matrix, int indexRow) {
        if (indexRow >= matrix.length || indexRow < 0) {
            throw new IllegalArgumentException("Incorrect indexes for deleting");
        }
        int[][] modMatrix = new int[matrix.length - 1][matrix[0].length];

        // Подумайте над еще одним способом удаления строки
        for (int row = 0, realRow = 0; row < matrix.length; row++, realRow++) {
            if (row == indexRow) {
                realRow--;
                continue;
            }
            for (int col = 0; col < matrix[0].length; col++) {
                modMatrix[realRow][col] = matrix[row][col];
            }
        }
        return modMatrix;
    }

    /**
     * Поменять местами строки матрицы
     *
     * @param matrix         матрица
     * @param firstIndexRow  индекс строки
     * @param secondIndexRow индекс другой строки
     * @return модифицированная матрица
     */
    public static int[][] swapRows(int[][] matrix, int firstIndexRow, int secondIndexRow) {
        if ((firstIndexRow >= matrix.length || firstIndexRow < 0) || (secondIndexRow >= matrix.length || secondIndexRow < 0)) {
            throw new IllegalArgumentException("Incorrect indexes for swap");
        }
        int[][] copy = copyMatrix(matrix);
        // Подумайте над еще одним способом поменять строки местами
        for (int col = 0; col < matrix[0].length; col++) {
            int temp = matrix[firstIndexRow][col];
            copy[firstIndexRow][col] = matrix[secondIndexRow][col];
            copy[secondIndexRow][col] = temp;
        }
        printMatrix(copy);
        return copy;
    }


    /**
     * Поменять местами столбцы
     *
     * @param matrix         матрица
     * @param firstIndexCol  индекс столбца
     * @param secondIndexCol индекс другого столбца
     * @return модифицированная матрица
     */
    public static int[][] swapColumns(int[][] matrix, int firstIndexCol, int secondIndexCol) {
        if (matrix.length == 0 || (firstIndexCol >= matrix[0].length || firstIndexCol < 0) || (secondIndexCol >= matrix[0].length || secondIndexCol < 0)) {
            throw new IllegalArgumentException("Incorrect indexes for swap");
        }
        int[][] copy = copyMatrix(matrix);
        for (int row = 0; row < matrix.length; row++) {
            int temp = matrix[row][firstIndexCol];
            copy[row][firstIndexCol] = matrix[row][secondIndexCol];
            copy[row][secondIndexCol] = temp;
        }
        printMatrix(copy);
        return copy;
    }

    public static int[][] copyMatrix(int[][] matrix) {
        int[][] copyMatrix = new int[matrix.length][];
        for (int row = 0; row < matrix.length; row++) {
            copyMatrix[row] = matrix[row].clone();
        }
        return copyMatrix;
    }
}
