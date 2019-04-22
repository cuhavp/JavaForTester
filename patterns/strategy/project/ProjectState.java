package patterns.strategy.project;

public interface ProjectState {
  void doRequirementGathering();
  void doDesignAndArchitecture();
  void doDevelopment();
  void doTesting();
}
