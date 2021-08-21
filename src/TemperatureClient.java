import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.omg.CORBA.ORB;

import TemperatureApp.Temperature;
import TemperatureApp.TemperatureHelper;

public class TemperatureClient {

	public static void main(String[] args) {
		
		ORB orb = ORB.init(args, null);
		
		
		//read the remote object ref from file
		
		//get reference to ORB
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("TemperatureIOR"));
			
			//read the IOR from string contained in a file
			String ior = br.readLine();
			
			//get the CORBA object
			org.omg.CORBA.Object obj = orb.string_to_object(ior);
			
			//need to convert the object to the correct type/interface
			Temperature temperature = TemperatureHelper.narrow(obj);
			
			//making the invocation
			String responseShow = temperature.showTemperature();
			String responseSet = temperature.setTemperature();
			
			System.out.println(responseShow);
			System.out.println(responseSet);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
