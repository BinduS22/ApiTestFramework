import client.GetSingleUserApi;
import entities.GetSingleUserApiResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiAutomationTests {

    GetSingleUserApi getSingleUserApi = new GetSingleUserApi();

    @Test
    public void getSingleUserTest(){
        GetSingleUserApiResponse responsetest = getSingleUserApi.getSingleUserTest();
        Assert.assertEquals(responsetest.getHttpStatusCode(),200);
    }

}
