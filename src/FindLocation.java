import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class FindLocation {
	private String coordinates;
	private int time;
	private int distance;
	
	public FindLocation(){
		time = 0;
		distance = 0;
		coordinates = "";
	}
	
	public void findCoordinates(String location) throws IOException{
		String webURL = "https://maps.googleapis.com/maps/api/geocode/json?address=";
	    URL loc = new URL(webURL);
	    URLConnection yc = loc.openConnection();
	    BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	    
	    String inputLine;
	    int count = 0;
	    while ((inputLine = in.readLine()) != null && count < 2){
	        if(inputLine.contains("lat") || inputLine.contains("lng")){
	        	if(inputLine.contains("lat")){
	            	String latitude = inputLine.substring(23);
	            	coordinates = latitude;
	        	}
	        	else{
	            	String longitude = inputLine.substring(23);
	            	coordinates.concat(longitude);
	        	}
	        	count++;
	        }
	    }
	    in.close();
	}
	
	public void findDistanceTime(String origin, String destination) throws IOException{
    	String webURL = "https://maps.googleapis.com/maps/api/distancematrix/json?";
    	String originRaw = "origin=" + origin;
    	String destRaw = "&destination=" + destination;
    	
    	//Create URL string
    	webURL.concat(originRaw);
    	webURL.concat(destRaw);
    	
    	URL url = new URL(webURL);
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
        int count = 0;
        while((inputLine = in.readLine()) != null){
        	if(inputLine.contains("value") && count == 0){
        		System.out.println("Distance = " + inputLine.substring(28));
        		distance = Integer.parseInt(inputLine.substring(28));
        		count++;
        	}
        	else if(inputLine.contains("value") && count == 1){
        		System.out.println("Time = " + inputLine.substring(28));
        		time = Integer.parseInt(inputLine.substring(28));
        		count++;
        	}
        	
        }
	}
}
