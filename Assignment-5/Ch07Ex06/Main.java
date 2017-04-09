public class Main
{
    public static void main(String[] args)
    {
        Person blank = new Person();
        Person me = new Person("Vince");
        Person dad = new Person("Guy");
        Person friend = new Person("Jane");
        Person twin = new Person("Jane");
        Person triplet = new Person(twin);


        Vehicle vehic1 = new Vehicle();
        Vehicle vehic2 = new Vehicle("VW Golf GTI", 4, me);
        Vehicle vehic3 = new Vehicle("Toyota Prius", 0, friend);
        Vehicle vehic4 = new Vehicle("Toyota Prius", 0, twin);
        Vehicle vehic5 = new Vehicle(vehic2);


        Truck truck1 = new Truck();
        Truck truck2 = new Truck("Chevy Silverado", 8, blank, 500, 2000);
        Truck truck3 = new Truck(truck2);


        blank.setName("I have no name");

        vehic1.setMake("Ferrari California");
        vehic1.setCylinders(8);
        vehic1.setOwner(me);
        vehic5.setOwner(dad);

        truck1.setMake("Toyota Tundra");
        truck1.setLoadCapacity(375);
        truck1.setTowCapacity(5000);


        System.out.println(me.equals(friend));
        System.out.println(friend.equals(twin));
        System.out.println(twin.equals(triplet));

        System.out.println();

        System.out.println(vehic2.equals(vehic3));
        System.out.println(vehic3.equals(vehic4));

        System.out.println();

        System.out.println(truck1.equals(truck2));
        System.out.println(truck2.equals(truck3));
    }
}
