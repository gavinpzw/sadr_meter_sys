package com.sadr.domain;

public class ElecMeters extends Base{
    private Integer id;

    private Integer idHub;

    private Integer idMeter;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdHub() {
        return idHub;
    }

    public void setIdHub(Integer idHub) {
        this.idHub = idHub;
    }

    public Integer getIdMeter() {
        return idMeter;
    }

    public void setIdMeter(Integer idMeter) {
        this.idMeter = idMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}