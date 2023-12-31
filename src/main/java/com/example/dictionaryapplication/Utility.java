package com.example.dictionaryapplication;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
// cái class này để lưu các biến. nhớ lưu đúng chỗ ko t đấm chết
public class Utility {
    public static final Map<String, Integer> charToInterger = createMapCharToInterger();
    public static final Map<Integer, String> intergerToString = createMapIntergerToChar();

    public static final Word error1 = new Word("ERROR! ", "THIS WORD DOES NOT EXIST!");

    private static Map<String, Integer> createMapCharToInterger() {
        Map<String, Integer> result = new HashMap<>();
        result.put("a", 1);
        result.put("b", 2);
        result.put("c", 3);
        result.put("d", 4);
        result.put("e", 5);
        result.put("f", 6);
        result.put("g", 7);
        result.put("h", 8);
        result.put("i", 9);
        result.put("j", 10);
        result.put("k", 11);
        result.put("l", 12);
        result.put("m", 13);
        result.put("n", 14);
        result.put("o", 15);
        result.put("p", 16);
        result.put("q", 17);
        result.put("r", 18);
        result.put("s", 19);
        result.put("t", 20);
        result.put("u", 21);
        result.put("v", 22);
        result.put("w", 23);
        result.put("x", 24);
        result.put("y", 25);
        result.put("z", 26);
        result.put(" ", 27);
        result.put("-", 28);
        result.put(".", 29);
        result.put("'", 30);
        result.put("é", 31);
        result.put("ê", 32);
        result.put("è", 33);
        result.put("ə", 34);
        result.put("à", 35);
        result.put("/", 36);
        result.put("â", 37);
        result.put("û", 38);
        result.put("(", 39);
        result.put(")", 40);
        result.put("ô", 41);
        result.put("Ã", 42);
        result.put(",", 43);
        result.put("ö", 44);
        result.put("À", 45);
        return Collections.unmodifiableMap(result);
    }
    private static Map<Integer, String> createMapIntergerToChar() {
        Map<Integer, String> result = new HashMap<>();
        result.put(1, "a");
        result.put(2, "b");
        result.put(3, "c");
        result.put(4, "d");
        result.put(5, "e");
        result.put(6, "f");
        result.put(7, "g");
        result.put(8, "h");
        result.put(9, "i");
        result.put(10, "j");
        result.put(11, "k");
        result.put(12, "l");
        result.put(13, "m");
        result.put(14, "n");
        result.put(15, "o");
        result.put(16, "p");
        result.put(17, "q");
        result.put(18, "r");
        result.put(19, "s");
        result.put(20, "t");
        result.put(21, "u");
        result.put(22, "v");
        result.put(23, "w");
        result.put(24, "x");
        result.put(25, "y");
        result.put(26, "z");
        result.put(27, " ");
        result.put(28, "-");
        result.put(29, ".");
        result.put(30, "'");
        result.put(31, "é");
        result.put(32, "ê");
        result.put(33, "è");
        result.put(34, "ə");
        result.put(35, "à");
        result.put(36, "/");
        result.put(37, "â");
        result.put(38, "û");
        result.put(39, "(");
        result.put(40, ")");
        result.put(41, "ô");
        result.put(42, "Ã");
        result.put(43, ",");
        result.put(44, "ö");
        result.put(45, "À");
        return Collections.unmodifiableMap(result);
    }
}
