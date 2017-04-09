public class Vehicle
{
    private String make;
    private int cylinders;
    private Person owner;


    public Vehicle()
    {
        this.make = "No make";
        this.cylinders = 0;
        this.owner = new Person("No name");
    }

    public Vehicle(String theMake, int theCylinders, Person theOwner)
    {
        this.make = theMake;
        this.cylinders = theCylinders;
        this.owner = theOwner;
    }

    public Vehicle(Vehicle theVehicle)
    {
        this.make = theVehicle.getMake();
        this.cylinders = theVehicle.getCylinders();
        this.owner = theVehicle.getOwner();
    }


    public void setMake(String theMake)
    {
        this.make = theMake;
    }

    public void setCylinders(int theCylinders)
    {
        this.cylinders = theCylinders;
    }

    public void setOwner(Person theOwner)
    {
        this.owner = theOwner;
    }


    public String getMake()
    {
        return (this.make);
    }

    public int getCylinders()
    {
        return (this.cylinders);
    }

    public Person getOwner()
    {
        return (this.owner);
    }



    public boolean equals(Vehicle theVehicle)
    {
        return (this.make.equals(theVehicle.getMake())
                && this.cylinders == theVehicle.getCylinders()
                && this.owner == theVehicle.getOwner());
    }

    public String toString()
    {
        return "Vehicle {" + "make = '" + this.make + '\'' + ", cylinders = "
                + this.cylinders + ", owner = " + this.owner + '}';
    }
}
