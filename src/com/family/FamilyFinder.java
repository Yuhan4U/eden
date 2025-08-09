package com.family;

import java.io.*;
import java.util.Scanner;

public class FamilyFinder {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask for names
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your wife's name? ");
        String wifeName = input.nextLine();

        // Step 2: Write names to file

        FileWriter writer1 = new FileWriter("names.txt");

        writer1.write("Husband: " + name + "\n");
        writer1.write("Wife: " + wifeName + "\n");
        writer1.write(wifeName + " is the wife of " + name + "\n");
        writer1.close();

        // Step 3: Read from file
        System.out.println("\n📄 File content:");
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        if (line.equals("Husband: " + name)) {
            String wifeLine = reader.readLine(); // read next line
            if (wifeLine != null && wifeLine.startsWith("Wife: ")) {
                String wifeName1 = wifeLine.substring(6); // remove "Wife: "
                System.out.println(wifeName1 + " is the wife of " + name);
            }
        }
        reader.close();
        input.close();
  writer1.write(name);
  writer1.write( wifeName);
  writer1.write(wifeName + " is the wife of " + name );
    }
}
