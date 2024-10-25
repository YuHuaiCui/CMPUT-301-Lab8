package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    // test hasCity
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = mockCity();
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    // test deleteCity
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = mockCity();
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

}
