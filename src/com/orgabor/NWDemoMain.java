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
			URI uri = new URI("/catalogue/phones?os=android#samsung");
			URI resolvedUri = baseUri.resolve(uri);
			
			System.out.println("Scheme = " + uri.getScheme());
			System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
			System.out.println("Authority = " + uri.getAuthority());
			System.out.println("User info = " + uri.getUserInfo());
			System.out.println("Host = " + uri.getHost());
			System.out.println("Port = " + uri.getPort());
			System.out.println("Path = " + uri.getPath());
			System.out.println("Query = " + uri.getQuery());
			System.out.println("Fragment = " + uri.getFragment());
			
			System.out.println("\n");
			
			URL url = resolvedUri.toURL();
			System.out.println("URL = " + url);
			
		} catch(URISyntaxException e) {
			System.out.println("Bad URI Syntax: " + e.getMessage());
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		}
	}

}
