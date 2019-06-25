import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SMSLanguage {
	
	public String translate(String text) {

		return 		text.replaceAll("[\\.,?!]","")
				.toLowerCase()
				.replaceAll("and","&")
				.replaceAll("ate","8")
				.replaceAll("at","@")
				.replaceAll("you","U")
				;
	}
}
