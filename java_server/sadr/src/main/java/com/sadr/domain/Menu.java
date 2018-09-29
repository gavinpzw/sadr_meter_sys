package com.sadr.domain;

public class Menu {
    private Integer id;

    private String bigName;

    private String bigTitle;

    private String icon;

    private String smallTitle;

    private String smallName;

    private String jump;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigName() {
        return bigName;
    }

    public void setBigName(String bigName) {
        this.bigName = bigName == null ? null : bigName.trim();
    }

    public String getBigTitle() {
        return bigTitle;
    }

    public void setBigTitle(String bigTitle) {
        this.bigTitle = bigTitle == null ? null : bigTitle.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getSmallTitle() {
        return smallTitle;
    }

    public void setSmallTitle(String smallTitle) {
        this.smallTitle = smallTitle == null ? null : smallTitle.trim();
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName == null ? null : smallName.trim();
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump == null ? null : jump.trim();
    }
}