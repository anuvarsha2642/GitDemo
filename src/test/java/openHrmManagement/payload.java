package openHrmManagement;

public class payload {

	public static String addPlace()
	{
		String payload="{\r\n" + 
				"    \"location\": {\r\n" + 
				"        \"latitude\": \"-38.383494\",\r\n" + 
				"        \"longitude\": \"33.427362\"\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\": \"50\",\r\n" + 
				"    \"name\": \"Frontline house\",\r\n" + 
				"    \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"    \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"    \"types\": \"shoe park,shop\",\r\n" + 
				"    \"website\": \"http://google.com\",\r\n" + 
				"    \"language\": \"French-IN\"\r\n" + 
				"}";
		return payload;
	}
}
