package com.test;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class TT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String utf8 = "content:未授权的用户或已过期用户，请您购买服务。";
		try {
			System.out.println(utf8ToBig5(utf8));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String utf8ToBig5(String inputStr)throws Exception{
	      StringBuffer result = new StringBuffer();
	      CharsetEncoder enc = Charset.forName("Big5").newEncoder();
	  
	      for(int i=0; i<inputStr.length(); i++){
	          char c = inputStr.charAt(i);
	          String utf8 = String.valueOf(c);
	  
	          int ansi = (int)c;
	          if(!enc.canEncode(c)){
	              utf8 = "&'||chr(35)||'" + ansi + ";";
	          }
	          result.append(utf8);
	      }
	  
	      return result.toString() ;
	  }
}
