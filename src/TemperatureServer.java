import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.omg.CORBA.ORB;

public class TemperatureServer {

	public static void main(String[] args) {
		
		//getting reference to ORB
		ORB orb = ORB.init(args, null);
		
		//initialize the TemperatureServant
		TemperatureServant servant = new TemperatureServant();
		
		//associate/connect servant to ORB
		orb.connect(servant);
		
		//trying to explicitly activate remote objects via an object reference
		String ior = orb.object_to_string(servant);
		
		System.out.println("ior :" + ior);
		
		try {
			
			FileOutputStream fos = new FileOutputStream("TemperatureIOR");
			
			PrintStream ps = new PrintStream(fos);
			
			ps.print(ior);
			
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("server should be running");
		
		//blocking - wait for request
		orb.run();
	}
}
