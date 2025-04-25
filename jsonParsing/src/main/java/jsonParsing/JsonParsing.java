package jsonParsing;

public class JsonParsing {
	public static void main(String[] args) {
		String json = "{\"name\":\"Rohit\",\"age\":26}";
		
		String parsed = json.replace("{", "").replace("}","");
		String[] arr = parsed.split(",");
		
		for(String s : arr) {
			String[] keyValue = s.split(":");
			String key = keyValue[0].replace("\"","");
			String value = keyValue[1].replace("\"","").trim();
			
			System.out.println(key +" => "+ value);
		}
		
		String multiline = """
						{
							"name": "Rohit".
							"age": "24"
						}
				 """;
	}
}
