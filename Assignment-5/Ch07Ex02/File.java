public class File extends Document
{
    private String pathname;

    public File()
    {
        super();
        pathname = null;
    }

    public File(String pathname)
    {
        this.pathname = pathname;
    }

    public File(String pathname, String text)
    {
        super(text);
        this.pathname = pathname;
    }


    public String toString()
    {
        return "File {" + "pathname = '" + pathname + '\'' + ", text = '" + super.getText() + '\'' + '}';
    }
}
