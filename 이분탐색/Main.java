package algorithm;

import java.util.LinkedList;

public class Main {
	
	
	public static void main(String[] args) {
		int n = 15;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1; i<=n;i++){
            if(i%2==1) list.add(i);
        }//for
		
		for (Integer i : list) {
			System.out.print(i+", ");
			
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=list.get(i);
			
		}
		System.out.println();
		for (int i : answer) {
			System.out.print(i+" ");
		}
		
		
	}//main
	
}//Main