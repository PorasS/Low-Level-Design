package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    String userName;
    StockObservable observable;

    public MobileAlertObserver(String userName, StockObservable observable) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up!!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Msg sent to:" + userName + " message: " + msg);
        //send the actual msg to the end user
    }
}
