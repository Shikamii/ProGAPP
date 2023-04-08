package model;

import javax.swing.Icon;
import star.rating.StarRating;

public class ModelItem {
    int itemID;
    String itemName;
    String description;
    Icon image;
    StarRating rating;
    
    String linkFilm;
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public StarRating getRating() {
        return rating;
    }

    public void setRating(StarRating rating) {
        this.rating = rating;
    }

    public String getLinkFilm() {
        return linkFilm;
    }

    public void setLinkFilm(String linkFilm) {
        this.linkFilm = linkFilm;
    }
    

    public ModelItem(int itemID, String itemName, String description, Icon image, String linkFilm) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.description = description;
        this.image = image;
        this.linkFilm = linkFilm;
    }
}
