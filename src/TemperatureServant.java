import TemperatureApp._TemperatureImplBase;

@SuppressWarnings("serial")
public class TemperatureServant extends _TemperatureImplBase{

	@Override
	public String showTemperature() {
		return "\n The current temperature is: 22 C";
	}

	@Override
	public String setTemperature() {
		
		return "\n The temperature has been set to: 23 C.";
	}
}
