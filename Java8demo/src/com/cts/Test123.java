package com.cts;

	import java.util.Arrays;
	import java.util.IntSummaryStatistics;
	import java.util.List;
	import java.util.Random;
	import java.util.function.Predicate;
	import java.util.stream.Collectors;
	@FunctionalInterface
	 interface Add
	{    public int getSum(int a,int b);
	}
	@FunctionalInterface
	 interface Display {
	    public String show();    
	 }
	public class Test123 {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Add add1 =( a,  b) ->  a+b ;
	        System.out.println(add1.getSum(5, 6));
	        Add add2=(a,b) ->a*a+b*b;
	        
	        System.out.println(add2.getSum(5, 6));
	        
	        Display d= () -> "Lamda without argument ";
	        
	       System.out.println(d.show());
	       
	       List<String> words =  Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
	       
	       System.out.println(" for each with lambda");
	       words.forEach( n -> System.out.println(n));
	       
	    }      
}
