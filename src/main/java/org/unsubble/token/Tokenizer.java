package org.unsubble.token;

import org.unsubble.keyword.Keyword;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    public static List<Token> getTokens(String line) {
        List<Token> tokens = new ArrayList<>();
        String[] words = line.split("\\s");
        for (String word : words) {
            
        }
        return tokens;
    }

    public static List<Keyword> getKeywords(String line) {
        List<Keyword> keywords = new ArrayList<>();
        for (Token token : getTokens(line)) {
            //TODO
        }
        return keywords;
    }
}
