public class Main
{
    public static void main(String[] args)
    {
        Date date1 = new Date(6, 14, 2012);
        Date date2 = new Date("February", 30, 2002);

        Doctor doc1 = new Doctor("Jimbo", date2, 675000, "Dandelion Blower", 315);
        Doctor doc3 = new Doctor("Anderson", date1, 450000, "Snowflake Expert", 75);

        Patient patient1 = new Patient("Alice", doc1);
        Patient patient2 = new Patient("Bob", doc3);

        Billing bill1 = new Billing(patient1, patient1.getDoctor(), patient1.getDoctor().getVisitFee());
        Billing bill2 = new Billing(patient2, patient2.getDoctor(), patient2.getDoctor().getVisitFee());


        System.out.println("The total income for Dr. " + bill1.getDoctor().getName() + " is $"
                + bill1.getDoctor().getSalary() + " annually, plus $"
                +  bill1.getAmountDue() + " per patient visit.\n");

        System.out.println("The total income for Dr. " + bill2.getDoctor().getName() + " is $"
                + bill2.getDoctor().getSalary() + " annually, plus $"
                +  bill2.getAmountDue() + " per patient visit.\n");
    }
}
