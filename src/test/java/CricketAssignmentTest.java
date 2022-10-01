import client.CricketAssignment;
import org.testng.annotations.Test;

public class CricketAssignmentTest {
 CricketAssignment cricketAssignment = new CricketAssignment();



 @Test
 public void CricketAssignment() throws Exception {
   cricketAssignment.NoOfForiegnPlayer();
   cricketAssignment.ValidateWicketKeeper();

 }


}
