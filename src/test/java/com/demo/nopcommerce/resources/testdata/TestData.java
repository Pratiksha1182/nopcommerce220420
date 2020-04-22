package com.demo.nopcommerce.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Login Data")
    public Object [][] getData(){
        return new Object[][]{
                {"pratikshap1182@gmail.com", "2810om"},
                {"abc123@gmail.com","12345"},
                {"pratiksha@yahoo.co.uk","a1b2c3d4"}
        };
    }

    @DataProvider(name = "Registration Data")
    public Object[][] getData1(){
        return new Object[][]{
                {"Taj", "Mahal", "1", "July", "1986", "abc@yahoomail.com", "Physio Care", "Tajmahal06", "Tajmahal06"}

        };
    }
}
