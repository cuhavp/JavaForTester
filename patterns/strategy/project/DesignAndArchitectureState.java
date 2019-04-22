package patterns.strategy.project;

public class DesignAndArchitectureState implements ProjectState {
  @Override
  public void doRequirementGathering() {
    System.out.println("Cannot do 'Requirement Gathering' because Project is in 'Design And Architecture' Phase...");
  }

  @Override
  public void doDesignAndArchitecture() {
    System.out.println("'Design And Architecture' has been started .............");

    System.out.println("'Design And Architecture' has been finished by 40 days .............");

  }

  @Override
  public void doDevelopment() {
    System.out.println("Cannot do 'Development' because Project is in 'Design And Architecture' Phase...");
  }

  @Override
  public void doTesting() {
    System.out.println("Cannot do 'Testing' because Project is in 'Design And Architecture' Phase...");
  }
}
