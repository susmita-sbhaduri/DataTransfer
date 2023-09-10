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
public class ValidateSummary {
    private String scripID;
    private Date lastUpdateTime;
    private Double diffFromSelectedFrst;
    private Double daylastprice;
    private Double diffFromSelectedSec;    

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

    public Double getDiffFromSelectedFrst() {
        return diffFromSelectedFrst;
    }

    public void setDiffFromSelectedFrst(Double diffFromSelectedFrst) {
        this.diffFromSelectedFrst = diffFromSelectedFrst;
    }

    public Double getDaylastprice() {
        return daylastprice;
    }

    public void setDaylastprice(Double daylastprice) {
        this.daylastprice = daylastprice;
    }

    public Double getDiffFromSelectedSec() {
        return diffFromSelectedSec;
    }

    public void setDiffFromSelectedSec(Double diffFromSelectedSec) {
        this.diffFromSelectedSec = diffFromSelectedSec;
    }

    
}

