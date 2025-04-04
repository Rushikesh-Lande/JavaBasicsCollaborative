// write the java program file opening and closed using using try and catch and finally block 
import java.io.IOException;
 public class FileReaderException {
public static void main(String[] args) 
{     
try {
system.out.println("open file");
throw new IOException("file not found");
} catch (IOException e) 
{
System.out.println("details: " + e.getMessage());

} finally 
{
System.out.println("Closing file...");
}
}
}