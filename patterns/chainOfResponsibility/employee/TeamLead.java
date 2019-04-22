package patterns.chainOfResponsibility.employee;

public class TeamLead extends Employee {
  private final int MAX_LEAVES_CAN_APPROVE = 10;


  @Override
  public void applyLeave(String employeeName, int numberofDaysLeave) {
    if (numberofDaysLeave > MAX_LEAVES_CAN_APPROVE) {
      supervisor.applyLeave(employeeName, numberofDaysLeave);
    } else approveLeave(employeeName, numberofDaysLeave);
  }

  private void approveLeave(String employeeName, int numberofDaysLeave) {
    System.out.println("TeamLeader approved " + numberofDaysLeave + " days "
            + "Leave for the employee : " + employeeName);
  }
}
