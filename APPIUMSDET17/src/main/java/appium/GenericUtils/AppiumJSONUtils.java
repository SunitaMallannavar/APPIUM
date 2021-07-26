package appium.GenericUtils;

import java.io.FileReader;


public class AppiumJSONUtils {
	/*
	 * this method will return values based on json key
	 * @parameter json key
	 * return json value
	 * @throws throwable
	 */
	public String getdataFrom(String jsonkey)throws Throwable
	{
		//to read the data from json file
		FileReader reader=new FileReader(".Data\\appium.json");
		
		//parse the json object into java
		JSONParser parser=new JSONParser();
		Object object=parser.parse(reader);
		
		 //type cast the object into hashmap and read the data in key value format
		JSONObject jsonobject=(JSONObject)object;
		String value=jsonobject.get(jsonkey).toString();
		return value;
	}

}

}
