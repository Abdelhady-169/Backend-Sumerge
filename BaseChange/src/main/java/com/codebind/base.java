package com.codebind;
import org.apache.commons.codec.binary.*;

public class base {
	String string = "Hello folks how are you doing today?"; //original text
	Base64 base64=new Base64();
	String encodedText= new String(base64.encode(string.getBytes())); //encodes the text
	String decodedText= new String(base64.decode(encodedText.getBytes())); //decodes the encoded
	
	public String getString() {
		return string;
	}
	
	public String Encoded() {
		return encodedText;
	}
	
	public String Decoded() {
		return decodedText;
	}
	
	public static void main(String[] args) {
		base newApp = new base();
		
		//system print out all text (original,encoded,and decoded)
		System.out.println("Original: "+newApp.getString());
		System.out.println("Encoded (Base64): "+newApp.Encoded());
		System.out.println("Decoded (Base64): "+newApp.Decoded());
	}
}
