package com.kazimasum.firebasefragment;

public class model
{
String course, name, email, url;
public model(){

}

    public model(String course, String name, String email, String url) {
        this.course = course;
        this.name = name;
        this.email = email;
        this.url = url;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
