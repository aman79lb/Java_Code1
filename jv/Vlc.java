// VLC (process, program)
 class Vlc   {
	public static void main(String args[]) {
		Vlc t = new Vlc();
		t.Execute();
	//Video.playVideo();  // ok it works
    //Music.playMusic();   // ok it works
   
      
	}
	
	void Execute(){
		Video.playVideo();
		Music.playMusic();
	}
	
}
class Video {
	static void playVideo() {
		System.out.println("Playing video right now.");
		
	}
}
class Music {
	static void playMusic() {
		System.out.println("Playing music right now.");
	}
}