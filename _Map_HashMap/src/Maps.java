import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap<String, Integer>  empId = new HashMap<>();
		HashMap<Integer, String>  e = new HashMap<>();

		empId.put("Sansa", 1);
		empId.put("Kofil", 2);
		empId.put("Gulfam", 3);
		System.out.println(empId.get("Sansa"));

	
		e.put(1, "Sansa");
		e.put(2, "Kofil");
		e.put(3, "Gulfam");
		System.out.println(e.get(2));
		System.out.println(e.containsKey(3));
		System.out.println(e.containsKey(4));
		System.out.println(e.containsValue("nishu"));

	}

}
