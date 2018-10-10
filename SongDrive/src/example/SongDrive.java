package example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class SongDrive {
	public static void main(String args[]) throws InterruptedException{
		Master master=new Master();
		Player player =new Player();
		
		//用户点歌，加入到待播放列表
		Song song = player.addSong();
		master.addSong(song);
		
		System.out.println("测试完毕..................");
		//主持播放指定歌曲（只有该歌曲在列表中才会成功）
		master.play("烟花易冷");
		
		System.out.println("测试完毕.................");
		
		//主持播放列表中所有歌曲
		master.play();
	}
}

class Song{
	public String songName;
	public String singer;
	public double time;
    public Song	(){
		super();
	}
	public Song(String songName,String singer,double time){
		super();
		this.songName=songName;
		this.singer=singer;
		this.time=time;
	}
	
	public String getName(){
		return songName;
	}
	public void setName(String songName){
		this.songName=songName;
	}
	
	public String getSinger(){
		return singer;
	}
	public void setSinger(String singer){
		this.singer=singer;
	}
	
	public double getTime(){
		return time;
	}
	public void setTime(double time2){
		this.time=time2;
	}
}

class Master{
	
	static List<Song> listSong;
	public Master(){
		listSong =  new ArrayList<>();
		
		Song song1 = new Song("FlowersDance","A",5.0);
		Song song2 = new Song("烟花易冷","jaychou",4);
		Song song3 = new Song("告别气球","jaychou",4.2);
		
		listSong.add(song1);
		listSong.add(song2);
		listSong.add(song3);

	}
	
	public void addSong(Song song){
		this.listSong.add(song);
		
		System.out.println("你的歌曲已经加入播放列表...");
	}
	public boolean play() throws InterruptedException{
		if(listSong!=null){
			
			for(Song song : listSong){
				
				System.out.println(song.getName() + "正在播放...");
				Thread.sleep(5000);
				System.out.println(song.getName() + "播放完毕");
				
			}
			return true;
		}
		else 
			return false;
	}
	
	public boolean play(String songName) throws InterruptedException{
		
		for(Song song: listSong){
			
			if(song.getName().equals(songName)){
				System.out.println(songName + "正在播放...");
				Thread.sleep(3000);
				System.out.println(songName + "播放完毕.");
				return true;
			}
		}
		
		System.out.println("待 播放列表如下：");
		for(Song song: listSong){
			System.out.println(song.getName());
		}
		System.out.println("该歌曲不在播放列表中...");
		return true;
		
	}
}

class Player{
	
	
	public Song addSong(){
		
		Scanner input=new Scanner(System.in);
		
		Song song = new Song();
		System.out.println("请输入你要点的歌");
		System.out.println("请输入歌名");
		String name = input.next();
		System.out.println("请输入歌手");
		String singer = input.next();
		System.out.println("请输入时长");
		double time = input.nextDouble();
		
		song.setName(name);
		song.setSinger(singer);
		song.setTime(time);
		
		return song;
	}

}
