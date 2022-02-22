package com.him.utilities;

import com.github.javafaker.Faker;

public class Fake_Data {
    Faker faker = new Faker();

    String streetName = faker.address().streetName();
    String buildingNumber = faker.address().buildingNumber();
    String city = faker.address().cityName();
    String stateName = faker.address().state();
    String zipCode = faker.address().zipCodeByState(stateName);



}
