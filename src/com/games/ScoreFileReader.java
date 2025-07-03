package com.games;
import java.io.*;
import java.util.*;

public class ScoreFileReader {
    public static void displayLeaderBoard() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));
        Map<String, Integer> scoreMap = new HashMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String name = parts[0];
                int score = Integer.parseInt(parts[1]);

                // Keep the highest score if the player appears multiple times
                if (!scoreMap.containsKey(name) || score > scoreMap.get(name)) {
                    scoreMap.put(name, score);
                }
            }
        }
        reader.close();

        // Sort entries by score descending
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(scoreMap.entrySet());
        sortedScores.sort((a, b) -> b.getValue() - a.getValue());

     
        System.out.println("\n=== Leaderboard ===");
        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedScores) {
            System.out.println(rank + ". " + entry.getKey() + " - " + entry.getValue());
            rank++;
        }
    }
}
