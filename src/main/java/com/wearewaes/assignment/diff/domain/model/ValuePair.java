package com.wearewaes.assignment.diff.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class abstracts a tuple of two values
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValuePair {
    private String leftValue;
    private String rightValue;

    public boolean haveDifferentSize() {
        return leftValue.length() != rightValue.length();
    }

    public boolean areEqual() {
        return leftValue.equals(rightValue);
    }
}
