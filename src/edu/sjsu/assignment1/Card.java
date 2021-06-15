/*
    Author: Yipeng Liu
    Project: Assignment 1
    Class: Card
    Date: 06/15/2021
 */
package edu.sjsu.assignment1;

public class Card {
    private String rank;
    private String suit;
    private String description;

    private final String UNKNOWN = "Unknown";

    /**
     * Initializes a newly created {@code Card}
     * @param cardStr A card string.
     */
    public Card(String cardStr) {
        if (cardStr.length() == 2 || cardStr.length() == 3) {
            this.setCard();
        } else {
            this.rank = UNKNOWN;
            this.suit = UNKNOWN;
            this.description = UNKNOWN;
        }
    }

    /**
     * Sets the {@code Card} instances in the constructor.
     */
    private void setCard() {

    }

    public String getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getDescription() {

        return this.description;
    }
}
