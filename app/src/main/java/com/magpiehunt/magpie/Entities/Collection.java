package com.magpiehunt.magpie.Entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by James on 1/10/2018.
 *
 * This is the Room entity that stores information for each Collection
 */

@Entity(tableName = "Collections")
public class Collection {

    @SerializedName("CID")
    @Expose
    @PrimaryKey
    protected int cID;
    @SerializedName("Available")
    @Expose
    protected int available;
    @SerializedName("Name")
    @Expose
    protected String name;
    @SerializedName("City")
    @Expose
    protected String city;
    @SerializedName("State")
    @Expose
    protected String state;
    @SerializedName("ZipCode")
    @Expose
    protected int zipCode;
    @SerializedName("Rating")
    @Expose
    protected String rating;
    @SerializedName("Description")
    @Expose
    protected String description;
    @SerializedName("Ordered")
    @Expose
    protected boolean ordered;
    @SerializedName("Abbreviation")
    @Expose
    protected String abbreviation;
    @SerializedName("Sponsor")
    @Expose
    protected String sponsor;

    @SerializedName("Completed")
    @Expose
    protected String completed;


    public int getCID() {
        return cID;
    }

    public void setCID(int CID) {
        this.cID = CID;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

}
/*
String query = "CREATE TABLE Collections(\n" +
                "  CID INTEGER PRIMARY KEY AUTO_INCREMENT,\n" +
                "  Available BOOL DEFAULT 1,\n" +
                "  Name VARCHAR(100) NOT NULL,\n" +
                "  City VARCHAR(100) DEFAULT \"Spokane\",\n" +
                "  State VARCHAR(100) DEFAULT \"Washington\",\n" +
                "  ZipCode INTEGER DEFAULT 99207,\n" +
                "  Rating VARCHAR(100) DEFAULT \"E\",\n" +
                "  Description VARCHAR(1000) NOT NULL, \n" +
                "  Ordered BOOL DEFAULT 0,\n" +
                "  Abbreviation VARCHAR(4) NOT NULL\n" +
                "  \n" +
                "  \n" +
                "  \n" +
                ")";
 */