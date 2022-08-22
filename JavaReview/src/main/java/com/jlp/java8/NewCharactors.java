package com.jlp.java8;

import java.util.Arrays;


/**
 * java8有哪些特性？
 * @author Administrator
 *
 */
public class NewCharactors {

	public static void main(String[] args) {
		
	}
	
	

	public void  lambda(){
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
		    System.out.print( e );
		    System.out.print( e );
		} );
		
		String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );
	}
}
