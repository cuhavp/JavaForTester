package patterns.chainOfResponsibility.employee;

public class ChainsResponsibilityDemo {
  public static void main(String[] args) {
    TeamLead teamLead = new TeamLead();
    HR hr = new HR();
    ProjectLead projectLead = new ProjectLead();

    teamLead.setSupervisor(projectLead);
    projectLead.setSupervisor(hr);

    teamLead.applyLeave("David", 10);
    System.out.println();
    teamLead.applyLeave("John", 18);
    System.out.println();
    teamLead.applyLeave("Steve", 30);
    System.out.println();
    teamLead.applyLeave("Rohan", 50);
  }
}
