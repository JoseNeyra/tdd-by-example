package com.tddlearning;

/**
 * Created by jose- on 8/21/2021
 **/

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
