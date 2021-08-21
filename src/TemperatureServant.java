import TemperatureApp._TemperatureImplBase;

@SuppressWarnings("serial")
public class TemperatureServant extends _TemperatureImplBase{

	@Override
	public String showTemperature() {
		
		//Display the current temprature
		return "\n The current temperature is: 22 C";
	}

	@Override
	public String setTemperature() {
		
		//Set the new environment temperature
		return "\n The temperature has been set to: 23 C.";
	}
}
