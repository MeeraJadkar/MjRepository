package com.assignment3.ForLoop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 11;
		boolean flag = true;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}	
		}
			if(!flag) {
				System.out.println("The specified number is not prime");
			}else {
				System.out.println("The specified number is prime");
			}
			
		}
		

	}

