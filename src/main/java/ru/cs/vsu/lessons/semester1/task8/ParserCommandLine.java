package ru.cs.vsu.lessons.semester1.task8;

public class ParserCommandLine {

    /**
     * @param args параметры командной строки
     * @return информация о файлах
     */
    public static FileInfo parseLine(String[] args) {
        FileInfo fileInfo = new FileInfo();
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-i")) {
                fileInfo.setInputPath(args[i + 1]);
            } else if (args[i].equals("-o")) {
                fileInfo.setOutputPath(args[i + 1]);
            }
        }
        return fileInfo;
    }
}
