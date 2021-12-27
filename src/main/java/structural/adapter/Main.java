package structural.adapter;

public class Main {

    public static void main(String[] args) {

        //Class Adapter
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();

        populateData(employeeClassAdapter);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        System.out.println(businessCardDesigner.designCard(employeeClassAdapter));


        System.out.println("***********************************************************");

        //Object Adapter(composition)
        Employee employee = new Employee();
        populateData(employee);

        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner businessCardDesigner1 = new BusinessCardDesigner();
        System.out.println(businessCardDesigner1.designCard(employeeObjectAdapter));

    }

    public static void populateData(Employee employee){
        employee.setFullName("Matheesh Prabhu");
        employee.setJobTitle("SDE");
        employee.setOfficeAddress("xxx");
    }
}
