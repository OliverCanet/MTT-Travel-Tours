package com.mtt.travel.dtos;

import com.mtt.travel.models.Tour;

public class TourDTO {

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

    public TourDTO(Tour tour) {
        this.id = tour.getId();
        this.name = tour.getName();
        this.price = tour.getPrice();
        this.shortDesc = tour.getShortDesc();
        this.title = tour.getTitle();
        this.country = tour.getCountry();
        this.continent = tour.getContinent();
        this.isActive = tour.getActive();
        this.image = tour.getImage();
        this.image2 = tour.getImage2();
        this.image3 = tour.getImage3();
        this.image4 = tour.getImage4();
        this.itinerary = tour.getItinerary();
        this.longDesc1 = tour.getLongDesc1();
        this.longDesc2 = tour.getLongDesc2();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    public String getContinent() {
        return continent;
    }

    public Boolean getActive() {
        return isActive;
    }

    public String getImage() {
        return image;
    }

    public String getImage2() {
        return image2;
    }

    public String getImage3() {
        return image3;
    }

    public String getImage4() {
        return image4;
    }

    public String getItinerary() {
        return itinerary;
    }

    public String getLongDesc1() {
        return longDesc1;
    }

    public String getLongDesc2() {
        return longDesc2;
    }


}
