package lldQuestions.mediatorPattern.onlineAuctionSystem;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveNotification(int bidAmount);

    String getName();
}
