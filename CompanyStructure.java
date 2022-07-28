public class CompanyStructure
{
    public static void main(String[] args)
    {
        //New Technical Lead & Software Enginerrs
        TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");

        //Assign SoftwareEngineers under Technical Lead Satya Nadella
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);

        System.out.println(CTO.getTeamStatus());

        //New Technical Lead & Software Enginerrs
        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Gizan");
        SoftwareEngineer seG = new SoftwareEngineer("Zaynah");

        //Assign SoftwareEngineers under Technical Lead Bill Gates
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);

        System.out.println(VPofENG.getTeamStatus());

        //New Business Lead and accountants
        BusinessLead CFO = new BusinessLead("Amy Hood");
        Accountant actA = new Accountant("Niky");
        Accountant actB = new Accountant("Andrew");

        //add business lead reporting line
        CFO.addReport(actA, CTO); // Niky is the accountant supporting  Technical Lead Satya Nadella
        CFO.addReport(actB, VPofENG); // Andrew is the accountant supporting Technical Lead Bill Gates

        System.out.println(CFO.getTeamStatus());

        //List out all the reporting line and managers
        System.out.println(seB.toString() + "'s manager is " + seB.getManager().toString());
        System.out.println(seF.toString() + "'s manager is " + seF.getManager().toString());
        System.out.println(actB.toString() + "'s manager is " + actB.getManager().toString());
        System.out.println();

        //Testing criteria for bonus approvals
        System.out.println("Testing BusinessLead approvedBonus()");
        System.out.print(seA.getManager() + " is asking for $10,000 bonus for "+seA.getName()+" , (the Approval result should be TRUE): ");
        System.out.println(CTO.requestBonus(seA, 10000));
        System.out.println("Updated budget is: "+seA.getManager().getAccountantSupport().getBonusBudget()+"\n");

        System.out.print(seF.getManager() + " is asking for $5,000 bonus for "+seF.getName() +", (the Approval result should be TRUE): ");
        System.out.println(VPofENG.requestBonus(seF, 5000));
        System.out.println("Updated budget is: "+seF.getManager().getAccountantSupport().getBonusBudget()+"\n");

        System.out.print(seF.getManager() + " is asking for $400,000 bonus  for "+seF.getName()+", (the Approval result should be FALSE): ");
        System.out.println(VPofENG.requestBonus(seF, 400000));
        System.out.println("Updated budget is: "+seF.getManager().getAccountantSupport().getBonusBudget()+"\n");
        System.out.println();
    }
}