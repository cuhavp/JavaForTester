package patterns.observer;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person implements Observer {
  private String name;

  public Person(String name, Subject subject) {
    this.name = name;
    subject.registerObserver(this);
  }


  public void update(String availability) {
    System.out.println("Hello "+ name + " \n"
    +" Product is now "+ availability+" \n");
  }
}
