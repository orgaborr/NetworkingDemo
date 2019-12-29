package com.orgabor;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class NWDemoMain {

	public static void main(String[] args) {
		try {
//			URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
			URI baseUri = new URI("http://username:password@myserver.com:5000");
			URI uri1 = new URI("/catalogue/phones?os=android#samsung");
			URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
			URI uri3 = new URI("/stores/locations?zip=12345");
			
			URI resolvedUri1 = baseUri.resolve(uri1);
			
			URL url1 = resolvedUri1.toURL();
			System.out.println("URL = " + url1);
			
		} catch(URISyntaxException e) {
			System.out.println("Bad URI Syntax: " + e.getMessage());
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		}
	}

}
