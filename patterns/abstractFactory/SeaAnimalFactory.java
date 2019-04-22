package patterns.abstractFactory;

public class SeaAnimalFactory extends AnimalFactory {
  @Override
  Animal getAnimal(String type) {
    Animal animal = null;
    switch (type){
      case "shark":
        animal = new Shark();
        break;
      case "octopus":
        animal = new Octopus();
        break;
    }
    return animal;
  }

}
