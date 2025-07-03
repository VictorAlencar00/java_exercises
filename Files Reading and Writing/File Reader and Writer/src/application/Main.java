package application;

import entitites.Product;
import entitites.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static String out;

    public static void main(String[] args) {

        String in = ("C:\\Test\\in.txt");
        String out = ("C:\\Test\\out.csv");
        List<Item> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(in))) {
            String line = br.readLine();
            while (line != null) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(out))) {

                    String[] productEnter = line.split(",");

                    String name = productEnter[0];
                    double price = Double.parseDouble(productEnter[1]);
                    int amount = Integer.parseInt(productEnter[2]);

                    Product product = new Product(name, price);
                    Item item = new Item(product, amount);
                    items.add(item);

                    bw.write(String.valueOf(item));
                    bw.newLine();
                } catch (IOException e) {
                    System.out.println(e);
                }
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
