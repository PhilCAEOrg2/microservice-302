package i5.las2peer.services.mensa;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class Dish {

    public Dish() {}
    
    private String name;

    public void setname(String setValue) {
        this.name = setValue;
    }

    public String getname() {
        return this.name;
    }
    private String description;

    public void setdescription(String setValue) {
        this.description = setValue;
    }

    public String getdescription() {
        return this.description;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("name", this.name); 
        jo.put("description", this.description); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.name = (String) jsonObject.get("name"); 
        this.description = (String) jsonObject.get("description"); 

    }

}

    
}
