package entities;

import org.testng.Assert;

public class BaseResponse {

    private int httpStatusCode;

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public void verifyStatusCode(int statusCode){
        Assert.assertEquals(httpStatusCode,statusCode);
    }


}
