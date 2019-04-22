package patterns.chainOfResponsibility.employee;

public abstract class Employee {
  protected Employee supervisor;

  public void setSupervisor(Employee supervisor) {
    this.supervisor = supervisor;
  }

  public abstract void applyLeave(String employeeName, int numberofDaysLeave);
}
