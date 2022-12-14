package ru.cs.vsu.lessons.task8;

public class Main {
    public static void main(String[] args) {
        try {
            FileInfo fileInfo = ParserCommandLine.parseLine(args);
            int[][] matrix = FileWorker.readFile(fileInfo.getInputPath());
            // далее выполняем преобразования над матрицей по условию задачи
            printMatrix(matrix);
            FileWorker.writeToFile(fileInfo.getOutputPath(), matrix);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
