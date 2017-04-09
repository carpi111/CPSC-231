public class Main
{
    public static void main(String[] args)
    {
        Date date1 = new Date(6, 15, 2008);
        Date date2 = new Date("March", 17, 1492);

        Doctor doc1 = new Doctor();
        Doctor doc2 = new Doctor("Pediatrician", 75);
        Doctor doc3 = new Doctor("Phunk", date1, 525000, "Illusion", 115);
        Doctor doc4 = new Doctor(doc3);


        doc1.setName("German");
        doc1.setSpecialty("Genius");
        doc1.setHireDate(date1);
        doc1.setVisitFee(275);
        doc1.setSalary(1000000);


        doc2.setName("Pain");
        doc2.setHireDate(date2);
        doc2.setSalary(275000);


        System.out.println(doc1.toString());
        System.out.println();

        System.out.println(doc2.toString());
        System.out.println();

        System.out.println(doc3.toString());
        System.out.println();

        System.out.println(doc1.equals(doc3));
        System.out.println(doc3.equals(doc4));
    }
}
