package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
    
    public static String url = "https://dsportalapp.herokuapp.com/";
    public static String homepageUrl = "https://dsportalapp.herokuapp.com/home";
    public static String signinUrl = "https://dsportalapp.herokuapp.com/login";
    public static String registerUrl = "https://dsportalapp.herokuapp.com/register";
	
	public static String username = "algo_tester";
	public static String password = "ds_algo27";
	
	public static void initializeOption()
	{
		System.out.println("in base class....");
		
	}
}
