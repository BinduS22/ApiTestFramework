package client;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;

import static utilities.ReadJson.jsonSetup;

public class CricketAssignment {
    String jsonFile = "src/main/resources/CricketAssignment.json";


    int count =0;

    public void NoOfForiegnPlayer() throws Exception {

        JSONObject jsonObject =jsonSetup(jsonFile);
        JSONArray player = (JSONArray) jsonObject.get("player");

        for(int i=0;i<player.size();i++){

            JSONObject pobj= (JSONObject) player.get(i);
            String country =pobj.get("country").toString();
            if(!country.equalsIgnoreCase("india"))
            count++;
            System.out.println("count of foreigners" +count);
            if (count > 4) {
                Assert.fail("Team has more than 4 Foreign Players");
            }

        }
        }

    public void ValidateWicketKeeper() throws Exception {

        JSONObject jsonObject =jsonSetup(jsonFile);
        JSONArray player = (JSONArray) jsonObject.get("player");
        for(int i=0;i<player.size();i++){

            JSONObject robj = (JSONObject) player.get(i);
            String role = robj.get("role").toString();
            System.out.println("role found  is " + role);
            if (role.equalsIgnoreCase("wicket-keeper"))
                count++;
            System.out.println("count of wicket keepers" + count);
            if (count < 1) {
                Assert.fail("Team has no wicket keepers");
            }
        }


    }
}
