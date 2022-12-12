package SerializationCloning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		try (ObjectOutputStream objStreamOut = new ObjectOutputStream(new FileOutputStream("EmployeeData.txt"));
				ObjectInputStream objStreamIn = new ObjectInputStream(new FileInputStream("EmployeeData.txt"));) {
			
			EmployeeDTO eDTO = new EmployeeDTO("1234", "John","SE",3);
			
			objStreamOut.writeObject(eDTO);
			
			EmployeeDTO emp = (EmployeeDTO) objStreamIn.readObject();
			
			System.out.println(emp);
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
