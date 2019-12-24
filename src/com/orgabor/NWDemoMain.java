package com.orgabor;

import java.net.URI;
import java.net.URISyntaxException;

public class NWDemoMain {

	public static void main(String[] args) {
		try {
			URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=androidamsung");
		} catch(URISyntaxException e) {
			System.out.println("Bad URI Syntax: " + e.getMessage());
		}
	}

}
