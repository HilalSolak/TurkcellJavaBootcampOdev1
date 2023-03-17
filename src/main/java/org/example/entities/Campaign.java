package org.example.entities;

public class Campaign {
    private int id;
    private String  campaignDescription;
    private double campaignAmount;

    public Campaign() {
    }

    public Campaign(int id, String campaignDescription, double campaignAmount) {
        this.id = id;
        this.campaignDescription = campaignDescription;
        this.campaignAmount = campaignAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public double getCampaignAmount() {
        return campaignAmount;
    }

    public void setCampaignAmount(double campaignAmount) {
        this.campaignAmount = campaignAmount;
    }
}
