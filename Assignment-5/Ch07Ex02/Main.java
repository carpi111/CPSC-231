public class Main
{
    public static void main(String[] args)
    {
        Document doc = new Document("The quick brown fox jumps over the lazy dog.");

        Email mail1 = new Email();
        Email mail2 = new Email("Vince", "Kalea", "Hello", "Hi");
        Email mail3 = new Email("Kalea", "Vince", "Hello, too", "Hey");

        File file1 = new File();
        File file2 = new File("<this/is/a/pathname>", "test tester testing");
        File file3 = new File("<this/is/another/pathname>", "test test test");

        System.out.println(mail1.ContainsKeyword(mail2, "test"));
        System.out.println(mail1.ContainsKeyword(mail3, "Hello"));

        System.out.println(file1.ContainsKeyword(file2, "testee"));
        System.out.println(file1.ContainsKeyword(file3, "test"));
        System.out.println();

        System.out.println(mail2.toString());
        System.out.println(mail3.toString());
        System.out.println();

        System.out.println(file2.toString());
        System.out.println(file3.toString());
        System.out.println();

        System.out.println(doc.toString());

    }
}
