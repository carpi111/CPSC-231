public class Billing
{
    private Patient patient;
    private Doctor doc;
    private double amountDue;

    public Billing()
    {
        this.patient = new Patient();
        this.doc = new Doctor();
        this.amountDue = 0;
    }

    public Billing(Patient thePatient, Doctor theDoctor, double theAmountDue)
    {
        this.patient = thePatient;
        this.doc = theDoctor;
        this.amountDue = theAmountDue;
    }

    public Billing(String thePatientName, String theDocName, String theDocSpeciality, double theDocVisitFee)
    {
        this.patient.setName(thePatientName);
        this.doc.setName(theDocName);
        this.doc.setSpecialty(theDocSpeciality);
        this.amountDue = this.doc.getVisitFee();
    }


    public void setPatient(Patient thePatient)
    {
        this.patient = thePatient;
    }

    public void setDoctor(Doctor theDoctor)
    {
        this.doc = theDoctor;
    }

    public void setAmountDue(double theAmountDue)
    {
        this.amountDue = theAmountDue;
    }

    public Patient getPatient()
    {
        return this.patient;
    }

    public Doctor getDoctor()
    {
        return this.doc;
    }

    public double getAmountDue()
    {
        return this.amountDue;
    }


    public boolean equals(Billing theBillingObject)
    {
        return (this.patient == theBillingObject.getPatient() &&
                this.doc == theBillingObject.getDoctor() &&
                this.amountDue == theBillingObject.getAmountDue());
    }

    public String toString()
    {
        return "Billing {" + "patient = " + patient + ", doc = " + doc + ", amountDue = $" + amountDue + '}';
    }
}
