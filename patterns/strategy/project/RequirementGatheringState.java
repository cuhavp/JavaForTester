package patterns.strategy.project;

public class RequirementGatheringState implements ProjectState {
  @Override
  public void doRequirementGathering() {
    System.out.println("'Requirement Gathering' has been started .............");

    System.out.println("'Requirement Gathering' has been finished by 40 days .............");
  }

  @Override
  public void doDesignAndArchitecture() {
    System.out.println("Cannot do 'Design And Architecture' because Project is in 'Requirement Gathering' Phase...");
  }

  @Override
  public void doDevelopment() {
    System.out.println("Cannot do 'Development' because Project is in 'Requirement Gathering' Phase...");
  }

  @Override
  public void doTesting() {
    System.out.println("Cannot do 'Testing' because Project is in 'Requirement Gathering' Phase...");
  }
}
