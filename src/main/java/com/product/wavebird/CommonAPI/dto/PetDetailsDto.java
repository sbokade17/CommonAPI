package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;

public class PetDetailsDto implements Serializable {

    private static final long serialVersionUID = 4164566970740574344L;

    private long petId;
    private String petName;
    private int petAge;
    private String userId;
    private int petCategory;
    private String petColour;
    private String petSize;
    private String petFoodPref;
    private FileDto pic;
    private Long picId;

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPetCategory() {
        return petCategory;
    }

    public void setPetCategory(int petCategory) {
        this.petCategory = petCategory;
    }

    public String getPetColour() {
        return petColour;
    }

    public void setPetColour(String petColour) {
        this.petColour = petColour;
    }

    public String getPetSize() {
        return petSize;
    }

    public void setPetSize(String petSize) {
        this.petSize = petSize;
    }

    public String getPetFoodPref() {
        return petFoodPref;
    }

    public void setPetFoodPref(String petFoodPref) {
        this.petFoodPref = petFoodPref;
    }

    public FileDto getPic() {
        return pic;
    }

    public void setPic(FileDto pic) {
        this.pic = pic;
    }
}
