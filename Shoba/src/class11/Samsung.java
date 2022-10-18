
package class11;

public class Samsung implements SmartPhone {
	public void videocall(String call) {
		
	}
	public void voicecall(String calls) {
		
	}
	public void connectivity(String conn) {
		
	}
	public void  cameraFunction(String tapping) {
		switch(tapping) {
		case "singletap" : System.out.println("Taking Picture"); 
		break;
		case "Doubletap" : System.out.println("Zooming");
		break;
		case "Continous" : System.out.println("Continous Pictures");
		break;
	}
	}

}

