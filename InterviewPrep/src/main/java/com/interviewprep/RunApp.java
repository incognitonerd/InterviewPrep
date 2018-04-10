package com.interviewprep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import com.interviewprep.consumedarksky.DarkskyResponse;
import com.interviewprep.consumegoogle.Results;
import com.interviewprep.misc.Random;
import com.interviewprep.services.Services;

@SpringBootApplication
public class RunApp extends SpringBootServletInitializer {
	public static void main(String[] args){
		SpringApplication.run(RunApp.class, args);
		RunApp r = new RunApp();
		r.restCalls();
		r.random();
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(RunApp.class);
	}
	
	public void random(){
		Random r = new Random();
		System.out.println("sum in sumOnlyMultiples - " + r.sumOnlyMultiples(1000, 3, 5));
		r.statistics('B');
		System.out.println("\n\n");
		r.multiples();
		String path = "//Users//Argos//Documents//workspace//Refresher//randomText.txt";
		r.numOfLines(path);
		r.numOfWords(path);
		r.numOfChars(path);
		System.out.println(r.stairs(10));
	}
	
	public void restCalls(){
		Services s = null;
		Results r = null;
		DarkskyResponse rpnse = null;
		try{
			s = new Services();
			r = s.consumeGoogle("30088");
			System.out.println(r.getFormatted_address());
			System.out.println(r.getGeometry().getLocation().getLat() + ", " + r.getGeometry().getLocation().getLng());
			for(int i = 1; i < 30; i++){
				rpnse = s.consumeDarksky(r.getGeometry().getLocation());
				System.out.println(rpnse.getTimezone());
				System.out.println(rpnse.getCurrently().getTemperature());
				System.out.println(i + "\t- " + rpnse.getCurrently().getSummary());
			}
		} catch(Exception e){
			System.out.println("hit the breaks");
		}
	}
}
