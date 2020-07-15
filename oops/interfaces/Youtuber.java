package oops.interfaces;

public abstract interface Youtuber extends VideoEditor {
	
	int x = 6;
	
	abstract void makeVideo();
	
	default void uploadVideo() {
		System.out.println("upload the video");
	}

}
