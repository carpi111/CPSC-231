public class Email extends Document
{
    private String m_sender;
    private String m_recipient;
    private String m_title;

    public Email()
    {
        super();
        m_sender = null;
        m_recipient = null;
        m_title = null;
    }

    public Email(String sender, String recipient, String title)
    {
        this.m_sender = sender;
        this.m_recipient = recipient;
        this.m_title = title;
    }

    public Email(String sender, String recipient, String title, String text)
    {
        super(text);
        this.m_sender = sender;
        this.m_recipient = recipient;
        this.m_title = title;
    }


    public void setSender(String sender)
    {
        this.m_sender = sender;
    }

    public void setRecipient(String recipient)
    {
        this.m_recipient = recipient;
    }

    public void setTitle(String title)
    {
        this.m_title = title;
    }


    public String getSender()
    {
        return m_sender;
    }

    public String getRecipient()
    {
        return m_recipient;
    }

    public String getTitle()
    {
        return m_title;
    }


    public String toString()
    {
        return "Email {" + "sender = '" + m_sender + '\'' + ", recipient = '" + m_recipient + '\''
                + ", title = '" + m_title + '\'' + ", text = '" + super.getText() + '\'' + '}';
    }
}
