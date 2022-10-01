package client;

import entities.GetSingleUserApiResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Reporter;
import properties.endPoints;

import javax.swing.*;

import static io.restassured.RestAssured.given;

public class GetSingleUserApi {

    public GetSingleUserApiResponse getSingleUserTest(){

        Reporter.log(String.format("\n get single user url --- GET %s",endPoints.getUserUrl),true);
        Response response = given()
                .contentType(ContentType.JSON)
                .get(endPoints.getUserUrl);
        Reporter.log(String.format("\n single user response status code --%s",response.statusCode(),true));

        Reporter.log(String.format("\n single user response-- %s",response.asString()),true);
        GetSingleUserApiResponse getSingleUserApiResponse = response.as(GetSingleUserApiResponse.class); // this is to convert api json response to java class response
        getSingleUserApiResponse.setHttpStatusCode(response.getStatusCode());
        return getSingleUserApiResponse;
    }

}
