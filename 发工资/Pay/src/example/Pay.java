/*
 * ��˾��Ա��employee������manager���ɶ�shareholders���ֽ�ɫ
 * ÿ����ɫ������name������pay������birthday������
 * ÿ��15�շ����ʣ���ͨemployee��������pay��
 * manager���˹��ʣ����е��½���award
 * ��˾������profitΪ��Ӫҵ��turnover��������㣩��ȥȫ�깤��֧��
 * �ɶ�shareholders�йɷ�share��û�е��½��𣬵������շֺ�dividends
 * ���շֺ�Ϊȫ�������10%��ȫ���ɶ����չɷݷֺ죨�ɷݺ�С�ڵ���100%��
 * ÿ�·�����ʱ��Ҫ���������յ�Ա���;�������
 * 
 * Ա����Ϣ�ڳ�������ʱ����
 * ��Ҫ�������������µĹ������û��涨
 * ������Ϣ���ʱ������Ա���������ɶ���˳�����
 */

//�ļ��޷��رգ��Ҳ���Ӧ�����ɵ�Person.txt
//�ɶ��ֺ�������
package example;
import java.util.Date;
import java.util.Random;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;


public class Pay {
	public static void main(String args[]) {
		//--------д���ĵ�--------
		
		//System.out.println("��������Ա����Ϣ�� ");
		Person person=new Person();
		person.txt();
		
		//--------Ա��--------
		//Scanner input=new Scanner(System.in);
		//System.out.println("����Ա���������� ");
		
		//System.out.println("������ҹ��ʵ���ݣ� ");
		
		//System.out.println("������ҹ��ʵ��·ݣ� ");
		//int i;
		//i=input.nextInt();
		/*
		System.out.println("----------");
		System.out.println("���Ա����ÿ���¹��ʣ�");//ֻ�й���	
		Employee employee =new Employee();
		employee.emmonthpay();
		
		//System.out.println("���"+"  "+"�µĹ��ʣ�");//��һ�µĹ���
		
		//--------����--------
		System.out.println("\n----------");
		System.out.println("��������ÿ���¹��ʣ�");//���ʺͽ���
		Manager manager=new Manager();
		manager.mamonthpay();
		System.out.println("\n��������ÿ���½���");
		manager.award();
		
		//System.out.println("���"+"  "+"�µĹ��ʣ�");//��һ�µĹ���
		
		//--------�ɶ�--------
		System.out.println("\n----------");
		System.out.println("����ɶ��ķֺ죺");//���շֺ�
		Shareholders shareholders=new Shareholders();
		shareholders.dividends();
		*/
	}
}//�������

//----����----
class Person{
	private String name;
	private boolean pay;
	private Date birthday;
	private long[] mp;
	
	
	public Person() {
		super();
	}
	public Person(String name,boolean pay,Date birthday) {
		super();
		this.name=name;
		this.pay=pay;
		this.birthday=birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public boolean getPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay=pay;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday=birthday;
	}
	
	public static int random() {
		Random rand=new Random();
		int num=rand.nextInt(1500)%(1500-1000+1)+1000;//1000��1500�������
		return num;
	}
	
	
	
	/*public static int monthpay() {	
		int []mp=new int [12];
		int i;
		for(i=0;i<12;i++) {
			 mp[i]=random();
			}
		return mp[i];
	}//�õ�ÿ�¹���
	*/
	public int opmonthpay() {
		//int mp1=random();
		
		int []mp=new int [12];
		int i;
		for(i=0;i<12;i++) {
		 mp[i]=random();
		}
		
		//int []mp=new int [12];
		//Person person=new Person();
		//person.monthpay();
		System.out.println("Every month pay is :"+Arrays.toString(mp));
		System.out.println("������ҹ��ʵ��·ݣ� ");
		Scanner input=new Scanner(System.in);
		//int i;
		i=input.nextInt();
		System.out.println("�� "+i+" ���µĹ����� "+mp[i-1]);
		//List<Pay> listPay;
		//listPay = new ArrayList<>();	
		return mp[i];
	}//���ÿ�¹��ʣ��������
	
	public void gift() {
		//��ʱ������
	}
	
	public void txt() {
		/*
		System.out.println("������Ա����Ϣ������������");
		Scanner sc=new Scanner(System.in);
		//ʵ����ɨ�����
		String input=sc.next();
		//Scanner.sc=new Scanner(System.in);
		//String str=sc.next();
		File f=new File("D:\\Study\\s\\workplace\\������\\Person.txt");
		FileOutputStream fos=null;
		try {
			fos =new FileOutputStream(f);
			fos.write(input.getBytes());
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		/*
		System.out.println("������Ա����Ϣ������������");
		Scanner sc=new Scanner(System.in);
		//ʵ����ɨ�����
		String input=sc.next();
		while(sc.hasNext()) {
			
			//String input=sc.next();
			//�õ���������
			if(input.equals("end")) {
				break;
			}//����û�����end�����
		}
		*/
		
		try {
			File f=new File("D:\\Study\\s\\workplace\\������\\Person.txt");
			FileOutputStream fop=new FileOutputStream(f);
			//����FileOutputStream�����ļ������ڻ��Զ��½�
			OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
			//����OutputStreamWriter����
			System.out.println("��������Ա����Ϣ�� ");
			System.out.println("����\t����");
			//writer.append("����\t����");
			
			//writer.append("\t");
			//writer.append("�¹���");
			//д�뻺����
			//writer.append("\r\n");
			//����
			//writer.append("");
			//ˢ�»��壬д�뵽�ļ������ �����Ѿ�û��д������ݣ�ֱ��closeҲ��д��
			
			Scanner sc=new Scanner(System.in);
			//ʵ����ɨ�����
			//String input=sc.next();
			String name =sc.next();
			BigDecimal birthday=sc.nextBigDecimal();//��������
			writer.close();
			//�ر�д������ͬʱ��ѻ���������д���ļ�
			fop.close();
			//�ر���������ͷ�ϵͳ��Դ
			
			FileInputStream fip=new FileInputStream(f);
			//����FileInputStream����
			InputStreamReader reader =new InputStreamReader(fip,"UTF-8");
			//����InputStreamReader���󣬱�����д����ͬ
			
			StringBuffer sb=new StringBuffer();
			//ʵ�������������ڴ���������
			while(reader.ready()) {
				sb.append((char)reader.read());
				//ת��char�ӵ�StringBuffer������
			}
			System.out.println(sb.toString());
			reader.close();
			//�رն�ȡ��
			
			fip.close();
			//�ر����������ͷ�ϵͳ��Դ
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int evesumpay() {
		int sum=0;
		int i=0;		
		//int []mp=new int[12];
		int mp=opmonthpay();//ֻ��õ���
		for(i=0;i<12;i++) {
			sum=sum+mp;
		}
		return sum;
	}
}//�¹��ʺͣ��깤�ʣ�

//----Ա���̳и���----
class Employee extends Person{
	private String name;
	private boolean pay;
	private Date birthday;
	public Employee() {
		super();
	}
	Person person=new Person();
	public int emtxt() {
		person.txt();
		return 0;
	}
	public int emmonthpay() {		
		int e=person.opmonthpay();
		return e;
	}
	public int emsumpay() {
		int esum=person.evesumpay();
		return esum;
	}
}//Ա��

//----����̳и���----
class Manager extends Person{
	private String name;
	private boolean pay;
	private Date birthday;
	public Manager() {
		super();
	}
	Person person=new Person();
	public void matxt() {
		person.txt();
	}
	public int  mamonthpay() {
		int m=person.opmonthpay();
		return m;
	}
	public int masumpay() {
		int msum=person.evesumpay();
		return msum;
	}
	public int award() {	
		int aw[]=new int [12];
		int i;
		Random rand=new Random();
		//Manager manager=new Manager();
		for(i=0;i<12;i++) {
			aw[i]=rand.nextInt(500)%(500-100+1)+100;
		}
		//int pa=manager.mamonthpay();			
		//int aw;
		//aw=pa/10;//������Ϊ���ʵİٷ�֮ʮ
		System.out.println("Every month award is :"+Arrays.toString(aw));
		System.out.println("������ҽ�����·ݣ� ");
		Scanner input=new Scanner(System.in);
		i=input.nextInt();
		System.out.println("�� "+i+" ���µĽ����� "+aw[i-1]);
		return aw[i];
	}//ÿ�½���
	
	public int sumaward() {
		int i;
		int awsum=0;
		int aw=award();
		for(i=0;i<12;i++) {
			awsum=awsum+aw;
		}
		return awsum;
	}//ȫ�꽱���
}//����

class Cost{
	public  int cost() {
		int Sum;
		Manager manager=new Manager();
		int sum1=manager.masumpay();//����ȫ�깤�ʺ�
		int sum2=manager.sumaward();//����ȫ�꽱���
		Employee employee =new Employee();
		int sum3=employee.emsumpay();//Ա��ȫ�깤�ʺ�
		Sum=sum1+sum2+sum3;
		//ȱ����sum4
		return Sum;
	}
	
}

class Profit{
	Random rand=new Random();
	//int tu; 	
	int tu=rand.nextInt(100000)%(100000-80000+1)+80000;
	//turnoverӪҵ��,8����10��
	public int profit() {
		int pr;//������
		int c;//�湤�ʣ���������ĺ�
		Cost cost=new Cost();
		c=cost.cost();
		pr=tu-c;
		return pr;
	}
}//����


class Shareholders{
	public int dividends() {
		int div;//�ֺ� dividends
		int pro;//�����
		Profit profit=new Profit();
		pro=profit.profit();
		div=(int) (pro*0.1);
		return div;
	}//�ɶ����շֺ�
	
}//�ɶ�

