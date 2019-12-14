package com.corejavainreviewspgrms;

public class MissingNum {

	public static void main(String[] args) {
		// its only applicable to single number missing
		int []a= {1,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=0;j<=6;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		System.out.println("missing num:"+(sum1-sum));
	}

}
