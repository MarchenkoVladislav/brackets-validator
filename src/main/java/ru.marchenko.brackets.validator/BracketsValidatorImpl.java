package ru.marchenko.brackets.validator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author Created by Vladislav Marchenko on 30.01.2021
 */
public class BracketsValidatorImpl implements BracketsValidator {
    /**
     * List that contains opening brackets of all types
     */
    private final static List<Character> openingBrackets = List.of('{', '(', '[');

    /**
     * List that contains closing brackets of all types
     */
    private final static List<Character> closingBrackets = List.of('}', ')', ']');

    public boolean validate(String sequence) {
        // deque, in which in which we add encountered opening brackets
        Deque<Character> openingBracketsInSequence = new ArrayDeque<>();

        // loop for each char of input sequence
        for (char c : sequence.toCharArray()) {

            // if the current char is an opening bracket then add it in our deque
            if (openingBrackets.contains(c)) openingBracketsInSequence.addLast(c);

                // if the current char is not a bracket then continue
            else if (!closingBrackets.contains(c)) continue;

                // if the current char is a closing bracket
            else {
                // if there was no opening bracket before the closing bracket, then return false
                if (openingBracketsInSequence.isEmpty()) return false;

                // pop the last opening bracket from deque
                char lastOpeningBracket = openingBracketsInSequence.pollLast();

                // if the open bracket does not match the closing bracket, then return false
                if (openingBrackets.indexOf(lastOpeningBracket) != closingBrackets.indexOf(c)) return false;
            }
        }

        // check that for each opening bracket there was a desired closing
        return openingBracketsInSequence.size() == 0;
    }
}
