//It should return total cost of the items
package com.thoughtworks.baseline;

import java.util.*;

public class BillMachine {

    private String statement;
    private double totalCost;
    List<String> items = Arrays.asList("book", "packet of headache pills", "box of chocolates");

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
        if (isContain()) {
            int numberOfItems = Integer.parseInt(receipt[0]);
            String itemName = receipt[1];
            Double itemPrice = Double.parseDouble(receipt[receipt.length - 1]);
            return totalCost + itemPrice;
        }
        return 0.0;
    }

    public boolean isContain() {
        for (String item : items) {
            if (statement.contains(item))
                return true;
        }
        return false;
    }
}
