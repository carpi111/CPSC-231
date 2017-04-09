public class Document
{
    private String m_text;

    public Document()
    {
        m_text = null;
    }

    public Document(String text)
    {
        this.m_text = text;
    }


    public void setText(String text)
    {
        this.m_text = text;
    }


    public String getText()
    {
        return m_text;
    }


    public String toString()
    {
        return "Document {" + "text = '" + m_text + '\'' + '}';
    }


    public static boolean ContainsKeyword(Document docObject, String keyword)
    {
        return (docObject.toString().indexOf(keyword, 0) >= 0);
    }
}
