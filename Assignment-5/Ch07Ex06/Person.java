public class Person
{
    private String name;


    public Person()
    {
        this.name = "No name";
    }

    public Person(String theName)
    {
        this.name = theName;
    }

    public Person(Person p)
    {
        this.name = p.getName();
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }



    public String toString()
    {
        return "Person {" + "name = '" + this.name + '\'' + '}';
    }

    public boolean equals(Person p)
    {
        return (this.name.equals(p.getName()));
    }
}
