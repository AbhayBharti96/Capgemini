package PolyMorphismAssigment;

import java.util.Scanner;

class MediaFiles{
	void play() {
		
	}
}
class AudioFiles extends MediaFiles{
void play() {
		System.out.println("Audio is Playing..");
	}
}
class VideoFile extends MediaFiles{
void play() {
		System.out.println("Video is Playing..");
	}
}
class Podcast extends MediaFiles{
void play() {
		System.out.println("Podcast is Playing..");
	}
}


public class Solution06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Preference out of [AUDIO||VIDEO||PODCAST]");
		String a = s.nextLine().toUpperCase();
		MediaFiles m;
		switch(a) {
		case "AUDIO":
			m= new AudioFiles();
			break;
		case "VIDEO":
			m = new VideoFile();
			break;
		case "PODCAST":
			m = new Podcast();
			break;
			default:
				System.out.println("Invalid choice.");
				m= new Podcast();
		}
		System.out.println("----- Track Playing ------");
		m.play();
	}

}
