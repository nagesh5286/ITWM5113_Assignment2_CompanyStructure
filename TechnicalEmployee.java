public class TechnicalEmployee extends Employee //TE inherits parent class Employee
{
    public int checkins =0; // to declare the data type for check-ins count

    public TechnicalEmployee(String name)
    {
        //Has a default base salary of 75000
        super(name,75000.00);
    }

    public String employeeStatus()
    {
        //Should return a String representation of this TechnicalEmployee that
        //includes their ID, name and how many successful check ins they have
        //had. Example: "1 Kasey has 10 successful check ins"
        return super.toString()+" has "+ checkins +" successful check ins";
    }



}
