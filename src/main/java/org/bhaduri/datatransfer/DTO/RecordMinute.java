/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.datatransfer.DTO;

import java.util.Date;

/**
 *
 * @author sb
 */
public class RecordMinute {
    private String scripID;
    private Date lastUpdateTime;
    private Double openprice;
    private Double daylastprice;
    private Double dayhighprice;
    private Double daylowprice;
    private Double prevcloseprice;
    private Double totaltradedvolume;

    public String getScripID() {
        return scripID;
    }

    public void setScripID(String scripID) {
        this.scripID = scripID;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Double getOpenprice() {
        return openprice;
    }

    public void setOpenprice(Double openprice) {
        this.openprice = openprice;
    }

    public Double getDaylastprice() {
        return daylastprice;
    }

    public void setDaylastprice(Double daylastprice) {
        this.daylastprice = daylastprice;
    }

    public Double getDayhighprice() {
        return dayhighprice;
    }

    public void setDayhighprice(Double dayhighprice) {
        this.dayhighprice = dayhighprice;
    }

    public Double getDaylowprice() {
        return daylowprice;
    }

    public void setDaylowprice(Double daylowprice) {
        this.daylowprice = daylowprice;
    }

    public Double getPrevcloseprice() {
        return prevcloseprice;
    }

    public void setPrevcloseprice(Double prevcloseprice) {
        this.prevcloseprice = prevcloseprice;
    }

    public Double getTotaltradedvolume() {
        return totaltradedvolume;
    }

    public void setTotaltradedvolume(Double totaltradedvolume) {
        this.totaltradedvolume = totaltradedvolume;
    }

}

