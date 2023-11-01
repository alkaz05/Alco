package ipap.alco;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Liqueur {
    int id;
    SimpleStringProperty label;
    AlcoCategory category;
    SimpleStringProperty subcategory;
    SimpleStringProperty country;
    SimpleFloatProperty strength;
    SimpleIntegerProperty sugar;
    SimpleFloatProperty volume;
    SimpleIntegerProperty exposure;
    SimpleIntegerProperty year;

    public Liqueur(String label, AlcoCategory category, String subcategory, String country, float strength, int sugar, float volume, int exposure, int year) {
        this.label = new SimpleStringProperty(label);
        this.category = category;
        this.subcategory = new SimpleStringProperty(subcategory);
        this.country = new SimpleStringProperty(country);
        this.strength = new SimpleFloatProperty(strength);
        this.sugar = new SimpleIntegerProperty(sugar);
        this.volume = new SimpleFloatProperty(volume);
        this.exposure = new SimpleIntegerProperty(exposure);
        this.year = new SimpleIntegerProperty(year);
    }

    public Liqueur(int id,String label, AlcoCategory category, String subcategory, String country, float strength, int sugar, float volume, int exposure, int year) {
        this.id=id;
        this.label = new SimpleStringProperty(label);
        this.category = category;
        this.subcategory = new SimpleStringProperty(subcategory);
        this.country = new SimpleStringProperty(country);
        this.strength = new SimpleFloatProperty(strength);
        this.sugar = new SimpleIntegerProperty(sugar);
        this.volume = new SimpleFloatProperty(volume);
        this.exposure = new SimpleIntegerProperty(exposure);
        this.year = new SimpleIntegerProperty(year);
    }

    public String getLabel() {
        return label.get();
    }

    public SimpleStringProperty labelProperty() {
        return label;
    }

    public void setLabel(String label) {
        this.label.set(label);
    }

    public AlcoCategory getCategory() {
        return category;
    }

    public void setCategory(AlcoCategory category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory.get();
    }

    public SimpleStringProperty subcategoryProperty() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory.set(subcategory);
    }

    public String getCountry() {
        return country.get();
    }

    public SimpleStringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public float getStrength() {
        return strength.get();
    }

    public SimpleFloatProperty strengthProperty() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength.set(strength);
    }

    public int getSugar() {
        return sugar.get();
    }

    public SimpleIntegerProperty sugarProperty() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar.set(sugar);
    }

    public float getVolume() {
        return volume.get();
    }

    public SimpleFloatProperty volumeProperty() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume.set(volume);
    }

    public int getExposure() {
        return exposure.get();
    }

    public SimpleIntegerProperty exposureProperty() {
        return exposure;
    }

    public void setExposure(int exposure) {
        this.exposure.set(exposure);
    }

    public int getYear() {
        return year.get();
    }

    public SimpleIntegerProperty yearProperty() {
        return year;
    }

    public void setYear(int year) {
        this.year.set(year);
    }
}
