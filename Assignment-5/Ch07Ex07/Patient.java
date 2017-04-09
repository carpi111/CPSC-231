public class Patient extends Person
{
    private Doctor doc;


    public Patient()
    {
        super();
        this.doc = new Doctor();
    }

    public Patient(String theName, Doctor theDoctor)
    {
        super(theName);
        this.doc = theDoctor;
    }

    public Patient(String thePatientName, String theDocName, String theSpecialty, double theVisitFee)
    {
        super(thePatientName);
        this.doc.setName(theDocName);
        this.doc.setSpecialty(theSpecialty);
        this.doc.setVisitFee(theVisitFee);
    }


    public void setDoctor(Doctor theDoctor)
    {
        this.doc = theDoctor;
    }

    public Doctor getDoctor()
    {
        return this.doc;
    }


    public boolean equals(Patient thePatient)
    {
        return (this.getName().equals(thePatient.getName()) && this.doc == thePatient.getDoctor());
    }

    public String toString()
    {
        return "Patient {" + "doc = " + doc + "} " + super.toString();
    }
}
