package com.games;
import java.io.*;
import java.util.Map;

public class ScoreFileWriter {
    public static void saveScoresToFile(Map<String, Integer> scores) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("scores.txt", true)); // append mode
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            writer.write(entry.getKey() + ":" + entry.getValue());
            writer.newLine();
        }
        writer.close();
    }
}
