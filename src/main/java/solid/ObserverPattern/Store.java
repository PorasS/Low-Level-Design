package solid.ObserverPattern;

import solid.ObserverPattern.Observable.IphoneObservable;
import solid.ObserverPattern.Observable.StockObservable;
import solid.ObserverPattern.Observer.EmailAlertObserver;
import solid.ObserverPattern.Observer.MobileAlertObserver;
import solid.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("xyz_userName", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
