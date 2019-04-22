package patterns.abstractFactory;

public abstract class AnimalFactory {
  abstract Animal getAnimal(String type);
  public static AnimalFactory getAnimalFactory(String factoryType){
    AnimalFactory animalFactory = null;
    if(factoryType.equalsIgnoreCase("sea")){
      animalFactory = new SeaAnimalFactory();

    }else {
      animalFactory = new LandAnimalFactory();
    }
    return animalFactory;
  }
}
