package utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadJson {

    static JSONObject jsonDataFromJsonFile = new JSONObject();

    public static JSONObject jsonSetup(String jsonFile) throws Exception {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(jsonFile));
        JSONObject jsonObject = (JSONObject)obj;
        return jsonObject  ;
    }
}
