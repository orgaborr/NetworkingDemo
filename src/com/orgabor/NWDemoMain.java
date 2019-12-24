package com.orgabor;

import java.net.URI;
import java.net.URISyntaxException;

public class NWDemoMain {

	public static void main(String[] args) {
		try {
			URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=androidamsung");
			
			System.out.println("Scheme = " + uri.getScheme());
			System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
			System.out.println("Authority = " + uri.getAuthority());
			System.out.println("User info = " + uri.getUserInfo());
			System.out.println("Host = " + uri.getHost());
			System.out.println("Port = " + uri.getPort());
			System.out.println("Path = " + uri.getPath());
			System.out.println("Query = " + uri.getQuery());
			System.out.println("Fragment = " + uri.getFragment());
			
		} catch(URISyntaxException e) {
			System.out.println("Bad URI Syntax: " + e.getMessage());
		}
	}

}
