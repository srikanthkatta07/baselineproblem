//It should return total cost of the items
package com.thoughtworks.baseline;

import java.util.*;

public class BillMachine {

    private String statement;
    private double totalCost;
    List<String> basicItems = Arrays.asList("book", "packet of headache pills", "box of chocolates");
    List<String> NonbasicItems = Arrays.asList("Music CD");

    public BillMachine(String statement) {
        this.statement = statement;
    }

    public double getTotalCost(double totalCost) {
        String[] receipt = statement.split(" ");
        this.totalCost = totalCost;
        if (statement.contains("imported")) {
            Double itemPrice = Double.parseDouble(receipt[receipt.length - 1]);
            return totalCost + itemPrice + ((itemPrice * 5) / 100);
        }
        if ((isContain()).equals("BasicItem")) {
            int numberOfItems = Integer.parseInt(receipt[0]);
            String itemName = receipt[1];
            Double itemPrice = Double.parseDouble(receipt[receipt.length - 1]);
            return totalCost + itemPrice;
        }
        if ((isContain()).equals("NonBasicItem")) {
            Double itemPrice = Double.parseDouble(receipt[receipt.length - 1]);
            return totalCost + itemPrice + ((itemPrice * 10) / 100);
        }
        return 0.0;
    }

    public String isContain() {
        for (String item : basicItems) {
            if (statement.contains(item))
                return "BasicItem";
        }
        if (statement != "") {
            return "NonBasicItem";
        }
        return "EmptyString";
    }
}
