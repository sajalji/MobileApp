package webPage;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Test {

	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebClient web=new WebClient(BrowserVersion.CHROME);
		web.getOptions().setJavaScriptEnabled(true);
		/*HtmlPage page=web.getPage("http://cpnos.ev-chargepoint.com");
		String s1=page.asText();
		System.out.println(s1);*/
		HtmlPage page=web.getPage("http://www.wiki.com");
		String s2=page.asText();
		System.out.print(arg0);
	    //char diff=(char)s1.compareTo(s1);
	   // System.out.println(diff);
		
		
	}

}
