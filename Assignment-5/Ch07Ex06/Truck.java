public class Truck extends Vehicle
{
    private double loadCapacity;
    private int towCapacity;


    public Truck()
    {
        super();
        this.loadCapacity = 0;
        this.towCapacity = 0;
    }

    public Truck(String theMake, int theCylinders, Person theOwner, double theLoadCapacity, int theTowCapacity)
    {
        super(theMake, theCylinders, theOwner);
        this.loadCapacity = theLoadCapacity;
        this.towCapacity = theTowCapacity;
    }

    public Truck(Truck theTruck)
    {
        this.loadCapacity = theTruck.getLoadCapacity();
        this.towCapacity = theTruck.getTowCapacity();
    }


    public void setLoadCapacity(double theLoadCapacity)
    {
        this.loadCapacity = theLoadCapacity;
    }

    public void setTowCapacity(int theTowCapacity)
    {
        this.towCapacity = theTowCapacity;
    }


    public double getLoadCapacity()
    {
        return (this.loadCapacity);
    }

    public int getTowCapacity()
    {
        return (this.towCapacity);
    }



    public boolean equals(Truck theTruck)
    {
        return (this.loadCapacity == theTruck.getLoadCapacity()
                && this.towCapacity == theTruck.getTowCapacity());
    }

    public String toString()
    {
        return "Truck {" + "loadCapacity = " + this.loadCapacity
                + ", towCapacity = " + this.towCapacity + "} " + super.toString();
    }
}
