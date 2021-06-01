package apiTesting;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AptTest {
	@Test
	  public void getFunction() {
		  Response resp=get("https://reqres.in/api/users/2");
		  resp.prettyPrint();
		  System.out.println(resp.getStatusCode());
		  System.out.println(resp.getTime());
	  }
	  
	  @Test
	  public void postFunction() {
		  //location of file with body
		  File dataFile=new File(System.getProperty("user.dir")+"\\src\\test\\java\\apiTesting\\Post.json");
		  	  //next pass url, request, raw, json
		  Response dt=given().contentType(ContentType.JSON).body(dataFile).post("https://reqres.in/api/users/1");
				  dt.prettyPrint();
				  System.out.println(dt.getStatusCode());
				  System.out.println("the time is "+dt.getTime()); 
		  
	  }
}
