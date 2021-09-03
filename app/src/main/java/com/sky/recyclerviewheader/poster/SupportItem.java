package com.sky.recyclerviewheader.poster;

public class SupportItem {

    private String itemTitle;
    private String itemDescription;
    private boolean result;
    private int itemImage;
    private String type;

    public SupportItem() {
    }

    public SupportItem(String itemTitle, String itemDescription, boolean result, int itemImage, String type) {
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
        this.result = result;
        this.itemImage = itemImage;
        this.type = type;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
