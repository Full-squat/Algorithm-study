package algorithm;

import java.util.LinkedList;

public class Main {
	
	
	public static void main(String[] args) {
		long num = 626331;
		long cnt = 0;
		long answer = 0;
		while(num!=1) {
			if(cnt==500) {
                answer = -1;
                System.out.println(answer);
                System.out.println("check");
                break;
            }
			if(num%2==0) {
				num/=2;
			}else if(num%2==1){
				num= num*3+1;
				
				
			}
			System.out.println(num);
			cnt+=1;
		}//while
        answer = cnt;
        System.out.println(answer);
		
		
		
	}//main
	
}//Main