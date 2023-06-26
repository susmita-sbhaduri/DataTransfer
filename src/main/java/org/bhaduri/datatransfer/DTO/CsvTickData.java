/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.datatransfer.DTO;

import java.util.Date;
import java.util.List;

/**
 *
 * @author sb
 */
public class CsvTickData {
    private List<List<Double>> tickData;
    private Date dateTime;

    public List<List<Double>> getTickData() {
        return tickData;
    }

    public void setTickData(List<List<Double>> tickData) {
        this.tickData = tickData;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
