package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillMachineTest {

    @Test
    public void shouldGiveZeroCostWhenNoItemsPresentInTheShoppingBasket() {
        BillMachine billMachine = new BillMachine();

        assertEquals(0.0, billMachine.getTotalCost(), 0.2d);
    }
}
