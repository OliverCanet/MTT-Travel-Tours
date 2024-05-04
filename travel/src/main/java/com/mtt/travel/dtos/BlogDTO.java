package com.mtt.travel.dtos;

import com.mtt.travel.models.Blog;

import java.sql.Clob;

public class BlogDTO {

    private long id;
    private String titleMain;

    private String imageMain;

    private Boolean isActive;

    private String date;

    private String author;

    private String category;

    private String title1;
    private String content1;
    private String image1;

    private String title2;
    private String content2;
    private String image2;

    private String title3;
    private String content3;
    private String image3;

    private String title4;
    private String content4;
    private String image4;

    private String title5;
    private String content5;
    private String image5;

    private String title6;
    private String content6;
    private String image6;

    private String title7;
    private String content7;
    private String image7;

    public BlogDTO() {
    }

    public BlogDTO(Blog blog) {
        this.id = blog.getId();
        this.titleMain = blog.getTitleMain();
        this.imageMain = blog.getImageMain();
        this.isActive = blog.getActive();
        this.date = blog.getDate();
        this.author = blog.getAuthor();
        this.category = blog.getCategory();
        this.title1 = blog.getTitle1();
        this.content1 = blog.getContent1();
        this.image1 = blog.getImage1();
        this.title2 = blog.getTitle2();
        this.content2 = blog.getContent2();
        this.image2 = blog.getImage2();
        this.title3 = blog.getTitle3();
        this.content3 = blog.getContent3();
        this.image3 = blog.getImage3();
        this.title4 = blog.getTitle4();
        this.content4 = blog.getContent4();
        this.image4 = blog.getImage4();
        this.title5 = blog.getTitle5();
        this.content5 = blog.getContent5();
        this.image5 = blog.getImage5();
        this.title6 = blog.getTitle6();
        this.content6 = blog.getContent6();
        this.image6 = blog.getImage6();
        this.title7 = blog.getTitle7();
        this.content7 = blog.getContent7();
        this.image7 = blog.getImage7();
    }


    public long getId() {
        return id;
    }

    public String getTitleMain() {
        return titleMain;
    }

    public String getImageMain() {
        return imageMain;
    }

    public Boolean getActive() {
        return isActive;
    }

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle1() {
        return title1;
    }

    public String getContent1() {
        return content1;
    }

    public String getImage1() {
        return image1;
    }

    public String getTitle2() {
        return title2;
    }

    public String getContent2() {
        return content2;
    }

    public String getImage2() {
        return image2;
    }

    public String getTitle3() {
        return title3;
    }

    public String getContent3() {
        return content3;
    }

    public String getImage3() {
        return image3;
    }

    public String getTitle4() {
        return title4;
    }

    public String getContent4() {
        return content4;
    }

    public String getImage4() {
        return image4;
    }

    public String getTitle5() {
        return title5;
    }

    public String getContent5() {
        return content5;
    }

    public String getImage5() {
        return image5;
    }

    public String getTitle6() {
        return title6;
    }

    public String getContent6() {
        return content6;
    }

    public String getImage6() {
        return image6;
    }

    public String getTitle7() {
        return title7;
    }

    public String getContent7() {
        return content7;
    }

    public String getImage7() {
        return image7;
    }
}
