import Method.*;
import org.testng.annotations.Test;

public class TestClass {
    GetService gs=new GetService();
    PostService ps=new PostService();


    @Test(priority = 1)
    public void test1() {
            ps.createToken("admin","password123",200);
//            ps.createToken("admin","password234",400);
    }

    @Test(priority = 2)
    public void test2(){
        gs.getBookingIds();
    }

    @Test(priority = 3)
    public void test3(){
        PutService puts=new PutService();
        puts.updateBooking("Kuldeep","Pawar",617);
    }

    @Test(priority = 4)
    public void test4(){
        PatchService patchs=new PatchService();
        patchs.patchUpdateBooking(100,"Pawar",617);
    }

    @Test(priority = 5)
    public void test5(){
        DeleteService ds=new DeleteService();
        ds.deleteBooking(903);
    }

    @Test(priority = 6)
    public void test6() {
        CreateTokenDeleteBooking ctdb=new CreateTokenDeleteBooking();
        ctdb.createToken1("admin","password123",200,970);
//            ps.createToken("admin","password234",400);
    }

    @Test(priority = 7)
    public void test7(){
        ps.createBooking("Virat","Kohli");
        gs.getBooking(618);
        gs.getBookingIds("Chris");
        gs.getBookingIds1("Brown");
    }

}
