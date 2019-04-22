package patterns.strategy.project;

public class Project implements ProjectState {
  private ProjectState projectState;

  public Project() {
    this.projectState = new RequirementGatheringState();
  }

  public ProjectState getProjectState() {
    return projectState;
  }

  public void setProjectState(ProjectState projectState) {
    this.projectState = projectState;
  }

  @Override
  public void doRequirementGathering() {
    projectState.doRequirementGathering();
    if (projectState instanceof RequirementGatheringState) {
      setProjectState(new DesignAndArchitectureState());
      System.out.println("Project internal state  move to : " + projectState.getClass().getName());
    }

  }

  @Override
  public void doDesignAndArchitecture() {
    projectState.doDesignAndArchitecture();
    if (projectState instanceof DesignAndArchitectureState) {
      setProjectState(new DevelopmentState());
      System.out.println("Project internal state  move to : " + projectState.getClass().getName());
    }
  }

  @Override
  public void doDevelopment() {
    projectState.doDevelopment();
    if (projectState instanceof DevelopmentState) {
      setProjectState(new DevelopmentState());
      System.out.println("Project internal state  move to : " + projectState.getClass().getName());
    }

  }

  @Override
  public void doTesting() {
    projectState.doTesting();

  }
}
