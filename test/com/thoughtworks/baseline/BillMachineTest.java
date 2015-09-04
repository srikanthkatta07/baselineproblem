package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillMachineTest {

    @Test
    public void shouldGiveZeroCostWhenNoItemsPresentInTheShoppingBasket() {
        BillMachine billMachine = new BillMachine("");

        assertEquals(0.0, billMachine.getTotalCost(0), 0.2d);
    }

    @Test
    public void shouldGivePriceOfTheItemWhichIsNonImportedBasicNeedItemWithOutSalesTax() {
        BillMachine billMachine = new BillMachine("1 book at 12.49");

        assertEquals(12.49, billMachine.getTotalCost(0), 0.2d);

    }

    @Test
    public void shouldGivePriceOfTheItemsWhenThoseAreNonImportedBasicNeedItemsPWithOutSalesTax() {
        BillMachine billMachine = new BillMachine("1 book at 12");
        BillMachine billMachine1=new BillMachine("1 packet of headache pills at 10");
        assertEquals(22, billMachine1.getTotalCost(billMachine.getTotalCost(0)), 0.2d);

    }
}
