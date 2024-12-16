package com.alphawallet.app.ui.widget.entity;
public class NetworkItem {
    private String name;
    private long chainId;
    private boolean isSelected;

    // Constructor with all fields
    public NetworkItem(String name, long chainId, boolean isSelected) {
        this.name = name;
        this.chainId = chainId;
        this.isSelected = isSelected;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name, long chainId) {
        this.name = name;
        this.chainId = chainId;
    }

    // Getter and Setter for chainId
    public long getChainId() {
        return chainId;
    }

    // Getter and Setter for isSelected
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}