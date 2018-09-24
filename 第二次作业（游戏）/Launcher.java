import java.util.Scanner;
import java.util.Random;
class Play{
	int num;
	int guess(){
		Random rand=new Random();
		num=rand.nextInt(10);//得到0到9的随机数，存到num中
		return num;
	}
}

class Game extends Play{
	Play play1=new Play();
	Play play2=new Play();
	Play play3=new Play();//初始化三个play对象
	int guess(){
		Random rand=new Random();
		num=rand.nextInt(10);
		return num;
	}
	
	public void startGame(){
		int num1=play1.guess();
		int num2=play2.guess();
		int num3=play3.guess();//调用Play中的方法			
		int player[]={num1,num2,num3};//将三个随机数存放到数组中
		int i;
		int sum=0;//猜数成功次数
		for(i=0;i<3;i++){
			System.out.println("Please input one number:");
			Scanner input=new Scanner(System.in);
		    int a;
		    a=input.nextInt();//用户输入三个数
			if(a==player[i])
				sum++;
		}
		System.out.println("The three random numbers are "+num1+" "+num2+" "+num3);
		System.out.println("Yon win "+sum+" time!");
	}
}

public class Launcher extends Game{
	
	public static void main(String args[]){
		Game game=new Game();//初始化game对象
		game.startGame();//调用Game中的方法
	}
}