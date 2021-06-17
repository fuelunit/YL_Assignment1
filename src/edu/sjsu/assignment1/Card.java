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
            this.setCard(cardStr);
        } else {
            this.rank = UNKNOWN;
            this.suit = UNKNOWN;
            this.description = UNKNOWN;
        }
    }

    /**
     * Sets the {@code Card} instances in the constructor.
     * @param cardInfoStr a {@code Card} string
     */
    private void setCard(String cardInfoStr) {
        String cardRank;
        String cardSuit;
        if (cardInfoStr.length() == 2) {
            // String slicing
            cardRank = cardInfoStr.substring(0, 1);
            cardSuit = cardInfoStr.substring(1);
            // Setting Card rank
            switch (cardRank) {
                case "A" -> this.rank = "Ace";
                case "2" -> this.rank = "Two";
                case "3" -> this.rank = "Three";
                case "4" -> this.rank = "Four";
                case "5" -> this.rank = "Five";
                case "6" -> this.rank = "Six";
                case "7" -> this.rank = "Seven";
                case "8" -> this.rank = "Eight";
                case "9" -> this.rank = "Nine";
                case "J" -> this.rank = "Jack";
                case "Q" -> this.rank = "Queen";
                case "K" -> this.rank = "King";
                default -> {
                    this.rank = UNKNOWN;
                    this.description = UNKNOWN;
                }
            }
        } else { // cardInfoStr.length() == 3
            // String slicing
            cardRank = cardInfoStr.substring(0, 2);
            cardSuit = cardInfoStr.substring(2);
            // Setting Card rank
            if (cardRank.equals("10")) {
                this.rank = "Ten";
            } else {
                this.rank = UNKNOWN;
                this.description = UNKNOWN;
            }
        }
        // Setting Card suit
        switch (cardSuit) {
            case "D" -> this.suit = "Diamonds";
            case "H" -> this.suit = "Hearts";
            case "S" -> this.suit = "Spades";
            case "C" -> this.suit = "Clubs";
            default -> {
                this.suit = UNKNOWN;
                this.description = UNKNOWN;
            }
        }
        // Setting Card Description
        if (this.description != UNKNOWN) {
            this.description = this.rank + " of " + this.suit;
        }
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
