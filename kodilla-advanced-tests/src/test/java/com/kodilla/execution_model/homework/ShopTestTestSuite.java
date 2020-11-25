package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestTestSuite {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Shop shop = new Shop();
    Order games = new Order(230.00, dateFormat.parse("15/10/2020"), "bananaBBB");
    Order computer = new Order(5900.50, dateFormat.parse("10/11/2019"), "userTerra");
    Order xbox = new Order(999.99, dateFormat.parse("09/01/2018"), "xboxplayer");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(games);
        shop.addOrder(computer);
        shop.addOrder(xbox);
    }

    @Test
    public void shouldReturnCorrectAmountOfOrdersAfterCreatingNewOne() throws ParseException{
        // given 3 orders are present by default
        assertEquals(3, shop.returnOrdersAmount());

        // when new order is added
        shop.addOrder(new Order(800.00, dateFormat.parse("10/10/2020"), "PSPPlayer"));

        // then Set of Orders should increase by one
        int result = shop.returnOrdersAmount();
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnOnlyOrdersWhichAreNotOlderThanTwoYears() {
        // when method returning orders from last 2 years is used
        Set<Order> result = shop.ordersFromLastTwoYears();

        Set<Order> expectedSet = new HashSet<>();
        expectedSet.add(games);
        expectedSet.add(computer);

        // then expected Set is the same as the return value of the method
        assertEquals(expectedSet, result);
    }

    @Test
    public void shouldCalculateValueForAllPresentOrders() {
        // when calculation for all orders is done
        double expected = xbox.getOrderValue() + games.getOrderValue() + computer.getOrderValue();
        double result = shop.returnValueForAllOrders();

        // then value for all default orders should be calculated correctly
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void shouldReturnOrdersWhichAreBetweenHighestAndLowestProvidedOrderValue() {
        // when boundries are provided
        Set<Order> result = shop.returnOrdersWhichAreBetweenBoundriesOfLowestAndHighestOrderValue(800.00, 6000.00);

        Set<Order> expected = new HashSet<>();
        expected.add(computer);
        expected.add(xbox);

        // then expected set is correct with actual one
        assertEquals(expected, result);

    }

    ShopTestTestSuite() throws ParseException {
    }
}