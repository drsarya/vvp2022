package ru.cs.vsu.lessons.task12;

public class Task12 {
    public static void main(String[] args) {
        //   int factorial = getFactorial(5);
        String s = "ABC";
        boolean[] visited = new boolean[s.length()];
        //  getUniqueCombinations(s, visited, "");
        getALlCombinations(s, "");
    }

    public static int getFactorial(int n) {
        System.out.println("Прямой вызов " + n);
        if (n == 0) {
            return 1;
        }
        int factorial = getFactorial(n - 1);
        System.out.println("Обратный вызов " + n);
        return n * factorial;
    }

    public static void getCombinationsWithUniqueValues(String value, boolean[] visited, String combination) {
        if (combination.length() == value.length()) {
            System.out.println(combination);
            return;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!visited[i]) {
                combination += value.charAt(i);
                visited[i] = true;
                getCombinationsWithUniqueValues(value, visited, combination);
                visited[i] = false;
                combination = combination.substring(0, combination.length() - 1);
            }
        }
    }

    public static void getALlCombinations(String value, String combination) {
        if (combination.length() == value.length()) {
            System.out.println(combination);
            return;
        }
        for (int i = 0; i < value.length(); i++) {
            combination += value.charAt(i);
            getALlCombinations(value, combination);
            combination = combination.substring(0, combination.length() - 1);
        }
    }
}
