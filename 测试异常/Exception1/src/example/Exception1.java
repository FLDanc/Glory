package example;

import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Exception1 {
	public Exception1(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) throws ParseException{
		Exception1 dateformat=new Exception1(("yyyy-MM-dd"));
		List<Date>list=new ArrayList<>(10);
		for(int cnt=0;cnt<10;cnt++){
			try{
				Date date=dateformat.parse("09-12");
				list.add(date);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	private Date parse(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
