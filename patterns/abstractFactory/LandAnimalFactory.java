package patterns.abstractFactory;

public class LandAnimalFactory extends AnimalFactory{
  @Override
  Animal getAnimal(String type) {
    Animal animal = null;
    switch (type){
      case "cat":
        animal = new Cat();
        break;
      case "dog":
        animal = new Dog();
        break;
      case "lion":
        animal = new Lion();
        break;

    }
    return animal;
  }


}
