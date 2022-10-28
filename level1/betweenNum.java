package algorithm;

import java.util.LinkedList;

public class Main {
	
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		int temp = 0;
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        } else if(a==b){
        }
        
        long answer = 0;
        
        for(int i = a; i<=b;i++){
            answer +=i;
        }

		
		
		
	}//main
	
}//Main