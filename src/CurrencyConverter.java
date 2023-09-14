package Currency.CurrencyCoverter;

import java.io.IOException;
	import java.math.BigDecimal;
	import java.util.Scanner;

	import org.json.JSONObject;

	import okhttp3.OkHttpClient;
	import okhttp3.Request;
	import okhttp3.Response;

	public class CurrencyConverter {
	  
		public static void main(String[] args) throws IOException 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Type currency to covert from:");
		    String convertFrom = sc.nextLine();
		    
		    System.out.println("Type currency to covert To:");
		    String convertTo = sc.nextLine();
		    
		    System.out.println("Amount!");
		    BigDecimal Amount = sc.nextBigDecimal();
		    
		  String url = "https://api.exchangerate.host/latest?base=" + convertFrom.toUpperCase();
		
		 OkHttpClient client = new OkHttpClient();
		 Request request = new Request.Builder()
	         .url(url) 
	         .get() 
		     .build();
		 
		 Response response = client.newCall(request).execute();
		 
		 String stringResponse = response.body().string();
		 JSONObject jsonObject = new JSONObject(stringResponse);
		 JSONObject ratesObject = jsonObject.getJSONObject("rates") ;
		 BigDecimal rate = ratesObject.getBigDecimal(convertTo.toUpperCase());
		 
		 
		 BigDecimal result = rate.multiply(Amount) ;
		 System.out.println("The result of conversion amount is:" +(result));
		 
		} 
	}


