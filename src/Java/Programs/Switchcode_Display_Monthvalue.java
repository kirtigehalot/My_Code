package Java.Programs;

public class Switchcode_Display_Monthvalue {

	public static void main(String[] args) {
		// To write a switch code to display value of month
		
		int month = 1;
		
		String month_string ;
		switch(month) {
		
		case 1 : month_string = "january";
		break;
		
		case 2 :month_string = "february";
		break;
		
		case 3 : month_string = "march";
		break;
		
		case 4 :month_string = "april";
		
		break;
		
		case 5 : month_string = "may";
		
		break;
		
		case 6 : month_string = "june";
		break;
		
		
		case 7 : month_string = "july";
		break;
		
		case 8 :month_string = "august";
		break;
		
		case 9 : month_string = "september";
		break;
		
		case 10 :month_string = "october";
		
		break;
		
		case 11 : month_string = "november";
		
		break;
		
		case 12 : month_string = "december";
		break;
		
		
		default : month_string = "invalid month";
		
		}
		System.out.println(month_string);
		
		

	}

}
