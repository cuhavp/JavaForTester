package patterns.chainOfResponsibility.employee;

public class HR extends Employee {
  private final int MAX_LEAVES_CAN_APPROVE = 30;

  @Override
  public void applyLeave(String employeeName, int numberofDaysLeave) {
    if (numberofDaysLeave > MAX_LEAVES_CAN_APPROVE) {
      System.out.println("Leave application suspended, Please contact HR");
    } else approveLeave(employeeName, numberofDaysLeave);
  }

  private void approveLeave(String employeeName, int numberofDaysLeave) {
    System.out.println("HR approved " + numberofDaysLeave + " days "
            + "Leave for the employee : " + employeeName);
  }
}
