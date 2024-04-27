package com.mtt.travel.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Clob;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    @GenericGenerator(name="native", strategy = "native")
    private long id;

    private String titleMain;


    private String imageMain;

    private Boolean isActive;

    private String date;

    private String author;

    private String category;

    private String title1;
    @Lob
    private String content1;
    private String image1;

    private String title2;
    @Lob
    private String content2;
    private String image2;

    private String title3;
    @Lob
    private String content3;
    private String image3;

    private String title4;
    @Lob
    private String content4;
    private String image4;

    private String title5;
    @Lob
    private String content5;
    private String image5;

    private String title6;
    @Lob
    private String content6;
    private String image6;

    private String title7;
    @Lob
    private String content7;
    private String image7;

    public Blog() {
    }

    public Blog(String titleMain, String imageMain, Boolean isActive, String date, String author, String category, String title1, String content1, String image1, String title2, String content2, String image2, String title3, String content3, String image3, String title4, String content4, String image4, String title5, String content5, String image5, String title6, String content6, String image6, String title7, String content7, String image7) {
        this.titleMain = titleMain;
        this.imageMain = imageMain;
        this.isActive = isActive;
        this.date = date;
        this.author = author;
        this.category = category;
        this.title1 = title1;
        this.content1 = content1;
        this.image1 = image1;
        this.title2 = title2;
        this.content2 = content2;
        this.image2 = image2;
        this.title3 = title3;
        this.content3 = content3;
        this.image3 = image3;
        this.title4 = title4;
        this.content4 = content4;
        this.image4 = image4;
        this.title5 = title5;
        this.content5 = content5;
        this.image5 = image5;
        this.title6 = title6;
        this.content6 = content6;
        this.image6 = image6;
        this.title7 = title7;
        this.content7 = content7;
        this.image7 = image7;
    }

    public long getId() {
        return id;
    }


    public String getTitleMain() {
        return titleMain;
    }

    public void setTitleMain(String titleMain) {
        this.titleMain = titleMain;
    }

    public String getImageMain() {
        return imageMain;
    }

    public void setImageMain(String imageMain) {
        this.imageMain = imageMain;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getContent3() {
        return content3;
    }

    public void setContent3(String content3) {
        this.content3 = content3;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getTitle4() {
        return title4;
    }

    public void setTitle4(String title4) {
        this.title4 = title4;
    }

    public String getContent4() {
        return content4;
    }

    public void setContent4(String content4) {
        this.content4 = content4;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getTitle5() {
        return title5;
    }

    public void setTitle5(String title5) {
        this.title5 = title5;
    }

    public String getContent5() {
        return content5;
    }

    public void setContent5(String content5) {
        this.content5 = content5;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public String getTitle6() {
        return title6;
    }

    public void setTitle6(String title6) {
        this.title6 = title6;
    }

    public String getContent6() {
        return content6;
    }

    public void setContent6(String content6) {
        this.content6 = content6;
    }

    public String getImage6() {
        return image6;
    }

    public void setImage6(String image6) {
        this.image6 = image6;
    }

    public String getTitle7() {
        return title7;
    }

    public void setTitle7(String title7) {
        this.title7 = title7;
    }

    public String getContent7() {
        return content7;
    }

    public void setContent7(String content7) {
        this.content7 = content7;
    }

    public String getImage7() {
        return image7;
    }

    public void setImage7(String image7) {
        this.image7 = image7;
    }
}
