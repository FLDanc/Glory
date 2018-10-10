package example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class SongDrive {
	public static void main(String args[]) throws InterruptedException{
		Master master=new Master();
		Player player =new Player();
		
		//�û���裬���뵽�������б�
		Song song = player.addSong();
		master.addSong(song);
		
		System.out.println("�������..................");
		//���ֲ���ָ��������ֻ�иø������б��вŻ�ɹ���
		master.play("�̻�����");
		
		System.out.println("�������.................");
		
		//���ֲ����б������и���
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
		Song song2 = new Song("�̻�����","jaychou",4);
		Song song3 = new Song("�������","jaychou",4.2);
		
		listSong.add(song1);
		listSong.add(song2);
		listSong.add(song3);

	}
	
	public void addSong(Song song){
		this.listSong.add(song);
		
		System.out.println("��ĸ����Ѿ����벥���б�...");
	}
	public boolean play() throws InterruptedException{
		if(listSong!=null){
			
			for(Song song : listSong){
				
				System.out.println(song.getName() + "���ڲ���...");
				Thread.sleep(5000);
				System.out.println(song.getName() + "�������");
				
			}
			return true;
		}
		else 
			return false;
	}
	
	public boolean play(String songName) throws InterruptedException{
		
		for(Song song: listSong){
			
			if(song.getName().equals(songName)){
				System.out.println(songName + "���ڲ���...");
				Thread.sleep(3000);
				System.out.println(songName + "�������.");
				return true;
			}
		}
		
		System.out.println("�� �����б����£�");
		for(Song song: listSong){
			System.out.println(song.getName());
		}
		System.out.println("�ø������ڲ����б���...");
		return true;
		
	}
}

class Player{
	
	
	public Song addSong(){
		
		Scanner input=new Scanner(System.in);
		
		Song song = new Song();
		System.out.println("��������Ҫ��ĸ�");
		System.out.println("���������");
		String name = input.next();
		System.out.println("���������");
		String singer = input.next();
		System.out.println("������ʱ��");
		double time = input.nextDouble();
		
		song.setName(name);
		song.setSinger(singer);
		song.setTime(time);
		
		return song;
	}

}
