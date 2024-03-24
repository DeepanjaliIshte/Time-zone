package timeZone;

import java.sql.Date;

public class StringToSQLDateExample {
		public static void main(String[] args) {
		String str="2024-03-24";
		Date date=Date.valueOf(str);//converting string into sql date
		System.out.println(date);
		}
		}


