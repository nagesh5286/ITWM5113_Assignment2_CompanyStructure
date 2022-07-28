public class SoftwareEngineer extends TechnicalEmployee //SE inherits TE class
{

    public boolean CodeAccess; //to verify if SE has access or not to code

    public SoftwareEngineer(String name)
    {
        //Should start without access to code and with 0 code check ins
        super(name);
        setCodeAccess(true);

    }

    public boolean getCodeAccess()
    {
        //Should return whether or not this SoftwareEngineer has access to
        //make changes to the code base

        return CodeAccess;
    }

    public void setCodeAccess(boolean access)
    {
        //Should allow an external piece of code to update the
        //SoftwareEngieer's code privileges to either true or false

        this.CodeAccess=access;

    }

    public int getSuccessfulCheckIns()
    {
        //Should return the current count of how many times this
        //SoftwareEngineer has successfully checked in code
        this.checkInCode();
        return checkins;
    }

    public boolean checkInCode()
    {
        //Should check if this SoftwareEngineer's manager approves of their
        //check in. If the check in is approved their successful checkin count
        //should be increased and the method should return "true". If the
        //manager does not approve the check in the SoftwareEngineer's code
        //access should be changed to false and the method should return
        //"false"

        TechnicalLead manager=(TechnicalLead) this.getManager();
        if (manager.approveCheckIn(this))
        {
            CodeAccess = true;
            this.checkins++;
            return true;

        } else
        {
            CodeAccess=false;
            return false;
        }
    }

    public void setManager(TechnicalEmployee manager){
        super.manager=manager;
    }
}
