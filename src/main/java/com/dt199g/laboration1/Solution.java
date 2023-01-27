package com.dt199g.laboration1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.*;

/**
 * @author Lima Honorine (holi1900)
 */


public class Solution {
    private void imperativeSolution() {
        List<String> lines = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(Objects.requireNonNull(
                                this.getClass().getResourceAsStream("/customers.txt"))))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!lines.isEmpty()){
            int count = 0;
            while(count<lines.size()){
                //System.out.println(lines.get(count) + lines.get(count + 1) + lines.get(count + 3));
                System.out.printf("%s %n%s %n%s%n", lines.get(count), lines.get(count + 1), lines.get(count + 3));
                count += 6;
            }
        }
    }

    private void declarativeSolution() {
        final String regex = "(^Customer ID: \\d{3})|(^Name: \\w+\\s\\w+)|(^Phone: \\d{3}-\\d{3}-\\d{4})";
        BufferedReader in = new BufferedReader(new InputStreamReader(Objects.requireNonNull(
                this.getClass().getResourceAsStream("/customers.txt"))));
        in.lines().filter(s -> s.matches(regex)).forEach(System.out::println);
        //Files.lines(Paths.get("/", "customers.txt")).filter(s -> s.matches(regex)).forEach(System.out::println);
    }

    /**
     * Main point of program entry.
     * MAY NOT BE MODIFIED!
     * @param args application arguments
     */
    public static void main(String... args) {
        Solution sol = new Solution();
        String line = "---------------------";

        System.out.printf("%s %n%s %n%s%n", line, "IMPERATIVE SOLUTION", line);
        sol.imperativeSolution();

        System.out.printf("%n%s %n%s %n%s%n", line, "DECLARATIVE SOLUTION", line);
        sol.declarativeSolution();
    }
}
