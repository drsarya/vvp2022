package ru.cs.vsu.lessons.task8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Содержит методы для работы с файлами
 */
public class FileWorker {

    /**
     * @param filePath путь к входному файлу
     * @return матрица, прочитанная из файла
     * @throws FileNotFoundException ошибка в случае отстутствия файла по пути filePath
     */
    public static int[][] readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        int countRows = scanner.nextInt();
        int countColumns = scanner.nextInt();

        int[][] matrix = new int[countRows][countColumns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    /**
     * @param filePath путь к выходному файлу
     * @param matrix   матрица для записи в файл
     * @throws IOException ошибки при работе с файлами
     */
    public static void writeToFile(String filePath, int[][] matrix) throws IOException {
        File file = new File(filePath);
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        // Создаём строковое отображение матрицы
        String matrixString = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixString += matrix[i][j];
                matrixString += " ";
            }
            matrixString += "\n";
        }
        // Записываем значение в файл
        fileOutputStream.write(matrixString.getBytes());
        fileOutputStream.close();
    }
}
