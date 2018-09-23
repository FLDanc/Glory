
import java.util.Scanner;
 class Car1{
	public String name;
	public int tank;
	public double oilConsumption;
	//public boolean gas;
	//public boolean run;
	
    public Car1() 
    {
    	super();
    }

    public Car1(String name,int tank,double oilConsumption)
    {
    	super();
    	this.name = name;
    	this.tank = tank;
    	this.oilConsumption = oilConsumption;
    }
    
    public String getName()
    {
    	return name;
    }
	
    public void setName()
    {
    	this.name= name;
    }

    public int getTank()
    {
    	return tank;
    }
    
    public void setTank()
    {
    	this.tank= tank;
    }
    
    public double getoilConsumption()
    {
    	return oilConsumption;
    }
    
    public void setoilConsumption()
    {
    	this.oilConsumption = oilConsumption;
    }
    
    public void gas(int tank)
    {
    	this.tank += tank;
    }
    public void run()
    {
    	if(tank < oilConsumption) {
    		System.out.println("需要加油");
    	}else {
    		System.out.println("能开");
    	} 	
    }   
}

public class Car {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Car1[] cars = new Car1[3];
		
		Car1 c1 = new Car1();
		System.out.println("请依次输入第一辆车名字，油量，油耗：");
		c1.name= input.next();
		c1.tank=input.nextInt();
		c1.oilConsumption=input.nextDouble();
		
		System.out.println("请依次输入第二辆车名字，油量，油耗：");
		Car1 c2 = new Car1();
		c2.name= input.next();
		c2.tank=input.nextInt();
		c2.oilConsumption=input.nextDouble();
		
		System.out.println("请依次输入第三辆车名字，油量，油耗：");
		Car1 c3 = new Car1();
		c3.name= input.next();
		c3.tank=input.nextInt();
		c3.oilConsumption=input.nextDouble();
		
		cars[0]=c1;
		cars[1]=c2;
		cars[2]=c3;
		for (int i = 0; i < cars.length; i++) 
        {	   
            Car1 c = cars[i];
            System.out.println("序号:" + i + " 名字:" + c.getName() + " 油箱容量"+c.getTank()+" 油耗"+c.getoilConsumption());
            c.run();
        }

	}
}
