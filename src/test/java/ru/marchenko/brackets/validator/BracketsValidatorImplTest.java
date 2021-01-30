package ru.marchenko.brackets.validator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Created by Vladislav Marchenko on 30.01.2021
 */
public class BracketsValidatorImplTest {

    /**
     * brackets validator
     */
    private final static BracketsValidator bracketsValidator = new BracketsValidatorImpl();

    /**
     * test sequence with correct brackets
     */
    private final static String SEQUENCE_WITH_CORRECT_BRACKETS_1 = "()";

    /**
     * test sequence with correct brackets
     */
    private final static String SEQUENCE_WITH_CORRECT_BRACKETS_2 = "{}()[]";

    /**
     * test sequence with correct brackets
     */
    private final static String SEQUENCE_WITH_CORRECT_BRACKETS_3 = "{()}[](){}";

    /**
     * test sequence with correct brackets
     */
    private final static String SEQUENCE_WITH_CORRECT_BRACKETS_4 = "hello{}[]()";

    /**
     * test sequence with correct brackets
     */
    private final static String SEQUENCE_WITH_CORRECT_BRACKETS_5 = "((1 + 2) * 3) + 5 * [45 - 35]";

    /**
     * test sequence with incorrect brackets
     */
    private final static String SEQUENCE_WITH_INCORRECT_BRACKETS_1 = "())";

    /**
     * test sequence with incorrect brackets
     */
    private final static String SEQUENCE_WITH_INCORRECT_BRACKETS_2 = "{(}";

    /**
     * test sequence with incorrect brackets
     */
    private final static String SEQUENCE_WITH_INCORRECT_BRACKETS_3 = "hello)))";

    /**
     * test sequence with incorrect brackets
     */
    private final static String SEQUENCE_WITH_INCORRECT_BRACKETS_4 = "{1 + 2})";

    /**
     * test sequence with incorrect brackets
     */
    private final static String SEQUENCE_WITH_INCORRECT_BRACKETS_5 = "]]]][[][[[";

    @Test
    public void validateSequenceWithCorrectBrackets() {
        Assert.assertTrue(bracketsValidator.validate(SEQUENCE_WITH_CORRECT_BRACKETS_1));
        Assert.assertTrue(bracketsValidator.validate(SEQUENCE_WITH_CORRECT_BRACKETS_2));
        Assert.assertTrue(bracketsValidator.validate(SEQUENCE_WITH_CORRECT_BRACKETS_3));
        Assert.assertTrue(bracketsValidator.validate(SEQUENCE_WITH_CORRECT_BRACKETS_4));
        Assert.assertTrue(bracketsValidator.validate(SEQUENCE_WITH_CORRECT_BRACKETS_5));
    }

    @Test
    public void validateSequenceWithIncorrectBrackets() {
        Assert.assertFalse(bracketsValidator.validate(SEQUENCE_WITH_INCORRECT_BRACKETS_1));
        Assert.assertFalse(bracketsValidator.validate(SEQUENCE_WITH_INCORRECT_BRACKETS_2));
        Assert.assertFalse(bracketsValidator.validate(SEQUENCE_WITH_INCORRECT_BRACKETS_3));
        Assert.assertFalse(bracketsValidator.validate(SEQUENCE_WITH_INCORRECT_BRACKETS_4));
        Assert.assertFalse(bracketsValidator.validate(SEQUENCE_WITH_INCORRECT_BRACKETS_5));
    }
}