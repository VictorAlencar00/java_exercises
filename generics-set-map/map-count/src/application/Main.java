package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> candidates = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int votes = Integer.parseInt(parts[1]);
//                candidates.compute(name,(storedName, storedVotes) -> (storedVotes == null)? votes : storedVotes + votes );
                candidates.merge(name, votes, Integer::sum);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(String key: candidates.keySet()) {
            System.out.println(key + " : " + candidates.get(key));
        }
    }
}