package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(8, 12, 10, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 2; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !uniqueNums.contains(nums.get(i))) {
                Collections.sort(nums);
                uniqueNums.add(nums.get(i));
            }
        }
        for (int num : uniqueNums) {
            System.out.println(num);
        }
    }

    public static void task3() {
        List<String> words = new ArrayList<>(List.of("Один", "Один", "Два", "Клетка", "Два", "Кроваво-черное ничто", "Связаны", "Связаны"));
        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            if (!uniqueWords.contains(words.get(i))) {
                uniqueWords.add(words.get(i));
            }
        }
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : wordCount.keySet()) {
            System.out.println(wordCount.get(word));
        }

    }

}