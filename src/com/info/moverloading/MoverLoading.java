package com.info.moverloading;
class MoverLoadingDemo{
	public static void MoverLoadingDemo(int a, int b, int c) {
		System.out.println("Number of parameters in arguement list");
	}
	public static void MoverLoadingDemo(int a, String b, char c, double d) {
		System.out.println("Sequence of data types in arguement list");
	}
	public static void MoverLoadingDemo(int a, String b) {
		System.out.println("Difference of data types in arguement list");
	 }
}
public class MoverLoading extends MoverLoadingDemo{
 public static void main(String[] args) {
	 MoverLoadingDemo(2,"abc",'a',10.5);
	 MoverLoadingDemo(2,2,2); 	
	 MoverLoadingDemo(2,"abcdef");
 }
}
