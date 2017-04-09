import java.util.Scanner;

public class Menu
{
    private Scanner input;
    private Logger logger;
    private Content content;

    private String logFileName;

    public Menu()
    {
        logger = new Logger();
        input = new Scanner(System.in);
        content = new Content();
    }

    public void prompt()
    {
        System.out.println("\nWould you like to dump results to a log file?\n");
        String answer = input.nextLine();

        switch(answer.toLowerCase())
        {
            case("yes"):
            {
                System.out.println("\nEnter the name of the log file to be written to.\n");
                logFileName = input.nextLine();
                this.setLogFileName(logFileName);
                logger.log(logFileName, "<start of stream>");
                this.display();
                break;
            }

            case("no"):
            {
                System.out.println("\nFine.");
                this.display();
                break;
            }

            default:
            {
                logger.log(this.getLogFileName(), "");
                System.out.println("\nInvalid input. Try again.");
                this.prompt();
            }
        }
    }

    public void display()
    {
        System.out.println("\nWhat would you like to do?\n" +
                "1 - List the contents of a directory\n" +
                "2 - List the contents of a directory and of all of its subdirectories\n" +
                "3 - Locate a file with a given name\n" +
                "4 - Locate all files with a certain extension\n" +
                "5 - Combine the contents of two files into a third file\n" +
                "6 - Exit\n");
        logger.log(this.getLogFileName(), "<displayed menu>");

        int answer = input.nextInt();

        switch(answer)
        {
            // LIST CONTENTS OF GIVEN DIRECTORY
            case 1:
            {
                logger.log(this.getLogFileName(), "<user answered '1'>");
                content.promptDirectoryContents();
                break;
            }

            // LIST CONTENT OF GIVEN DIRECTORY AND ALL SUBDIRECTORIES
            case 2:
            {
                logger.log(this.getLogFileName(), "<user answered '2'>");
                content.setWantRecursive(true);
                content.promptDirectoryContents();
                break;
            }

            // LOCATE FILE(S) WITH GIVEN NAME
            case 3:
            {
                logger.log(this.getLogFileName(), "<user answered '3'>");
                content.promptFileName();
                break;
            }

            // LOCATE FILE(S) WITH GIVEN EXTENSION
            case 4:
            {
                logger.log(this.getLogFileName(), "<user answered '4'>");
                content.promptExtension();
                break;
            }

            // COMBINE TWO FILES INTO THIRD FILE
            case 5:
            {
                logger.log(this.getLogFileName(), "<user answered '5'>");
                content.promptCombineFiles();
                break;
            }

            // EXIT
            case 6:
            {
                logger.log(this.getLogFileName(), "<user answered '6'>");
                System.out.println("Goodbye!");
                System.exit(0);
            }

            default:
            {
                System.out.println("Invalid answer. Try again.");
                this.display();
            }
        }
    }


    public String getLogFileName()
    {
        return this.logFileName;
    }

    public void setLogFileName(String fileName)
    {
        this.logFileName = fileName;
    }
}
