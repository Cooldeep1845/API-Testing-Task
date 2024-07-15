package Method;
import API.RestfulBooker;
import io.restassured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetService {

    public void getBookingIds(){
        given().baseUri(RestfulBooker.Base.getUrl())
                .when().get(RestfulBooker.Booking.getUrl())
                .then().assertThat().statusCode(200).log().all();
    }

    public void getBookingIds(String firstname){
        given().baseUri(RestfulBooker.Base.getUrl())
                .queryParam("firstname",firstname)
                .contentType("application/json")
                .when().get(RestfulBooker.Booking.getUrl())
                .then().assertThat().statusCode(200).log().all();
    }

    public void getBookingIds1(String lastname){
        given().baseUri(RestfulBooker.Base.getUrl())
                .queryParam("lastname",lastname)
                .when().get(RestfulBooker.Booking.getUrl())
                .then().assertThat().statusCode(200).log().all();
    }

    public void getBookingIds2(String checkin){
        given().baseUri(RestfulBooker.Base.getUrl())
                .queryParam("checkin",2014-03-13).
                when().get(RestfulBooker.Booking.getUrl())
                .then().assertThat().statusCode(200).log().all();
    }

    public void getBooking(int id){
        given().baseUri(RestfulBooker.Base.getUrl())
                .when().get(RestfulBooker.Booking.getUrl()+"/"+id)
                .then().assertThat().statusCode(200).log().all();
    }
}
