package com.example.chongieball.list;

public class Animal {
    private int animalPicture;
    private String bahasaLanguage;
    private String latinLanguage;

    public Animal(int animalPicture, String bahasaLanguage, String
            latinLanguage) {
        this.animalPicture = animalPicture;
        this.bahasaLanguage = bahasaLanguage;
        this.latinLanguage = latinLanguage;
    }

    public int getAnimalPicture() {
        return animalPicture;
    }

    public String getBahasaLanguage() {
        return bahasaLanguage;
    }

    public String getLatinLanguage() {
        return latinLanguage;
    }
}
