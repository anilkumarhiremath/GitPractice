package Demo.com;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**************************Count the repeated characters using HashMap*************************************
		System.out.println("**********Count the repeated characters using HashMap***********");
		
		String input = "Anilkumar Hiremath anil@gmail.com";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		for(char mapChar: map.keySet()) {
			if(map.get(mapChar)>1) {
				System.out.println(mapChar+" : "+map.get(mapChar));
			}
		}
		
		
		//**************************Validate Email*************************************
				System.out.println("**********Validate Email***********");
				
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(regex);
		String[] split = input.split(" ");
		
		for(String st : split) {
			Matcher matcher = pattern.matcher(st);
			if(matcher.matches()) {
				System.out.println(st+" is "+"Valid mail");
			}
//			}else {
//				System.out.println(st+" is "+"Invalid mail");
//			}
		}
		
//**************************next nearest largest number*************************************
		System.out.println("**********next nearest largest number***********");
		int num = 218677;
		System.out.println("input : "+num);
		String numString = Integer.toString(num);
		char[] charArray = numString.toCharArray();
		
		String tn = "";
		int index = 0;
		
		for(int i=charArray.length-1; i>0; i--) {
				
			if(charArray[i-1]<charArray[i]) {
				char tc = charArray[i-1];
				tn = charArray[i]+tn;
				tn = tn+tc;
				index = i-1;
				break;
			}
			else if(charArray[i-1] == charArray[i]) {
				
			}
			else {
				tn = tn+charArray[i];
			}
		}
//		System.out.println(tn);
		String num1 = "";
		for(int i=0; i<index; i++) {
			
			num1 += numString.charAt(i);
		}
		
		String num2 = num1+tn;
		int largestNum = Integer.parseInt(num2);
		System.out.println("output : "+largestNum);
	}
}
