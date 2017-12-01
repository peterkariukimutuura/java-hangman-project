import org.junit.*;
import static org.junit.Assert.*;

public class hangmanTest{


    @Test
    public static void CheckUserInput(String Username){
        
        Boolean status;
        if (Username.equals(null)||Username.equals("")) {
            System.out.println("Username is required"); 
        }else{
            System.out.println(Username + " was added");
        }
        assertEquals("Name", Username);
        
    }


}