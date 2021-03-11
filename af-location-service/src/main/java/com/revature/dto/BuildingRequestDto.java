package com.revature.dto;

public class BuildingRequestDto {

    private String city;
    private String street_address;
    private String zipCode;
    private int totalFloors;

    @Override
    public String toString() {

        return "BuildingRequestDto{" +
                "city='" + city + '\'' +
                ", street_address='" + street_address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", totalFloors=" + totalFloors +
                '}';
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getStreet_address() {

        return street_address;
    }

    public void setStreet_address(String street_address) {

        this.street_address = street_address;
    }

    public String getZipCode() {

        return zipCode;
    }

    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;
    }

    public int getTotalFloors() {

        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {

        this.totalFloors = totalFloors;
    }

    public BuildingRequestDto(String city, String street_address,
                              String zipCode, int totalFloors) {

        this.city = city;
        this.street_address = street_address;
        this.zipCode = zipCode;
        this.totalFloors = totalFloors;
    }

    public BuildingRequestDto() {

    }

}
