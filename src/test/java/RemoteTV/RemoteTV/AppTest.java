package RemoteTV.RemoteTV;


import static org.junit.Assert.assertEquals;

public class AppTest{

/*Providing some tests*/
 public static void main(String... args){
	 new AppTest().lower();
	 new AppTest().upper();
	 new AppTest().mixed();
	 System.out.println("Test finished with no errors");
	 
 }
  
 // @Test
  public void lower() {
    assertEquals(16,  RemoteTV.tvRemote("does"));
    assertEquals(23,  RemoteTV.tvRemote("your"));
    assertEquals(33,  RemoteTV.tvRemote("solution"));
    assertEquals(20,  RemoteTV.tvRemote("work"));
    assertEquals(12, RemoteTV.tvRemote("for"));
    assertEquals(27,  RemoteTV.tvRemote("these"));
    assertEquals(25,  RemoteTV.tvRemote("words"));
  }
  
  //@Test
  public void upper() {
    assertEquals(27,  RemoteTV.tvRemote("DOES"));
    assertEquals(26,  RemoteTV.tvRemote("YOUR"));
    assertEquals(38,  RemoteTV.tvRemote("SOLUTION"));
    assertEquals(23,  RemoteTV.tvRemote("WORK"));
    assertEquals(21,  RemoteTV.tvRemote("FOR"));
    assertEquals(32,  RemoteTV.tvRemote("THESE"));
    assertEquals(28, RemoteTV.tvRemote("WORDS"));
  }
  
 // @Test
  public void mixed() {
    assertEquals(40,  RemoteTV.tvRemote("Does"));
    assertEquals(37,  RemoteTV.tvRemote("Your"));
    assertEquals(49,  RemoteTV.tvRemote("Solution"));
    assertEquals(30,  RemoteTV.tvRemote("Work"));
    assertEquals(28,  RemoteTV.tvRemote("For"));
    assertEquals(41,  RemoteTV.tvRemote("These"));
    assertEquals(35,  RemoteTV.tvRemote("Words"));
  }

}
