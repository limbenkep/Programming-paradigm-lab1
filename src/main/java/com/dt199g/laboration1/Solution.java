package com.dt199g.laboration1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.*;

/**
 * @author Lima Honorine (holi1900)
 */

/**
 * Pseudocode
 * 1. fileReaderVariable <- Initialize a fileReader
 * 2. container <- Initialize a container
 * 3. while not End of file
 * 4.   readline
 * 5.   add line to container
 * 6. count = 0
 * 7. while count is not greater than the size of containerVariable
 * 8.   print line in container at index = count, count + 1, count + 3
 * 9.   increment count by 6
 */
public class Solution {

    /**
     * Uses imperative programming style to
     * Reads data from file, extract Customer ID, Name, Phone information
     * and print to console
     */
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
                System.out.printf("%s %n%s %n%s%n", lines.get(count), lines.get(count + 1), lines.get(count + 3));
                count += 6;
            }
        }
    }

    /**
     * Uses declarative programming style to
     * Reads data from file, filter Customer ID, Name, Phone information
     * and print to console
     */
    private void declarativeSolution() {
        new BufferedReader(new InputStreamReader(Objects.requireNonNull(
                this.getClass().getResourceAsStream("/customers.txt"))))
                .lines()
                .filter(s -> s.matches("(^Customer ID: \\d{3})|(^Name: \\w+\\s\\w+)|(^Phone: \\d{3}-\\d{3}-\\d{4})"))
                .forEach(System.out::println);
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
