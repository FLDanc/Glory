/*
 * 公司有员工employee，经理manager，股东shareholders三种角色
 * 每个角色有姓名name，工资pay，生日birthday等属性
 * 每月15日发工资，普通employee仅发工资pay，
 * manager除了工资，还有当月奖金award
 * 公司的利润profit为总营业额turnover（随机运算）减去全年工资支出
 * 股东shareholders有股份share，没有当月奖金，但有年终分红dividends
 * 年终分红为全年利润的10%，全部股东按照股份分红（股份和小于等于100%）
 * 每月发工资时，要给当月生日的员工和经理发礼物
 * 
 * 员工信息在程序启动时输入
 * 将要发的是哪年哪月的工资由用户规定
 * 工资信息输出时，按照员工，经理，股东的顺序输出
 */

//文件无法关闭，找不到应该生成的Person.txt
//股东分红有问题
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
		//--------写入文档--------
		
		//System.out.println("输入所有员工信息： ");
		Person person=new Person();
		person.txt();
		
		//--------员工--------
		//Scanner input=new Scanner(System.in);
		//System.out.println("输入员工的姓名： ");
		
		//System.out.println("输入查找工资的年份： ");
		
		//System.out.println("输入查找工资的月份： ");
		//int i;
		//i=input.nextInt();
		/*
		System.out.println("----------");
		System.out.println("输出员工的每个月工资：");//只有工资	
		Employee employee =new Employee();
		employee.emmonthpay();
		
		//System.out.println("输出"+"  "+"月的工资：");//哪一月的工资
		
		//--------经理--------
		System.out.println("\n----------");
		System.out.println("输出经理的每个月工资：");//工资和奖金
		Manager manager=new Manager();
		manager.mamonthpay();
		System.out.println("\n输出经理的每个月奖金：");
		manager.award();
		
		//System.out.println("输出"+"  "+"月的工资：");//哪一月的工资
		
		//--------股东--------
		System.out.println("\n----------");
		System.out.println("输出股东的分红：");//年终分红
		Shareholders shareholders=new Shareholders();
		shareholders.dividends();
		*/
	}
}//输出工资

//----父类----
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
		int num=rand.nextInt(1500)%(1500-1000+1)+1000;//1000到1500的随机数
		return num;
	}
	
	
	
	/*public static int monthpay() {	
		int []mp=new int [12];
		int i;
		for(i=0;i<12;i++) {
			 mp[i]=random();
			}
		return mp[i];
	}//得到每月工资
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
		System.out.println("输入查找工资的月份： ");
		Scanner input=new Scanner(System.in);
		//int i;
		i=input.nextInt();
		System.out.println("第 "+i+" 个月的工资是 "+mp[i-1]);
		//List<Pay> listPay;
		//listPay = new ArrayList<>();	
		return mp[i];
	}//输出每月工资，随机生成
	
	public void gift() {
		//暂时不考虑
	}
	
	public void txt() {
		/*
		System.out.println("请输入员工信息：姓名，生日");
		Scanner sc=new Scanner(System.in);
		//实例化扫描对象
		String input=sc.next();
		//Scanner.sc=new Scanner(System.in);
		//String str=sc.next();
		File f=new File("D:\\Study\\s\\workplace\\发工资\\Person.txt");
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
		System.out.println("请输入员工信息：姓名，生日");
		Scanner sc=new Scanner(System.in);
		//实例化扫描对象
		String input=sc.next();
		while(sc.hasNext()) {
			
			//String input=sc.next();
			//得到输入数据
			if(input.equals("end")) {
				break;
			}//如果用户输入end则结束
		}
		*/
		
		try {
			File f=new File("D:\\Study\\s\\workplace\\发工资\\Person.txt");
			FileOutputStream fop=new FileOutputStream(f);
			//构建FileOutputStream对象，文件不存在会自动新建
			OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
			//构建OutputStreamWriter对象
			System.out.println("输入所有员工信息： ");
			System.out.println("姓名\t生日");
			//writer.append("姓名\t生日");
			
			//writer.append("\t");
			//writer.append("月工资");
			//写入缓冲区
			//writer.append("\r\n");
			//换行
			//writer.append("");
			//刷新缓冲，写入到文件，如果 下面已经没有写入的内容，直接close也会写入
			
			Scanner sc=new Scanner(System.in);
			//实例化扫描对象
			//String input=sc.next();
			String name =sc.next();
			BigDecimal birthday=sc.nextBigDecimal();//生日类型
			writer.close();
			//关闭写入流，同时会把缓冲区内容写入文件
			fop.close();
			//关闭输出流，释放系统资源
			
			FileInputStream fip=new FileInputStream(f);
			//构建FileInputStream对象
			InputStreamReader reader =new InputStreamReader(fip,"UTF-8");
			//构建InputStreamReader对象，编码与写入相同
			
			StringBuffer sb=new StringBuffer();
			//实例化缓冲区用于存输入数据
			while(reader.ready()) {
				sb.append((char)reader.read());
				//转成char加到StringBuffer对象中
			}
			System.out.println(sb.toString());
			reader.close();
			//关闭读取流
			
			fip.close();
			//关闭输入流，释放系统资源
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int evesumpay() {
		int sum=0;
		int i=0;		
		//int []mp=new int[12];
		int mp=opmonthpay();//只想得到数
		for(i=0;i<12;i++) {
			sum=sum+mp;
		}
		return sum;
	}
}//月工资和（年工资）

//----员工继承父类----
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
}//员工

//----经理继承父类----
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
		//aw=pa/10;//奖金设为工资的百分之十
		System.out.println("Every month award is :"+Arrays.toString(aw));
		System.out.println("输入查找奖金的月份： ");
		Scanner input=new Scanner(System.in);
		i=input.nextInt();
		System.out.println("第 "+i+" 个月的奖金是 "+aw[i-1]);
		return aw[i];
	}//每月奖金
	
	public int sumaward() {
		int i;
		int awsum=0;
		int aw=award();
		for(i=0;i<12;i++) {
			awsum=awsum+aw;
		}
		return awsum;
	}//全年奖金和
}//经理

class Cost{
	public  int cost() {
		int Sum;
		Manager manager=new Manager();
		int sum1=manager.masumpay();//经理全年工资和
		int sum2=manager.sumaward();//经理全年奖金和
		Employee employee =new Employee();
		int sum3=employee.emsumpay();//员工全年工资和
		Sum=sum1+sum2+sum3;
		//缺礼物sum4
		return Sum;
	}
	
}

class Profit{
	Random rand=new Random();
	//int tu; 	
	int tu=rand.nextInt(100000)%(100000-80000+1)+80000;
	//turnover营业额,8万至10万
	public int profit() {
		int pr;//存利润
		int c;//存工资，奖金，礼物的和
		Cost cost=new Cost();
		c=cost.cost();
		pr=tu-c;
		return pr;
	}
}//利润


class Shareholders{
	public int dividends() {
		int div;//分红 dividends
		int pro;//利润和
		Profit profit=new Profit();
		pro=profit.profit();
		div=(int) (pro*0.1);
		return div;
	}//股东年终分红
	
}//股东

