public abstract class Employee {
    private static int countID; //static variable to accumulate the number of  employees
    public String name; //to store the name
    public int employeeID; //to store the employee ID
    public double baseSalary; // to store the base Salary
    public double bonus; //to store the bonus value
    public Employee manager;
    public Accountant accountantSupport;
    public int headcount=0;
    public double bonusBudget;

    //construct a new employee object and take in two parameters,one for the name of the user and one for their base salary.
    public Employee (String name, double baseSalary)
    {
        this.name=name;
        this.baseSalary=baseSalary;
        countID++;
        this.employeeID=countID; //assign the id to employee
        // The first employee have an ID of "1", the second "2" and so on. This counter will increase and assign accordingly
    }

    public double getBaseSalary() //Returns the employee's current salary
    {
        return this.baseSalary;
    }

    public String getName()//Returns the employee's current name
    {
        return this.name;
    }

    public int getEmployeeID()
    {
        //Should return the employee's ID. The ID should be issued on behalf of
        //the employee at the time they are constructed. The first ever
        //employee should have an ID of "1", the second "2" and so on
        return this.employeeID;
    }

    public Employee getManager()
    {
        //Should return a reference to the Employee object that represents this employee's manager
        return manager;
    }

    public Accountant getAccountantSupport()
    {
        return accountantSupport;
    }

    public void setManager(Employee manager)
    {
        this.manager=manager;
    }

    public boolean equals(Employee other)
    {
        //Should return true if the two employee IDs are the same, false otherwise
        return this.getEmployeeID()==other.getEmployeeID();
    }

    public String toString()
    {
        //Should return a String representation of the employee that is a
        //combination of their id followed by their name. Example: "1 Kasey"
        return getEmployeeID()+ "  " + getName();
    }

    //declaring as abstract method without body.
    //body will be provided by the inherited subclass under separate java files
    public abstract String employeeStatus();

}
