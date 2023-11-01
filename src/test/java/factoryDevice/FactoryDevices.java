package factoryDevice;

public class FactoryDevices {

    public static IDevice make(String deviceType){
        IDevice device;
        switch (deviceType.toLowerCase()){
            case "ios":
                device= new Ios();
                break;
            case "firefoxos":
                device = new FireFoxOS();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}

