package ru.marchenko.brackets.validator;

/**
 * @author Created by Vladislav Marchenko on 30.01.2021
 */
public interface BracketsValidator {
    /**
     * Validate brackets in input sequence
     *
     * @param sequence input sequence
     * @return true if brackets are placed correctly
     * else return false
     */
    boolean validate(String sequence);
}
