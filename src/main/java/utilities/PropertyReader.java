package utilities;

import io.restassured.RestAssured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    Properties prop = new Properties();

    public PropertyReader() {
        try {
            File Src = new File("src/main/resources/config.properties");
            FileInputStream fileInputStream = new FileInputStream(Src);

            prop.load(fileInputStream);
        }catch(Exception e){
            System.out.println("error occured :"+e.getMessage());
        }
    }

    public String getHost(){
        return prop.getProperty("host");
    }
}
