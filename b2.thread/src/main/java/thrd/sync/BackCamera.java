package thrd.sync;

import thrd.service.CameraResource;

public class BackCamera extends Thread{  // bank//PHONEPE
	CameraResource cam;

	public BackCamera(CameraResource cam) {
		super();
		this.cam = cam;
	}
	
	@Override
	public void run() {
		CameraResource.timer(10);  // class level Lock
		//cam.timer(10);			//object level lock
		
		}
	
}
