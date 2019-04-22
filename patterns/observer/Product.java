package patterns.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter
@Getter
public class Product implements Subject {
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private String name;
  private String type;
  private String price;
  private String availability;

  public void setAvailability(String availability) {
    this.availability = availability;
    System.out.println("Availability change from <<NOT Available>> to <<Available>>");
    notifyObservers();
  }

  public Product(String name, String type, String price, String availability) {
    this.name = name;
    this.type = type;
    this.price = price;
    this.availability = availability;
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this.availability);
    }
  }
}
