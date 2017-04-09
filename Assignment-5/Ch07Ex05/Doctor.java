public class Doctor extends SalariedEmployee
{
    private String specialty;
    private double visitFee;


    public Doctor()
    {
        super();
        this.specialty = "<none specified>";
        this.visitFee = 0;
    }

    public Doctor(String theSpecialty, double theVisitFee)
    {
        if (theSpecialty == null || theVisitFee == 0)
        {
            System.out.println("Fatal error creating doctor.");
            System.exit(0);
        }

        this.specialty = theSpecialty;
        this.visitFee = theVisitFee;
    }

    public Doctor(Doctor docObject)
    {
        this.specialty = docObject.getSpecialty();
        this.visitFee = docObject.getVisitFee();
    }

    public Doctor(String theName, Date theDate, double theSalary, String specialty, double visitFee)
    {
        super(theName, theDate, theSalary);
        this.specialty = specialty;
        this.visitFee = visitFee;
    }

    public Doctor(SalariedEmployee originalObject, String specialty, double visitFee)
    {
        super(originalObject);
        this.specialty = specialty;
        this.visitFee = visitFee;
    }


    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public void setVisitFee(double visitFee)
    {
        this.visitFee = visitFee;
    }


    public String getSpecialty()
    {
        return specialty;
    }

    public double getVisitFee()
    {
        return visitFee;
    }


    public String toString()
    {
        return "Doctor {" + "specialty = '" + specialty + '\'' + ", visitFee = $" + visitFee + "} " + super.toString();
    }

    public Boolean equals(Doctor d)
    {
        return (this.getSpecialty().equals(d.getSpecialty()) && this.getVisitFee() == d.getVisitFee());
    }
}
