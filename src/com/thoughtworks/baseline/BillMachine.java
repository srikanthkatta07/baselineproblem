//It should return total cost of the items
package com.thoughtworks.baseline;

public class BillMachine {

    private String statement;

    public BillMachine(String statement) {
        this.statement = statement;
    }

    public double getTotalCost() {
        String[] receipt = statement.split(" ");
        if (receipt[0] != "") {
            int numberOfItems = Integer.parseInt(receipt[0]);
            String itemName = receipt[1];
            Double itemPrice = Double.parseDouble(receipt[3]);
            return itemPrice;
        }
        return 0.0;
    }
}
