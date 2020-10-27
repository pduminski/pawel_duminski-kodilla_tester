package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test
    public void shouldFindExistingOrder() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        // when order is added
        warehouse.addOrder(new Order("Order66"));
        // then
        Order expectedOrder = new Order("Order66");
        assertEquals(expectedOrder, warehouse.getOrder("Order66"));
    }

    @Test(expected = OrderDoesntExistException.class)
    public void shouldThrowOrderDoesntExistExceptionIfOrderNotFound() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        // when order is added
        warehouse.addOrder(new Order("401201"));
        // then incorrect order is searched
        assertEquals(null, warehouse.getOrder("401200"));
    }
}