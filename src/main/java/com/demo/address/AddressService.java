package com.demo.address;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Service
public class AddressService {
  public String fetchLocation() {
    RestTemplate restTemplate = new RestTemplate();
    String json = restTemplate.getForEntity("https://npiregistry.cms.hhs.gov/api?version=2.1&number=1487385589", 
                                            String.class).getBody();
    Gson gson = new Gson();
    JsonObject rootJsonObject = gson.fromJson(json, JsonObject.class);
    JsonArray resultArray = rootJsonObject.getAsJsonArray("results");
    for (JsonElement jsonElement : resultArray) {
        JsonArray addressObjects = jsonElement.getAsJsonObject().get("addresses").getAsJsonArray();
        for (JsonElement addressObject : addressObjects) {
          
          String addressPurpose = addressObject.getAsJsonObject().get("address_purpose").getAsString();
            if(addressPurpose.equals("LOCATION")){
              return addressObject.getAsJsonObject().get("address_1").getAsString();
            }
        }
    }
    return "";
  }
}
