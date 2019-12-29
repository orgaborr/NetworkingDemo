package com.orgabor;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class NWDemoMain {

	public static void main(String[] args) {
		try {
//			URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
			URI baseUri = new URI("http://username:password@myserver.com:5000");
			URI uri1 = new URI("/catalogue/phones?os=android#samsung");
			URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
			URI uri3 = new URI("/stores/locations?zip=12345");
			
			List<URI> uriList = new ArrayList<>();
			uriList.add(uri1);
			uriList.add(uri2);
			uriList.add(uri3);
			
			
			
			URI resolvedUri1 = baseUri.resolve(uri1);
			
			URL url1 = resolvedUri1.toURL();
			System.out.println("URL = " + url1);
			
		} catch(URISyntaxException e) {
			System.out.println("Bad URI Syntax: " + e.getMessage());
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		}
	}
	
	public static URI resolveUri(URI baseUri, URI uriToBeResolved) {
		return baseUri.resolve(uriToBeResolved);
	}

}
