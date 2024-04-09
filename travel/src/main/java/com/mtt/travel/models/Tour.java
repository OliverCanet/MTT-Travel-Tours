package com.mtt.travel.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Tour {

    @Id
    @GeneratedValue
    @GenericGenerator(name="native", strategy = "native")
    private long id;

    private String name;

    private double price;

    private String shortDesc;

    private String title;

    private String country;

    private String continent;

    private Boolean isActive;

    private String image;

    private String image2;

    private String image3;

    private String image4;

    private String itinerary;

    private String longDesc1;
    private String longDesc2;


    public Tour() {
    }

    public Tour(String name, double price, String shortDesc, String title, String country, String continent, Boolean isActive, String image, String image2, String image3, String image4, String itinerary, String longDesc1, String longDesc2) {
        this.name = name;
        this.price = price;
        this.shortDesc = shortDesc;
        this.title = title;
        this.country = country;
        this.continent = continent;
        this.isActive = isActive;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.itinerary = itinerary;
        this.longDesc1 = longDesc1;
        this.longDesc2 = longDesc2;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    public String getLongDesc1() {
        return longDesc1;
    }

    public void setLongDesc1(String longDesc1) {
        this.longDesc1 = longDesc1;
    }

    public String getLongDesc2() {
        return longDesc2;
    }

    public void setLongDesc2(String longDesc2) {
        this.longDesc2 = longDesc2;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", title=" + title +
                ", longDesc='" + shortDesc + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}


