package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillMachineTest {

    @Test
    public void shouldGiveZeroCostWhenNoItemsPresentInTheShoppingBasket() {
        BillMachine billMachine = new BillMachine("");

        assertEquals(0.0, billMachine.getTotalCost(), 0.2d);
    }

    @Test
    public void shouldGivePriceOfTheItemWhichIsNonImportedBookWithOutSalesTax() {
        BillMachine billMachine = new BillMachine("1 book at 12.49");

        assertEquals(12.49, billMachine.getTotalCost(), 0.2d);

    }
}
