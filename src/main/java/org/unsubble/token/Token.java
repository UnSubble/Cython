package org.unsubble.token;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum Token {
    INT32,
    PRINTF,
    RETURN,
    SEMI;

    private static Set<Token> tokens;

    private static Set<Token> getAll() {
        if (tokens == null) {
            tokens = new HashSet<>();
            tokens.addAll(Arrays.asList(values()));
        }
        return tokens;
    }
}
