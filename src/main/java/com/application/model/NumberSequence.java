package com.application.model;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * Represents a number sequence.  Composition of
 * Integers
 */
@Data
public class NumberSequence {
    public List<Integer> sequence = Lists.newArrayList(-1, 1, 2, 3);
}
