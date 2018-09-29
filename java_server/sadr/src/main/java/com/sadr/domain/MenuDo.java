package com.sadr.domain;

import java.util.List;

public class MenuDo {
    private Integer id;

    private String bigName;

    private String bigTitle;

    private String icon;
    
    private List<MenuSmall> list;

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

	public List<MenuSmall> getList() {
		return list;
	}

	public void setList(List<MenuSmall> list) {
		this.list = list;
	}
}