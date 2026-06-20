
class employee{
    int employeeId;
    String employeeName;
    String employeePosition;
    double employeeSalary;

    employee(int employeeId,String employeeName,String employeePosition,double employeeSalary){
                 this.employeeId=employeeId;
                 this.employeeName=employeeName;
                 this.employeePosition=employeePosition;
                 this.employeeSalary=employeeSalary;
    }
    @Override
    public String toString() {

        return "ID: " + employeeId +
               ", Name: " + employeeName +
               ", Position: " + employeePosition +
               ", Salary: " + employeeSalary;
    }

}
class EmployeeSystem{
    employee[] employee = new employee[10];
    int count=0;

    public void addEmployee(employee emp){
        if(count<employee.length){
            employee[count]=emp;
            count++;
            System.out.println("added");
        }else{
            System.out.println("Array is full");
        }
    }

    public employee SearchEmployee(int id){
        for(int i=0;i<count;i++){
            if(employee[i].employeeId==id){
                return employee[i];
            }
        }
        return null;
    }
    public void displayEmployee(){
        for(int i=0;i<count;i++){
            System.out.println(employee[i]);
        }
    }
    public void deleteEmployee(int id){
       
        for(int i=0;i<count;i++){
            if(employee[i].employeeId==id){
              for(int j=i;j<count-1;j++){
                employee[j]=employee[j+1];
              }
              count--;
              System.out.println("Employee deleted");
              return;
            }
        }
        System.out.println("Not found");
    }
}
class EmployeeManagement{
    public static void main(String[] args) {
        EmployeeSystem manager=new EmployeeSystem();

        manager.addEmployee(
            new employee( 101,
                "Ram",
                "Developer",
                50000)
        );
        manager.addEmployee(
            new employee(103,
                "John",
                "Manager",
                80000)
        );
        System.out.println("Emplyees: ");
        manager.displayEmployee();

        employee emp=manager.SearchEmployee(102);
        if(emp!=null){
            System.out.println(emp);
        }
        manager.deleteEmployee(101);
        System.out.println("After deletion");
        manager.displayEmployee();
        
    }
}
