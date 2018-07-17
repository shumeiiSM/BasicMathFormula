package com.example.a17010233.basicmathformula;

/**
 * Created by 17010233 on 17/7/2018.
 */

public class FormulaName {
    private String name;
    private String forumla;
    private String area;

    public FormulaName(String name, String forumla, String area) {
        this.name = name;
        this.forumla = forumla;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForumla() {
        return forumla;
    }

    public void setForumla(String forumla) {
        this.forumla = forumla;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "FormulaName{" +
                "name='" + name + '\'' +
                ", forumla='" + forumla + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}