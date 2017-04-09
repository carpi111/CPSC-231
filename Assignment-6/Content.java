import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Content
{
    private BufferedReader br;
    private Boolean wantRecursive;
    private String extension;
    private Scanner input;
    private String fileName;
    private String firstFileName;
    private Boolean fileOneExists;
    private String secondFileName;
    private Boolean fileTwoExists;

    public Content()
    {
        br = new BufferedReader(new InputStreamReader((System.in)));
        wantRecursive = false;
        extension = null;
        input = new Scanner(System.in);
    }

    // OPTIONS 1 & 2
    public void promptDirectoryContents()
    {
        try
        {
            System.out.println("\nEnter the absolute desired pathname.\n");
            String temp = br.readLine();

            if(new File(temp).exists())
            {
                this.listContent(temp, this.getWantRecursive());
            }

            else
            {
                System.out.println("\nThat is not a valid pathname. Try again.");
                this.promptDirectoryContents();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // OPTION 3
    public void promptExtension()
    {
        System.out.println("Enter the desired extension.");
        String tempExt = input.nextLine();

        this.setExtension(tempExt);
        this.findAllWithExtension("/users");
    }

    // OPTION 4
    public void promptFileName()
    {
        System.out.println("Enter the name of the desired file.");
        String tempFileName = input.nextLine();

        this.setFileName(tempFileName);
        this.findAllWithName("/users");
    }

    // OPTION 5
    public void promptCombineFiles()
    {
        System.out.println("Enter the name of the first file to combine.");
        this.setFirstFileName(input.nextLine());

        System.out.println("Enter the name of the second file to combine.");
        this.setSecondFileName(input.nextLine());

        System.out.println("Enter the name of the new file to be created.");
        String newFile = input.nextLine();

        this.combineFiles("/users", newFile);
    }


    // OPTIONS 1 & 2
    public void listContent(String temp, Boolean wantRecursive)
    {
        try
        {
            File f = new File(temp);

            File[] myFileArray = f.listFiles();

            for(File item : myFileArray)
            {
                if(item.isDirectory())
                {
                    System.out.println("Directory: " + item.getName());

                    if(wantRecursive)
                    {
                        this.listContent(item.getAbsolutePath(), true);
                    }
                }

                else
                {
                    System.out.println("File: " + item.getName());
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }


    // OPTION 3
    public void findAllWithExtension(String path)
    {
        try
        {
            File dir = new File(path);

            File[] myFileArray = dir.listFiles();


            for(File item : myFileArray)
            {
                if(item.isDirectory())
                {
                    this.findAllWithExtension(item.getAbsolutePath());
                }

                else if(item.isFile() && item.getName().endsWith(this.getExtension()))
                {
                    System.out.println(item.getCanonicalPath());
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // OPTION 4
    public void findAllWithName(String startingDirectory)
    {
        try
        {
            File dir = new File(startingDirectory);

            File[] myFileArray = dir.listFiles();


            for(File item : myFileArray)
            {
                if(item.isDirectory())
                {
                    this.findAllWithName(item.getAbsolutePath());
                }

                else if(item.isFile() && item.getName().equals(this.getFileName()))
                {
                    System.out.println(item.getCanonicalPath());
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // OPTION 5
    public void combineFiles(String path, String newFile)
    {
        try
        {
            File dir = new File(path);
            File[] myFileArray = dir.listFiles();


            for(File item : myFileArray)
            {
                if(item.isDirectory())
                {
                    this.combineFiles(item.getAbsolutePath(), newFile);
                }

                else if(item.isFile() && item.getName().equals(this.getFirstFileName()))
                {
                    this.setFileOneExists(true);
                }

                else if(item.isFile() && item.getName().equals(this.getSecondFileName()))
                {
                    this.setFileTwoExists(true);
                }

                if(this.getFileOneExists() && this.getFileTwoExists())
                {
                    try
                    {
                        BufferedReader br1 = new BufferedReader(new FileReader(this.getFirstFileName()));
                        BufferedReader br2 = new BufferedReader(new FileReader(this.getSecondFileName()));

                        PrintWriter pw = new PrintWriter(new FileOutputStream(newFile));

                        while(br1.readLine() != null)
                        {
                            pw.println(br1.readLine());
                        }

                        while(br2.readLine() != null)
                        {
                            pw.println(br2.readLine());
                        }

                        br1.close();
                        br2.close();
                        pw.close();
                    }
                    catch (Exception ex)
                    {
                        System.out.println("File not found.");
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public void setWantRecursive(Boolean value)
    {
        this.wantRecursive = value;
    }

    private void setExtension(String ext)
    {
        this.extension = ext;
    }

    private void setFileName(String name)
    {
        this.fileName = name;
    }

    private void setFileOneExists(Boolean exists)
    {
        this.fileOneExists = exists;
    }

    private void setFileTwoExists(Boolean exists)
    {
        this.fileTwoExists = exists;
    }

    private void setFirstFileName(String name)
    {
        this.firstFileName = name;
    }

    private void setSecondFileName(String name)
    {
        this.secondFileName = name;
    }

    private Boolean getWantRecursive()
    {
        return this.wantRecursive;
    }

    private String getExtension()
    {
        return this.extension;
    }

    private String getFileName()
    {
        return this.fileName;
    }

    private Boolean getFileOneExists()
    {
        return this.fileOneExists;
    }

    private Boolean getFileTwoExists()
    {
        return this.fileTwoExists;
    }

    private String getFirstFileName()
    {
        return this.firstFileName;
    }

    private String getSecondFileName()
    {
        return this.secondFileName;
    }
}
