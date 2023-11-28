package org.unsubble.main;

import org.unsubble.keyword.Keyword;
import org.unsubble.token.Token;
import org.unsubble.token.Tokenizer;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class Cython {
    private final Path fromP;
    private final Path toP;
    private final List<String> lines;
    private final List<Keyword> keywordList;

    public Cython(Path from, Path to) {
        this.fromP = from;
        this.toP = to;
        lines = new ArrayList<>();
        keywordList = new ArrayList<>();
    }

    public Cython(String from, String to) {
        this(Paths.get(from), Paths.get(to));
    }

    private void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fromP.toFile()))) {
            while (reader.ready())
                lines.add(reader.readLine());
        } catch (IOException ignored) {
        }
    }

    public void writeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(toP.toFile()))) {
            for (Keyword code : keywordList) {
                //TODO
            }
        } catch (IOException ignored) {
        }
    }

    public void compile() {
        readFile();
        for (String line : lines) {
            keywordList.addAll(Tokenizer.getKeywords(line));
        }
        writeFile();
    }
}
