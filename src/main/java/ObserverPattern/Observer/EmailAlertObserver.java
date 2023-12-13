package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Email send to: " + emailId + " with message: " + message);
        //send the actual email to the user
    }
}
