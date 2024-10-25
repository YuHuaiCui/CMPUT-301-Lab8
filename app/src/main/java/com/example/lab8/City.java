package com.example.lab8;

public class City {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City city = (City) obj;
        return this.city.equals(city.city) && this.province.equals(city.province);
    }

    @Override
    public int hashCode() {
        return this.city.hashCode() + this.province.hashCode();
    }
}
