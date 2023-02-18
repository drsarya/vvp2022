package ru.cs.vsu.lessons.semester1.task8;

/**
 * Содержит информацию о путях к входному и выходному полям
 */
public class FileInfo {
    private String inputPath;
    private String outputPath;

    public FileInfo() {
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public String getInputPath() {
        return inputPath;
    }

    public String getOutputPath() {
        return outputPath;
    }
}
